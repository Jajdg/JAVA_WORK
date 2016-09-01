package office1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutDemo extends MouseAdapter {
	JPanel p1,p2,p3,p4,p5;
	JLabel l1,l2,l3,l4,l5;
	
	CardLayout myCard;
	JFrame frame;
	Container contentPane;
	
	public static void main(String agrs[]){
		CardLayoutDemo that = new CardLayoutDemo();
		that.go();
	}
	
	public void go(){
		frame = new JFrame("Card Test");
		contentPane = frame.getContentPane();
		myCard = new CardLayout();
		contentPane.setLayout(myCard);
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		
		l1=new JLabel("This is the first JPanel");
		p1.add(l1);
		p1.setBackground(Color.yellow);
		
		l2=new JLabel("This is the second JPanel");
		p2.add(l2);
		p2.setBackground(Color.green);
		
		
		l3=new JLabel("This is the third JPanel");
		p3.add(l3);
		p3.setBackground(Color.magenta);
		
		l4=new JLabel("This is the fourth JPanel");
		p4.add(l4);
		p4.setBackground(Color.white);
		
		l5=new JLabel("This is the fifth JPanel");
		p5.add(l5);
		p5.setBackground(Color.cyan);
		
		p1.addMouseListener(this);
		p2.addMouseListener(this);
		p3.addMouseListener(this);
		p4.addMouseListener(this);
		p5.addMouseListener(this);
		
		contentPane.add(p1, "First");
		contentPane.add(p2, "Second");
		contentPane.add(p3, "Third");
		contentPane.add(p4, "Fourth");
		contentPane.add(p5, "Fifth");
		
		myCard.show(contentPane,"First");
		frame.setSize(300, 200);
		frame.show();
	}
	public void mouseClicked(MouseEvent e){
		myCard.next(contentPane);
	}
}
