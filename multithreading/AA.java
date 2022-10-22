class Method1 extends Method
{
  public void run()
  {
	System.out.println("By runnable");
  }
}
class Method2 
{
  public void run()
  {
	System.out.println("By thread");
  }
}
class Method
{
  public static void main(String []args)
  {
 	 m1=new (new Method1());
	Method2 m2=new Method2();
	m1.start();
	m2.start();
  }
}
