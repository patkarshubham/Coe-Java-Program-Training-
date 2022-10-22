class MyThread extends Thread
{
  public void run()
  {
	System.out.println("A");
	System.out.println("B");
	System.out.println("C");
  }
}
class Test
{
  public static void main(String []args)
  {
	new MyThread().start();
	System.out.println("X");
	System.out.println("Y");
	System.out.println("Z");
  }
}