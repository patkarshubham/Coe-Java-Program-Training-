import javax.swing.*;
class AA extends JFrame
{
  public AA()
  {
	setSize(300,300);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(3);
	//ImageIcon icon=new ImageIcon(getClass().getResource("images/india.gif"));
	ImageIcon icon=new ImageIcon("images/funny.gif");
	JLabel la=new JLabel(icon);
	add(la);
	la.setIcon(new ImageIcon("images/india.gif"));
	setVisible(true);
  }
  public static void main(String []args)
  {
	new AA();
  }
}