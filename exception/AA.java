import java.io.*;
class AA
{
  static void readFile(String filepath)
  {
     try
     {  
	FileReader fr=new FileReader(filepath);
	BufferedReader br=new BufferedReader(fr);
	String str=br.readLine();
	while(str!=null)
	{
	  System.out.println(str);
	  str=br.readLine();
	}
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
	readFile("D:/batches/corejava12/GUI/programs/tictactoe/TicTacToe.java");
  }
}