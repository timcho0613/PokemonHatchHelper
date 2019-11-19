import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

/*class Tracker extends JPanel{

	
}*/

public class PKMN{
	
	public static boolean toggle1 = false;
	public static boolean toggle2 = false;
	public static boolean toggle3 = false;
	public static boolean toggle4 = false;
	public static boolean toggle5 = false;

	//step 1 set up private variables
	
	private JFrame frame;
	private JPanel panel;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JButton button5;
	private JLabel label;


	//step 2 constructor

	public PKMN(){

		gui();
	}

	//step 3 initialize the variables

	public void gui(){
		// initializing the frame
		frame = new JFrame("pokemon hatching");
		frame.setVisible(true);
		frame.setSize(300,200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel(new GridLayout(3,2,4,4));
		panel.setBackground(Color.YELLOW);

		button1 = new JButton("First Egg");
		button2 = new JButton("Second Egg");
		button3 = new JButton("Third Egg");
		button4 = new JButton("Fourth Egg");
		button5 = new JButton("Fifth Egg");
		label = new JLabel("  KEEP GOING KING  ❤");

		button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				button1.setBackground(Color.BLUE);
				button1.setOpaque(true);
				PKMN.toggle1 = true;
			};
		});
		button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				button2.setBackground(Color.BLUE);
				button2.setOpaque(true);
				PKMN.toggle2 = true;
			};
		});
		button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				button3.setBackground(Color.BLUE);
				button3.setOpaque(true);
				PKMN.toggle3 = true;
			};
		});
		button4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				button4.setBackground(Color.BLUE);
				button4.setOpaque(true);
				PKMN.toggle4 = true;
			};
		});
		button5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				button5.setBackground(Color.BLUE);
				button5.setOpaque(true);
				PKMN.toggle5 = true;
			};
		});

		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		panel.add(button5);
		panel.add(label);

		frame.add(panel);

		


	}

	public static void main(String[] args){
		//last step make PKMN();
		new PKMN();
		if(PKMN.toggle1 == true && PKMN.toggle2 == true && PKMN.toggle3 == true && PKMN.toggle4 == true && PKMN.toggle5 == true){
			System.exit(0);
		}
		//new Tracker();
		
	}
}