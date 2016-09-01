package office1;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class JComboBoxDemo {
	JFrame frame = new JFrame("JComboBox Demo");
	JComboBox jcb1,jcb2;
	JTextArea ta = new JTextArea(0,30);
	
	public static void main(){
		JComboBoxDemo cbd = new JComboBoxDemo();
		cbd.go();
	}

	private void go() {
		// TODO Auto-generated method stub
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel p3 = new JPanel();
		JPanel p4 = new JPanel();
		
		String[] itemList={"one","two","three","four","five"};
		jcb1=new JComboBox(itemList);
		jcb1.setSelectedIndex(3);
		
		p1.add(jcb1);
		Border etched = BorderFactory.createEtchedBorder();
		Border border = BorderFactory.createTitledBorder(etched,"Uneditable JComboBox");
		p1.setBorder(border);

	}		
}
