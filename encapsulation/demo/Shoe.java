public class Shoe
{
  private String brand;
  private int price;
  private int size;
  private String color;
  
  public Shoe(String a1,int a2,int a3,String a4)
  {
	brand=a1;
	price=a2;
	size=a3;
	color=a4;
  }
  public void setBrand(String b)
  {
	brand=b;
  }
  public void setPrice(int p)
  {
	price=p;
  }
  public void setSize(int s)
  {
	size=s;
  }
  public void setColor(String c)
  {
	color=c;
  }
  public String getBrand()
  {
	return brand;
  }	
  public int getPrice()
  {
	return price;
  }	
  public int getSize()
  {
	return size;
  }	
  public String getColor()
  {
	return color;
  }	
  public void showInfo()
  {
	System.out.println("Brand is:"+brand);
	System.out.println("Price is:"+price);
	System.out.println("Size  is:"+size);
	System.out.println("Color is:"+color);
  }
}