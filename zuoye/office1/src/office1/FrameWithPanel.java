package office1;
import java.awt.*;
import javax.swing.*;
public class FrameWithPanel {
	public static void main(String args[]){
		JFrame frame=new JFrame("JFrameWithPanel");
		Container contentPane=frame.getContentPane();
		contentPane.setBackground(Color.CYAN);
		
		JPanel panel=new JPanel();
		panel.setBackground(Color.yellow);
		
		JButton button=new JButton("Press me");
		panel.add(button);
		
		contentPane.add(panel,BorderLayout.SOUTH);
		panel.setSize(100,100);
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
}
