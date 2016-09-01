package office1;
import java.awt.*;
import javax.swing.*;

public class GlueAndStrut {
	private JFrame frame;
	private Box b1,b2,b3,b4;
	
	public static void main(String args[]){
		GlueAndStrut that = new GlueAndStrut();
		that.go();
	}

	private void go() {
		// TODO Auto-generated method stub
		frame = new JFrame("Glue and Strut example");
		Container contentPane= frame.getContentPane();
		contentPane.setLayout(new GridLayout(4,1));
		
		b1=Box.createHorizontalBox();
		b1.add(new JButton("Box1:"));
		b1.add(new JButton("yes"));
		b1.add(new JButton("no"));
		b1.add(new JButton("Cancel"));
		
		b2=Box.createHorizontalBox();
		b2.add(new JButton("Box2:"));
		b2.add(new JButton("yes"));
		b2.add(new JButton("no"));
		b2.add(Box.createHorizontalGlue());
		b2.add(new JButton("Cancel"));
		
		b3=Box.createHorizontalBox();
		b3.add(new JButton("Box3:"));
		b3.add(new JButton("yes"));
		b3.add(new JButton("no"));
		b3.add(Box.createHorizontalStrut(20));
		b3.add(new JButton("Cancel"));
		
		b4=Box.createHorizontalBox();
		b4.add(new JButton("Box4:"));
		b4.add(new JButton("yes"));
		b4.add(new JButton("no"));
		b4.add(Box.createRigidArea(new Dimension(50,90)));
		b4.add(new JButton("Cancel"));
		
		contentPane.add(b1);
		contentPane.add(b2);
		contentPane.add(b3);
		contentPane.add(b4);
		
		frame.setSize(300, 200);
		frame.setVisible(true);
	}
}
