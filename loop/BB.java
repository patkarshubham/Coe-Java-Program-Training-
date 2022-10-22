class BB
{
  static void findLCM(int x,int y)
  {
	int m=x>y?x:y;
	int s=x<y?x:y;
	int n=m;
	while(m%s!=0)
	{
	   m+=n;
	}
	System.out.println(m);
	
  }
  public static void main(String []args)
  {
	findLCM(4,6);
  }
}