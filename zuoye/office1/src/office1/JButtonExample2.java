package office1;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class JButtonExample2 extends WindowAdapter implements ActionListener{
	JFrame f;
	JPanel p;
	JButton b1,b2;
	JTextField tf;
	int tag=0;
	
	public static void main(String args[]){
		JButtonExample2 be = new JButtonExample2();
		be.go();
	}

	private void go() {
		// TODO Auto-generated method stub
		f=new JFrame("JButton Example2");
		
		b1=new JButton("Sample");
		b1.setMnemonic(KeyEvent.VK_S);//ÉèÖÃ¿ì½Ý¼ü
		b1.setActionCommand("Sample");
		b1.addActionListener(this);
		
		b2=new JButton("Disable Sample");
		b2.setMnemonic(KeyEvent.VK_A);
		b2.setActionCommand("disable");
		b2.addActionListener(this);
		
		p=new JPanel();
		p.add(b1);
		p.add(b2);
		
		f.getContentPane().add(p, "South");
		
		tf= new JTextField();
		f.getContentPane().add(tf, "Center");
		
		f.addWindowListener(this);
		f.setSize(300, 150);
		f.setVisible(true);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String s1="You have pressed the button";
		String s2="You do another time";
		
		if (e.getActionCommand()=="Sample"){
			if(tag==0){
				tf.setText(s1);
				tag=1;
			}else{
				tf.setText(s2);
				tag=0;
			}
		}
		if(e.getActionCommand()=="disable"){
			b1.setEnabled(false);
			b2.setText("Enable Sample");
			b2.setActionCommand("enable");
		}
		if(e.getActionCommand()=="enable"){
			b1.setEnabled(true);
			b2.setText("Disable Sample");
			b2.setActionCommand("disable");
		}
	}
	
	
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}
