import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
class MouseMagic extends JFrame
{
 JLabel la=new JLabel("Touch me if you can");
 int x=20,y=30;
 Random ra=new Random();  
 boolean move=true;
 public MouseMagic()
 {
	setSize(800,600);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setLayout(null);
	la.setFont(new Font("arial",0,20));
	la.setBounds(x,y,230,30);
	add(la);
	la.addMouseListener(new TouchListener());
	this.addKeyListener(new StopListener());
	setVisible(true); 
 }
 class StopListener extends KeyAdapter
 {
    public void keyPressed(KeyEvent evt)
    {
	if(evt.getKeyCode()==KeyEvent.VK_ESCAPE)
	  move=false;
    } 
    public void keyTyped(KeyEvent evt){}
    public void keyReleased(KeyEvent evt){}
 }   
 class TouchListener extends MouseAdapter
 {
    public void mouseEntered(MouseEvent evt)
    {
      if(move)
      {	
	x=ra.nextInt(600);
	y=ra.nextInt(500);;
	la.setLocation(x,y);
      }
      move=true;	 
    } 	
 }   
 public static void main(String args[])
 {
	JFrame.setDefaultLookAndFeelDecorated(true);
	new MouseMagic();
 }
}