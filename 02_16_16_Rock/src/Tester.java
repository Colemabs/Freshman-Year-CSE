import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;


public class Tester extends JPanel{//can extend from JComponent

	public JFrame window = new JFrame("What Rocks....");
	public Timer tmr;
	public ArrayList<Rock> rocks = new ArrayList<Rock>();

	public Tester(){
		window.setBounds(100, 100, 500, 800);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//close the program when closing window
		window.setVisible(true);
		window.add(this);

		tmr = new Timer(20, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				//automatically adds one method
				for(Rock rock : rocks) rock.move();
				repaint();	
			}

		});

		this.addMouseListener(new MouseListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				for(Rock r: rocks){
					if(r.contains(e.getPoint())){
						Rock newRock = r.split();
						if(newRock != null)
							rocks.add(newRock);
						else
							rocks.remove(r);
							if(rocks.size() == 0){
								tmr.stop();
								repaint();
								JOptionPane.showMessageDialog(window, "Game Over...");
							}
						return;
					}
				}
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) { }

			@Override
			public void mouseExited(MouseEvent e) { }
			
			@Override
			public void mouseEntered(MouseEvent e) { }
			
			@Override
			public void mouseClicked(MouseEvent e) { }
		});
		
		
		addRocks(2);

		tmr.start();

	}



	private void addRocks(int count) {
		Random rnd = new Random();

		for(int i = 0; i < count; i++)
			rocks.add( new Rock(
									rnd.nextInt(getWidth()),
									rnd.nextInt(getHeight()),
									80,80,
									(rnd.nextBoolean() ? 1 : -1) * (rnd.nextInt(5) + 1),
									(rnd.nextBoolean() ? 1 : -1) * (rnd.nextInt(5) + 1),
									new Color(rnd.nextInt(256),rnd.nextInt(256),rnd.nextInt(256)),
									true
								) 
			);

	}

	@Override//control space bar to get this auto-generated method
		public void paint(Graphics g) {
			super.paint(g);
			Rock.sw = getWidth();
			Rock.sh = getHeight();
			for(Rock rock : rocks) rock.draw(g);
		}



	public static void main(String[] args) {
		new Tester();
	}

}
