package office1;
import java.awt.*;
import javax.swing.*;
public class JFrameDemo {
	public static void main(String s[]){
		JFrame frame=new JFrame("JFrameDemo");
		JButton button=new JButton("press me");
		
		frame.getContentPane().add(button, BorderLayout.CENTER);
		
		frame.pack();
		frame.setVisible(true);
	}
}
