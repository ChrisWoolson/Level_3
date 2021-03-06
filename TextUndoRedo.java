package Level3;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;




public class TextUndoRedo {
	
	 //* Create a JFrame with a JPanel and a JLabel.
	 

	// * Every time a key is pressed, add that character to the JLabel. It should look like a basic text editor.
	 public static void main(String[] args) {
		
		 JFrame frame = new JFrame();
		 JPanel panel = new JPanel();
		 JLabel label = new JLabel();
		 
		 frame.add(panel);
		 panel.add(label);
		 label.setText("Starting Text");
		 frame.pack();
		 frame.setVisible(true);
		frame.addKeyListener(new UndoListener(label));
	}
	// * Make it so that every time the BACKSPACE key is pressed, the last character is erased from the JLabel.
	// * Save that deleted character onto a Stack of Characters.
	 
	// * Choose a key to be the Undo key. Make it so that when that key is pressed, the top Character is popped 
	// * off the Stack and added back to the JLabel.
	 

	
}
