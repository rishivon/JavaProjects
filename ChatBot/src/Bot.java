import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Bot extends JFrame{
	private JTextArea Chatarea = new JTextArea();
	private JTextField chatbox = new JTextField();
	
	
	
	public Bot() {
		
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.setResizable(false);
		frame.setLayout(null);
		frame.setSize(600, 600);
		frame.setTitle("ChatBot");
		frame.add(Chatarea);
		frame.add(chatbox);
		
		// For text area
		Chatarea.setSize(500, 450);
		Chatarea.setLocation(2, 2);
		
		// For text field
		chatbox.setSize(500, 30);
		chatbox.setLocation(2, 500);
		
		chatbox.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				String gtext = chatbox.getText().toLowerCase();
				Chatarea.append("YOU: " + gtext + "\n");
				chatbox.setText("");
				
				if (gtext.contains("hello")) {
					bot("Wassup");
				}
				else {
					bot("I dont understand");
				}
			}
			
		});
		
	}
	private void bot(String string) {
		Chatarea.append("BOT: " + string + "\n");
	}
	
	
	public static void main(String[] args) {
		
		new Bot();

	}

}
