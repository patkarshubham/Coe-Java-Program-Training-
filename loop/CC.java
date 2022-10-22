class CC
{
  static void findHCF(int x,int y)
  {
	int s=x<y?x:y;
	while(x%s!=0 || y%s!=0)
	{
	   s--;
	}
	System.out.println(s);
	
  }
  public static void main(String []args)
  {
	findHCF(10,15);
  }
}