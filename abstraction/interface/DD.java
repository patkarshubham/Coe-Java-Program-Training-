interface AA
{
}
interface BB
{
}
class CC
{
}
class DD extends CC implements AA,BB
{
  public static void main(String []args)
  {
	DD obj1=new DD();
	CC obj2=new DD();
	BB obj3=new DD();
	AA obj4=new DD();	
  }
}