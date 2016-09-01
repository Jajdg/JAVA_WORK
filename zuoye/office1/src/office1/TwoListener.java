package office1;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TwoListener implements MouseListener,MouseMotionListener{
	private JFrame frame;
	private JTextField tf;
	
	public static void main(String args[]){
		TwoListener two = new TwoListener();
		two.go();
	}

	private void go() {
		// TODO Auto-generated method stub
		frame = new JFrame("Two listener example");
		Container contentPane = frame.getContentPane();
		contentPane.add(new Label("Click and drag the mouse"),BorderLayout.NORTH);
		tf = new JTextField(30);
		contentPane.add(tf,BorderLayout.SOUTH);
		
		//注册监听事件
		frame.addMouseListener(this);
		frame.addMouseMotionListener(this);
		
		frame.setSize(300, 300);
		frame.setVisible(true);
	}
	//实现接口中的方法
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		String s = "Mouse dragging:X="+e.getX()+"Y="+e.getY();
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		String s = "点尼玛比";
		tf.setText(s);
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		String s = "the mouse entered";
		tf.setText(s);
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		String s = "the mouse has left the building";
		tf.setText(s);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
