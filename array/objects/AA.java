class AA
{
  public static void main(String []args)
  {
	Person []p={new Person("Amit",20),new Person("Manoj",21),new Person("Suman",19),new Person("Imran",22)};

	for(int i=0;i<p.length;i++)
	{
	  p[i].show();
	}
	
  }
}