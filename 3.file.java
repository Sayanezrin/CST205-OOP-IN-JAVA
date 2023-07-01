import java.io.*;
class file
	{
		public static void main(String args[])throws IOException
		{
			
			try
			{
				FileInputStream f1=new FileInputStream("test.txt");
				FileOutputStream f2= new FileOutputStream("next.tet");
				int c=f1.read();
				while(c!=-1)
				{
					System.out.println((char)c);
					f2.write(c);
					c=f1.read();

				}	
		}
	catch(IOException e)

	{
		System.out.println(e);
	}
	}	
}
