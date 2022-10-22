import javax.swing.*;
import java.awt.*;
import java.applet.*;
class CountDown extends JFrame
{
  JLabel la=new JLabel("10");
  AudioClip []clips=new AudioClip[10];
  public CountDown()
  {
	setSize(300,300);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(3);
	Container c=getContentPane();
	c.setBackground(Color.pink);
	setLayout(new FlowLayout(FlowLayout.CENTER,0,100));
	la.setFont(new Font("elephant",Font.BOLD,30));
	add(la);
	loadNumbers();
	new NumberThread().start();
	setVisible(true);
  }
  class NumberThread extends Thread
  {
    public void run()
    {
      for(int num=10;num>=1;num--)
      {
	clips[num-1].play();
	la.setText(String.valueOf(num));
	try
	{
	  Thread.sleep(1000);
	}
	catch(InterruptedException ex)
	{
	  System.out.println(ex);
	}
      }	
      la.setText("Let's play...");
      try
      {
	  Thread.sleep(1000);
      }
      catch(InterruptedException ex)
      {
	  System.out.println(ex);
      }
      System.exit(0);
    }
  }
  private void loadNumbers()
  {
    for(int i=0;i<10;i++)
    {
      clips[i]=Applet.newAudioClip(getClass().getResource("sound/"+(i+1)+".wav"));
    } 
  }
  public static void main(String []args)
  {
	new CountDown();
  }
}