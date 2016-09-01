package office1;


import java.awt.*;

import javax.swing.*;

public class Xiangqi extends JFrame{
private static final long serialVersionUID = 1;

public Xiangqi() throws HeadlessException {
super();
setTitle("my board");
this.getContentPane().setLayout(new BorderLayout());
this.getContentPane().add(new Board(), BorderLayout.CENTER);
this.setSize(960, 960);
this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}

public static void main(String args[]){
new Xiangqi().setVisible(true);
}
}
class Board extends JPanel{
private static final long serialVersionUID = 1L;

protected void paintComponent(Graphics g) {
super.paintComponent(g);
Graphics2D g2d=(Graphics2D)g;
int width=this.getWidth();
int height=this.getHeight();
int hGap=height/9;
int wGap=width/8;
for(int i=0;i<10;i++){
g2d.drawLine(0, i*hGap, width, i*hGap);
}
for(int i=0;i<9;i++){
g2d.drawLine(i*wGap, 0, i*wGap, 4*hGap);
g2d.drawLine(i*wGap, 5*hGap, i*wGap, height);
}
g2d.drawString("³þºÓ         ºº½ç", width/2, height/2);
g2d.drawLine(3*wGap, 0, 5*wGap, 2*hGap);
g2d.drawLine(5*wGap, 0, 3*wGap, 2*hGap);
g2d.drawLine(3*wGap, height, 5*wGap, height-2*hGap);
g2d.drawLine(3*wGap, height-2*hGap, 5*wGap, height);
g2d.dispose();
}
}