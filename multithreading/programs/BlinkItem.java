import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class BlinkItem extends JFrame
{
  JLabel la=new JLabel("Congratulations!!!You did it");
  public BlinkItem()
  {
	setSize(340,300);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(3);
	setLayout(new FlowLayout(FlowLayout.CENTER,100,120));
	la.setFont(new Font("elephant",0,20));
	add(la);
	new BlinkThread().start();
	setVisible(true);
  }
  class BlinkThread extends Thread
  {
    public void run()
    {
      boolean blink=false;
      while(true)
      {
	la.setVisible(blink=!blink);
	try{
	  Thread.sleep(100);
	}catch(Exception ex){}	
      } 	
    }
  }
  public static void main(String []args)
  {
	new BlinkItem();
  }
}