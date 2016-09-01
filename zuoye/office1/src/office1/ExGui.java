package office1;
import java.awt.*;
import javax.swing.*;
public class ExGui {
	private JFrame frame;
	private JButton b1;
	private JButton b2;
	
	public static void main(String s[]){
		ExGui that=new ExGui();
		that.go();
	}

	private void go() {
		frame=new JFrame("GUI example");
		Container contentPane=frame.getContentPane();
		
		contentPane.setLayout(new FlowLayout());
		
		b1=new JButton("Press me");
		b2=new JButton("Don't press Me");
		
		contentPane.add(b1);
		contentPane.add(b2);
		
		frame.pack();
		frame.setVisible(true);
	}
}
