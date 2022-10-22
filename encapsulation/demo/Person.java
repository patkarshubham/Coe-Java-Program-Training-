public class Person
{
  private String name;
  private int age;
  public void storeInfo(String a1,int a2)
  {
	name=a1;
	age=a2;
  }
  public void showInfo()
  {
	System.out.println(name+" "+age);
  }
  public static void main(String []args)
  {
	Person p1,p2,p3,o1,o2,o3;
	o1=p1=new Person();
	o2=p2=new Person();
	o3=p3=new Person();
	p1.storeInfo("Amit",24);
	p2=p1;
	p2.storeInfo("Manoj",20);
	p3=p2;
	p3.storeInfo("Suman",21);
	p1=p3;
	o1.showInfo();	
	o2.showInfo();	
	o3.showInfo();	
  }
}