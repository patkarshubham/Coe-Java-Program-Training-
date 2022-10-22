import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
class AA extends JFrame
{
  JLabel la=new JLabel();
  int x=170,y=160;
  public AA()
  {
	super("Event handling");
	setSize(400,400);
	setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
	setLocationRelativeTo(null);
	setLayout(null);
	Border b=BorderFactory.createLineBorder(Color.red,20);
	la.setBorder(b);
	la.setBounds(x,y,20,20);
	add(la);
	this.addKeyListener(new LabelListener());
	setVisible(true);
  }
  class LabelListener implements KeyListener
  {
    public void keyPressed(KeyEvent evt)
    {
	int kc=evt.getKeyCode();
	if(kc==37)
	{
	  x-=5;
	  la.setLocation(x,y);
	}
	else if(kc==KeyEvent.VK_RIGHT)
	{
	  x+=5;
	  la.setLocation(x,y);
	}
	else if(kc==KeyEvent.VK_UP)
	{
	  y-=5;
	  la.setLocation(x,y);
	}
	else if(kc==KeyEvent.VK_DOWN)
	{
	  y+=5;
	  la.setLocation(x,y);
	}
	else if(kc==KeyEvent.VK_ESCAPE)
	{
	  int ch=JOptionPane.showConfirmDialog(AA.this,"Are you sure you want to exit");
	  if(ch==JOptionPane.YES_OPTION)
	  {
	    System.exit(0);
	  } 
	}
	else if(kc==KeyEvent.VK_F5)
	{
	  x=170;y=160;
	  la.setLocation(x,y);
	}
    }
    public void keyTyped(KeyEvent evt){}
    public void keyReleased(KeyEvent evt){}
  }
  public static void main(String []args)
  {
	setDefaultLookAndFeelDecorated(true);
	new AA();
  }
}

















