import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
class RotateDice extends JFrame
{
  JButton bt=new JButton(new ImageIcon(getClass().getResource("images/dice0.jfif")));
  Random ra=new Random();
  public RotateDice()
  {
	setSize(340,300);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(3);
	setLayout(null);
	bt.setBounds(100,50,70,65);
	add(bt);
	bt.addActionListener(new DiceListener());
	setVisible(true);
  }
  class DiceThread extends Thread
  {
    public void run()
    {
     for(int c=0;c<3;c++)
     { 
      for(int i=0;i<5;i++)
      {
	bt.setIcon(new ImageIcon(getClass().getResource("images/dice"+i+".jfif")));
	try{
	  Thread.sleep(50);
	}catch(Exception ex){}
      }	
     }
     setNumber();	
    }
    private void setNumber()
    {
	int n=ra.nextInt(6)+1;
	if(n!=6)
	{
	  int x=ra.nextInt(3);
	  if(x==2)
	   n=6;
	}
	bt.setIcon(new ImageIcon(getClass().getResource("images/"+n+".jpg")));
    }
  }
  class DiceListener implements ActionListener
  {
    public void actionPerformed(ActionEvent evt)
    {
	new DiceThread().start();
    }
  }
  public static void main(String []args)
  {
	new RotateDice();
  }
}