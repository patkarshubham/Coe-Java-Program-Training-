import java.io.*;
class CC
{
  static void writeFile(String filepath)throws FileNotFoundException,IOException
  {
 	FileWriter fw=new FileWriter(filepath);
	PrintWriter pw=new PrintWriter(fw);
	pw.println("It will break line after wrtinig data");
	pw.print("It will not break line after wrtinig data");
	pw.println("It will break line after wrtinig data");
	pw.flush();
  }
  public static void main(String []args)throws Exception
  {
	writeFile("aa.txt");
  }
}