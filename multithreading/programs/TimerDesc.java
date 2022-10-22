import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class TimerDesc extends JFrame
{
  JLabel la=new JLabel("00:00");
  JButton bt=new JButton("START");
  int m,s,n;
  boolean timer=true;
  public TimerDesc()
  {
	setSize(300,300);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(3);
	setLayout(new FlowLayout(FlowLayout.CENTER,200,60));
	la.setFont(new Font("elephant",0,20));
	add(la);
	add(bt);
	n=3;
	setTime();
	bt.addActionListener(new TimerListener());
	setVisible(true);
  }
  private void setTime()
  {
	m=n/2;
	s=n%2==0?0:30;
	la.setText((m<10?"0"+m:m)+":"+(s<10?"0"+s:s));
  }
  class TimerThread extends Thread
  {
    public void run()
    {
      while(timer)
      {
	try{
	  Thread.sleep(300);
	}catch(Exception ex){}	
	if(s==0)
	{
	  if(m==0)
	  {
		JOptionPane.showMessageDialog(TimerDesc.this,"Your time is over...");
		break;	
	  }
	  s=60;
	  m--;
	}
	s--;
	if(timer)
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
	  timer=true;
	  new TimerThread().start();
	  bt.setText("END");
	}
	else
	{
	  timer=false;
	  bt.setText("START");
	  m=s=0;
	}
    }		
  }
  public static void main(String []args)
  {
	new TimerDesc();
  }
}