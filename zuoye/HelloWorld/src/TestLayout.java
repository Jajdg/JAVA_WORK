import java.awt.*;
import javax.swing.*;
enum LayoutType{
	border,flow,grid;
}
public class TestLayout extends JFrame{
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	public TestLayout(String title,LayoutType type){
		super(title);
		btn1 = new JButton("  1  ");
		btn2 = new JButton("  2  ");
		btn3 = new JButton("  3  ");
		btn4 = new JButton("  4  ");
		btn5 = new JButton("  5  ");
		switch(type){
		case border:initBorderLayout();break;
		case flow:initFlowLayout();break;
		case grid:initGridLayout();break;
			
		}
		setSize(300,300);
		setVisible(true);
	}
	private void initGridLayout() {
		// TODO Auto-generated method stub
		setLayout(new BorderLayout());
		add(btn1,BorderLayout.NORTH);
		add(btn2,BorderLayout.EAST);
		add(btn3,BorderLayout.SOUTH);
		add(btn4,BorderLayout.WEST);
		add(btn5,BorderLayout.CENTER);
	}
	private void initFlowLayout() {
		// TODO Auto-generated method stub
		setLayout(new FlowLayout());
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
	}
	private void initBorderLayout() {
		// TODO Auto-generated method stub
		new TestLayout("BorderLayout Example",LayoutType.border);
		new TestLayout("FlowrLayout Example",LayoutType.flow);
		new TestLayout("GridLayout Example",LayoutType.grid);
	}
}
