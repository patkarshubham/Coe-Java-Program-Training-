import javax.swing.*;
import java.awt.*;
class AA extends JFrame
{
  JButton b1=new JButton("Start");
  JButton b2=new JButton("Stop");
  public AA()
  {
	super("Adding components");
	setSize(300,300);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(3);

	b1.setBounds(70,50,80,30);	
	add(b1);
	b2.setBounds(160,50,80,30);	
	add(b2);
	setVisible(true);
  }
  public static void main(String []args)
  {
	new AA();
  }
}