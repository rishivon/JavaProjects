import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JComboBox;

public class BasicSwing extends JFrame {

	JPanel panel = new JPanel();
	JButton button = new JButton("Hello");
	JTextField textField = new JTextField("This is a text field", 10); // Text, Columns
	JTextArea textArea = new JTextArea("First\nSecond\nThird\nFourth\nFifth", 5, 3); // Text, Rows, Columns
	JLabel label = new JLabel("Label");
	
	String choices[] = {"Pig", "Dog", "Cat", "Horse"} // Choices for the drop down box from JComboBox
;	JComboBox cb = new JComboBox(choices);
	public static void main(String[] args) {
		BasicSwing basic = new BasicSwing();

	}
	public BasicSwing() { //Constructor
		super("Basic Swing App");
		setSize(400, 300);	//400 wide and 300 high
		setResizable(true); //We can resize it
		
		panel.add(button); // add button to panel
		panel.add(textField);
		panel.add(textArea);
		panel.add(label);
		panel.add(cb);
		add(panel); // add panel to JFrame
		setVisible(true); // Makes the panel and button visible
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}