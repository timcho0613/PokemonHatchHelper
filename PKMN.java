import javax.swing.*;
import java.awt.*;

public class PKMN{
	
	//step 1 set up private variables
	
	private JFrame frame;
	private JPanel panel;
	private JButton button1;
	private JLabel label;

	//step 2 constructor

	public PKMN(){

		gui();
	}

	//step 3 initialize the variables

	public void gui(){
		// initializing the frame
		frame = new JFrame("frame is here");
		frame.setVisible(true);
		frame.setSize(600,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setBackground(Color.BLUE);

		button1 = new JButton("number one");
		label = new JLabel("pokemon hatching");

		panel.add(button1);
		panel.add(label);

		frame.add(panel);

	}

	public static void main(String[] args){
		//last step make PKMN();
		new PKMN();
	}
}