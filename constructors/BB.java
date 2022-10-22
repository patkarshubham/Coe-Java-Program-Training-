public class BB
{
 
  public BB(int x)
  {
	System.out.println("Constructor2");
  }
  public BB(String x)
  {
	System.out.println("Constructor3");
  }
  public static void main(String []args)
  { 
	new BB("Rehan");
	new BB();
	new BB(90);
  }
}	