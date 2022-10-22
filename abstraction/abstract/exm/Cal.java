public abstract class Cal
{
  protected int num1,num2,res;
  public Cal(int x,int y)
  {
	num1=x;
	num2=y;
  } 
  
  public abstract void task();
  
  public void showResult()
  {
	System.out.println(res);
  }
}