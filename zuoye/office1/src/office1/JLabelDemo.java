package office1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JLabelDemo {
		JFrame frame = new JFrame("JLabel Demo");
		JLabel label1,label2,label3,label4,label5;
		
		public static void main(){
			JLabelDemo ld= new JLabelDemo();
			ld.go();
		}

		public void go() {
			// TODO Auto-generated method stub
			label1 = new JLabel("only text label");
			label2 = new JLabel("right label",JLabel.RIGHT);
			
			ImageIcon icon = new ImageIcon("dukeWaveRed.gif");
			
			label3= new JLabel(icon);
			label3.setVerticalAlignment(JLabel.BOTTOM);
			
			label4 = new JLabel("Image and Text",
					icon,
					JLabel.LEFT);
			label4.setVerticalAlignment(JLabel.TOP);
			
			label4.setVerticalTextPosition(JLabel.BOTTOM);
			label4.setHorizontalTextPosition(JLabel.CENTER);
			
			label5 = new JLabel("Input your name here");
			JTextField nameField = new JTextField(12);
			
			JPanel panel= new JPanel();
			panel.add(label5);
			panel.add(nameField);
			
			JPanel panel2 = new JPanel();
			panel2.setLayout(new GridLayout(3,1));
			panel2.add(label1);
			panel2.add(label2);
			panel2.add(panel);
			
			Container cp = frame.getContentPane();
			cp.setLayout(new GridLayout(3,1));
			cp.add(panel2);
			cp.add(label3);
			cp.add(label4);
			
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(300, 350);
			frame.setVisible(true);
		}
}
