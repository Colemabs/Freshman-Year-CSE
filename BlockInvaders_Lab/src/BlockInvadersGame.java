
// Section: F
// Group Members: Ben Coleman Adam Lopata
//
//
// 

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class BlockInvadersGame extends JPanel {

	private JFrame window = new JFrame("Block Invaders 1.0");
	private Timer tmr;
	private int TIMER_SPEED = 30;

	// Create your Fighter object here
	Fighter fighter = new Fighter("galaga.png", 4, 300, 500,
									60, 120, false, true); 
	// Create an arraylist of blocks
	ArrayList<Block> blocks = new ArrayList<Block>();
	
	// Create an arraylist of bullets
	ArrayList<Bullet> bullets = new ArrayList<Bullet>();
	
	public BlockInvadersGame() {

		window.setBounds(100, 50, 600, 600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setAlwaysOnTop(true);
		window.setResizable(false);
		window.add(this);
		window.setVisible(true);

		//createBlockInvaders(10);
		// Set a static screen width on your Block class so blocks know when to switch sides
		//done
		
		// Take care of the mouse click
		addMouseListener(new MouseListener() {
			@Override
			public void mousePressed(MouseEvent e) {
				// The mouse button was clicked...  Only allow 4 bullets on the screen at once
				
				if(bullets.size() < 4){
					Bullet b = new Bullet(0, 7, 24, 8, fighter.getHeight(), fighter.getWidth()/2);
					bullets.add(b);
					
				}
			}
			@Override public void mouseReleased(MouseEvent e) {}
			@Override public void mouseExited(MouseEvent e) {}
			@Override public void mouseEntered(MouseEvent e) {}
			@Override public void mouseClicked(MouseEvent e) {}
		});

		addMouseMotionListener(new MouseMotionListener() {

			@Override
			public void mouseMoved(MouseEvent e) {
				// The move was moved to update your Fighter's 'x' position
				fighter.setLocation(e.getX(), e.getY());
			}

			@Override public void mouseDragged(MouseEvent e) {}
		});



		// Create the timer
		tmr = new Timer(TIMER_SPEED, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// have each item that moves by the timer move here


				// remove any bullet that is off the screen


				// check for collision of remaining bullets and blocks


				// repaint the screen
				window.repaint();
			}
		});

		// Start the game
		tmr.start();
	}

	public void paint(Graphics g) {
		// Draw all blocks
		for(Block b : blocks){
			b.draw(g);
		}
		// Draw all bullets
		for(Bullet b : bullets){
			b.draw(g);
		}
		// Draw your fighter
		
	}


	// A method used to populate the ships you will be shooting at.
	// Make sure you randomly set their x position, direction, and speed
	public void createBlockInvaders(int num) {
		// Use the Random class - not Math.random()

	}



	public static void main(String[] args) {
		new BlockInvadersGame();
	}

}