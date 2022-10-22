import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class MoveArrow extends JFrame
{
  JLabel la=new JLabel(new ImageIcon(getClass().getResource("images/a0.png")));
  int x=200,y=100;
  public MoveArrow()
  {
	setSize(340,300);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(3);
	setLayout(null);
	la.setBounds(x,y,61,30);
	add(la);
	new ArrowThread().start();
	setVisible(true);
  }
  class ArrowThread extends Thread
  {
    public void run()
    {
      int z=5;
      while(true)
      {   
	for(int c=0;c<30;c++)
	{
	  x-=z;
	  la.setLocation(x,y);
	  try{
	    Thread.sleep(50);
	  }catch(Exception ex){}	
	}
	z=0-z;
      } 
    }
  }
  public static void main(String []args)
  {
	new MoveArrow();
  }
}