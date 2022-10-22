class AA
{
  public static void main(String []args)
  {
	int [][]a={{1,3,4},{2,5,4,7,6},{2,8,7,6,8,4},{3,7}};

	for(int j=0;j<a.length;j++)
	{
	  for(int i=0;i<a[j].length;i++)
	  {
	    System.out.println(a[j][i]);
	  }
	}
  }
}