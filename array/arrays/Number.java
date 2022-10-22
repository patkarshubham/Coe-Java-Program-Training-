class Number
{
  static String []x={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"};
  static String []y={"","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"};
  static void convert(int n)
  {
	if(n>=1 && n<=19)
	{
	  System.out.print(x[n]+" ");
	}
	if(n>=20 && n<=99)
	{
	  System.out.print(y[n/10]+" "+x[n%10]+" ");
	}
	if(n>=100 && n<=999)
	{
	  convert(n/100);
	  System.out.print("hundred ");	
	  convert(n%100);	  
	}
	if(n>=1000 && n<=99999)
	{
	  convert(n/1000);
	  System.out.print("thousand ");	
	  convert(n%1000);	  
	}
	if(n>=100000 && n<=9999999)
	{
	  convert(n/100000);
	  System.out.print("lakh ");	
	  convert(n%100000);	  
	}	

  }
  public static void main(String []args)
  {
	if(args.length==0)
	  return;
	int n=Integer.parseInt(args[0]);
	if(n>=10000000 && n<=999999999)
	{
	  convert(n/10000000);
	  System.out.print("crore ");	
	  convert(n%10000000);	  
	}	
	else
	  convert(n);
  }
}







