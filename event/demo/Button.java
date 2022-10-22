public class Button
{
  ActionListener listener;
  public void clickEvent()
  {
	listener.performTask();
  } 
  public void addActionListener(ActionListener obj)
  {
	listener=obj;
  }
}