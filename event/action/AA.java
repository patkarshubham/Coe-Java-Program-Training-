import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AA extends JFrame
{
  JPanel pa=new JPanel();
  JButton b1=new JButton("Red");
  JButton b2=new JButton("Green");
  JButton b3=new JButton("Blue");
  public AA()
  {
	super("Event handling");
	setSize(300,300);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	add(pa);
	pa.add(b1);
	pa.add(b2);
	pa.add(b3);
	ColorListener listener=new ColorListener();
	b1.addActionListener(listener);
	b2.addActionListener(listener);
	b3.addActionListener(listener);
	setVisible(true);
  }
  class ColorListener implements ActionListener
  {
    public void actionPerformed(ActionEvent evt)
    {
	JButton bc=(JButton)evt.getSource();
	if(bc==b1)
	  pa.setBackground(Color.red);
	else if(bc==b2)
	  pa.setBackground(Color.green);
	else if(bc==b3)
	  pa.setBackground(Color.blue);
    }
  }  
  public static void main(String []args)
  {
	new AA();
  }
}

















