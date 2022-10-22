import javax.swing.*;
import java.awt.*;
class LoginForm extends JFrame
{
  JLabel la1=new JLabel("User ID");
  JLabel la2=new JLabel("Password");
  JTextField tb1=new JTextField();
  JPasswordField tb2=new JPasswordField();
  JCheckBox cb=new JCheckBox("Keep me signed in...");
  JButton bt=new JButton("Login");
  public LoginForm()
  {
	super("Login Form");
	setSize(300,300);
	setLocationRelativeTo(null);
	setResizable(false);
	setDefaultCloseOperation(3);
	addComponents();
	setVisible(true);
  }
  private void addComponents()
  {
	setLayout(null);
	la1.setBounds(40,30,100,30);
	add(la1);
	tb1.setBounds(140,30,130,30);
	add(tb1);
	la2.setBounds(40,90,100,30);
	add(la2);
	tb2.setBounds(140,90,130,30);
	add(tb2);
	cb.setBounds(40,150,200,30);
	add(cb);
	bt.setBounds(180,210,100,30);
	add(bt);
	changeProperties();
  }
  private void changeProperties()
  {
	Font fo=new Font("elephant",0,17);
	la1.setFont(fo);
	la2.setFont(fo);
	cb.setFont(fo);
	Color blue=new Color(0,0,255);
	la1.setForeground(blue);
	la2.setForeground(Color.blue);
	cb.setForeground(Color.blue);
	bt.setForeground(Color.white);
	bt.setFont(new Font("arial",0,18));
	bt.setBackground(Color.red);
  }
  public static void main(String []args)
  {
	new LoginForm();
  }
}

