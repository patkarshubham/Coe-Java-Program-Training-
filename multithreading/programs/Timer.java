import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Timer extends JFrame
{
  JLabel la=new JLabel("00:00");
  JButton bt=new JButton("START");
  int m=0,s=0;
  boolean timer=true;
  public Timer()
  {
	setSize(300,300);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(3);
	setLayout(new FlowLayout(FlowLayout.CENTER,200,60));
	la.setFont(new Font("elephant",0,20));
	add(la);
	add(bt);
	bt.addActionListener(new TimerListener());
	setVisible(true);
  }
  class TimerThread extends Thread
  {
    public void run()
    {
      while(true)
      {
	try{
	  Thread.sleep(1000);
	}catch(Exception ex){}	
	s++;
	if(s==60)
	{
	  s=0;
	  m++;
	}
	if(!timer)
	  break;
	la.setText((m<10?"0"+m:m)+":"+(s<10?"0"+s:s));
      } 	
    }
  }
  class TimerListener implements ActionListener
  {
    public void actionPerformed(ActionEvent evt)
    {
	if(bt.getText().equals("START"))
	{
	  m=s=0;
	  la.setText("00:00");
	  timer=true;
	  new TimerThread().start();
	  bt.setText("STOP");
	}
	else
	{
	  timer=false;
	  bt.setText("START");
	}
    }		
  }
  public static void main(String []args)
  {
	new Timer();
  }
}