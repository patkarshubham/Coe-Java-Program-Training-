import java.io.*;
class BB
{
  static void writeFile(String filepath)
  {
     try
     {  
	FileWriter fw=new FileWriter(filepath);
	PrintWriter pw=new PrintWriter(fw);
	pw.println("It will break line after wrtinig data");
	pw.print("It will not break line after wrtinig data");
	pw.println("It will break line after wrtinig data");
	pw.flush();
     }
     catch(FileNotFoundException ex)
     {
	ex.printStackTrace();
     }
     catch(IOException ex)
     {
	System.out.println(ex.toString());
     }
  }
  public static void main(String []args)
  {
	writeFile("aa.txt");
  }
}