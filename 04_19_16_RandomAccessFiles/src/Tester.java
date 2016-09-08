import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;







import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;







import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;




import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.SoftBevelBorder;


public class Tester extends JPanel {

	JFrame window = new JFrame("RAF Stuff");
	Timer tmr;
	ArrayList<Ball> balls = new ArrayList<Ball>();

	public Tester(){
		setBorder(new SoftBevelBorder(BevelBorder.LOWERED, null, null, null, null));
		setBounds(0, 0, 494, 400);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setBounds(100, 100, 500, 500);
		window.getContentPane().setLayout(null);
		window.getContentPane().add(this);     
		window.setResizable(false);
		window.setAlwaysOnTop(true);
		window.setVisible(true);
		setLayout(new BorderLayout(0, 0));

		JButton btnLoad = new JButton("Load");
		btnLoad.setBounds(10, 437, 89, 23);
		window.getContentPane().add(btnLoad);
		btnLoad.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		JButton btnSave = new JButton("Save");
		btnSave.setBounds(109, 437, 89, 23);
		window.getContentPane().add(btnSave);
		btnSave.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

			}
		});

		JButton btnAdd = new JButton("Add");
		btnAdd.setBounds(208, 437, 89, 23);
		window.getContentPane().add(btnAdd);
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				addBall();
			}
		});

		JButton btnQuit = new JButton("Quit");
		btnQuit.setBounds(307, 437, 89, 23);
		window.getContentPane().add(btnQuit);
		btnQuit.addActionListener(new ActionListener() {   
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		tmr = new Timer(20, new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				for(Ball b: balls) b.save();

				window.repaint();
			}
		});

		tmr.start();
		window.repaint();
	}

	public void paint(java.awt.Graphics g) {
		for(Ball b: balls){	b.draw(g);	}
	};

	public void addBall(){
		Random rnd = new Random();

		balls.add(new Ball(
				rnd.nextInt(getWidth()),
				rnd.nextInt(getHeight()), 
				rnd.nextInt(26) + 5,
				new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)),
				(rnd.nextInt(5) + 2) * (rnd.nextBoolean() ? 1 : -1),
				(rnd.nextInt(5) + 2) * (rnd.nextBoolean() ? 1 : -1),
				getWidth(),
				getHeight()

				)
				);
	}

	public void save(){
		RandomAccessFile raf = null;

		try {
			raf = new RandomAccessFile(new File("myBallList.bin"), "rw");

			for(Ball b: balls) b.save(raf); //save all the balls in the list 

		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {
			try {raf.close(); } catch (IOException e) {	}
		}
	}

	public void load(){
		RandomAccessFile raf = null;

		try {
			raf = new RandomAccessFile(new File("myBallList.bin"), "r");
			balls.clear();

			while(raf.getFilePointer() < raf.length()) {
				balls.add(new Ball(raf, getWidth(), getHeight() ));
			}


		} catch (Exception e) {

			System.out.println(e.getMessage());

		} finally {
			try {raf.close(); } catch (IOException e) {	}
		}
	}

	public static void main(String[] args){
		new Tester();
	}
}