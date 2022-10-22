import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ChessBoard extends JFrame
{
  JButton [][]bt=new JButton[8][8];
  public ChessBoard()
  {
	super("Chess");
	setExtendedState(6);
	setDefaultCloseOperation(3);
	addButtons();
	setVisible(true);
  }
  private void addButtons()
  {
	setLayout(new GridLayout(8,8));
	int c=0;
        ChessListener listener=new ChessListener();
	for(int i=0;i<8;i++)
	{
	  for(int j=0;j<8;j++)
	  {
		bt[i][j]=new JButton();
	        bt[i][j].addActionListener(listener);
		if(j%2==c)
		  bt[i][j].setBackground(Color.white);
	 	else
		  bt[i][j].setBackground(Color.black);
		add(bt[i][j]);
	  }
	  c=1-c;
	}
	setImage();
  }
  private void setImage()
  {
    ImageIcon icon3=new ImageIcon(getClass().getResource("image/bp.gif"));
    ImageIcon icon4=new ImageIcon(getClass().getResource("image/wp.gif"));
    for(int c=0;c<8;c++)
    {
	ImageIcon icon1=new ImageIcon(getClass().getResource("image/b"+c+".gif"));
	bt[0][c].setIcon(icon1);
	ImageIcon icon2=new ImageIcon(getClass().getResource("image/w"+c+".gif"));
	bt[7][c].setIcon(icon2);
	bt[1][c].setIcon(icon3);
	bt[6][c].setIcon(icon4);
    } 	    	
  }
  class ChessListener implements ActionListener
  {
    public void actionPerformed(ActionEvent evt)
    {
	JButton bc=(JButton)evt.getSource();
	Icon ic=bc.getIcon();
	bt[5][0].setIcon(ic);
	bc.setIcon(null);
    }
  }  
  public static void main(String []args)
  {
	setDefaultLookAndFeelDecorated(true);
	new ChessBoard();
  }
}

