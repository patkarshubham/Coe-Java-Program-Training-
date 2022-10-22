import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class AA extends JFrame
{
  JLabel la=new JLabel("CETPA Infotech");
  public AA()
  {
	super("Event handling");
	setSize(400,400);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setLayout(new FlowLayout());
	add(la);
	la.addMouseListener(new ColorListener());
	setVisible(true);
  }
  class ColorListener implements MouseListener
  {
    public void mouseEntered(MouseEvent evt)
    {
	la.setForeground(Color.red);	
    }
    public void mouseExited(MouseEvent evt)
    {
	la.setForeground(Color.black);
    }
    public void mousePressed(MouseEvent evt){}
    public void mouseClicked(MouseEvent evt){}
    public void mouseReleased(MouseEvent evt){}
  }
  public static void main(String []args)
  {
	setDefaultLookAndFeelDecorated(true);
	new AA();
  }
}

















