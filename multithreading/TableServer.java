class TableServer
{
  public static void main(String []args)
  {
	TableThread t1=new TableThread(25);
	TableThread t2=new TableThread(56);
	TableThread t3=new TableThread(43);
	t2.start();
	t1.start();
	t3.start();
  }
}