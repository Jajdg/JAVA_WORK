package office1;
import java.awt.*;
import javax.swing.*;

public class ActionEventDemo2 {
	public static void main(String args[]){
		JFrame frame = new JFrame("ActionEvent Demo 2");
		MyButton b = new MyButton("Close");
		
		frame.getContentPane().add(b, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
}
