import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AA extends JFrame
{
  JPanel pa=new JPanel();
  JButton b1=new JButton("Red");
  JButton b2=new JButton("Green");
  public AA()
  {
	super("Event handling");
	setSize(300,300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	add(pa);
	pa.add(b1);
	pa.add(b2);
	b1.addActionListener(new RedListener());
	b2.addActionListener(new GreenListener());
	setVisible(true);
  }
  class RedListener implements ActionListener
  {
    public void actionPerformed(ActionEvent evt)
    {
	pa.setBackground(Color.red);
    }
  }  
  class GreenListener implements ActionListener
  {
    public void actionPerformed(ActionEvent evt)
    {
	pa.setBackground(Color.green);
    }
  }  
  public static void main(String []args)
  {
	new AA();
  }
}




