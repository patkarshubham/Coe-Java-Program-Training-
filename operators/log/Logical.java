class Logical
{
  public static void main(String []args)
  {
	int x=1,y=1;
	boolean z=++x<10 ^ ++y<10;
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
  }
}