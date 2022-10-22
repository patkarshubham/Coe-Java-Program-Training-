class NumberThread extends Thread
{
  public void run()
  {
    for(int num=10;num>=1;num--)
    {
	System.out.println(num);
	try
	{
	  Thread.sleep(1000);
	}
	catch(InterruptedException ex)
	{
	  System.out.println(ex);
	}
    }	
  }
}
class ShowNumbers
{
  public static void main(String []args)
  {
	new NumberThread().start();
  }
}