class Bank
{
  static int balance=10000;
  static void depositAmount(int amount)
  {
	balance+=amount;
	System.out.println(amount+" depositted");	
  }
  static void showBalance()
  {
	System.out.println("Your current balance is:"+balance);
  }
  static void widthrawAmount(int amount)
  {
	if(amount<=balance)
	{
	  balance-=amount;
	  System.out.println(amount+" widthrawn");	
	}
	else
	{
	  System.out.println("Insufficient balance amount");
	}
  }
  public static void main(String []args)
  {
	showBalance();
	depositAmount(4000);
	showBalance();
	widthrawAmount(1000);
	showBalance();
  }
}