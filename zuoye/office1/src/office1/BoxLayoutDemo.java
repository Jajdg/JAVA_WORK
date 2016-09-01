package office1;

import java.awt.*;
import javax.swing.*;

public class BoxLayoutDemo {
	private JFrame frame;
	private JPanel pv,ph;
	
	public static void main(String args[]){
		BoxLayoutDemo that = new BoxLayoutDemo();
		that.go();
	}

	private void go() {
		// TODO Auto-generated method stub
		frame = new JFrame("Box Layout example");
		Container contentPane = frame.getContentPane();
		
		pv = new JPanel();
		
		pv.setLayout(new BoxLayout(pv,BoxLayout.Y_AXIS));
		
		pv.add(new JLabel("Monday"));
		pv.add(new JLabel("Tuseday"));
		pv.add(new JLabel("Wednesday"));
		pv.add(new JLabel("Thursday"));
		pv.add(new JLabel("Friday"));
		pv.add(new JLabel("Saturday"));
		pv.add(new JLabel("Sunday"));
		
		contentPane.add(pv, BorderLayout.CENTER);
		
		ph= new JPanel();
		
		ph.setLayout(new BoxLayout(ph,BoxLayout.X_AXIS));
		
		ph.add(new JButton("yes"));
		ph.add(new JButton("no"));
		ph.add(new JButton("cancel"));
		
		contentPane.add(ph,BorderLayout.SOUTH);
		
		frame.pack();
		frame.setVisible(true);
	}
}
