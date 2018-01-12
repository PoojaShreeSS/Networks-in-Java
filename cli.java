import java.net.*;
import java.io.*;
class cli
{
	public static void main(String ar[])throws IOException
	{
		Socket ss = new Socket("localhost",1);
		BufferedReader br1,br2;
		String s1,s2;
		PrintStream ps;
		while(true)
		{
			br1 = new BufferedReader(new InputStreamReader(System.in));
			s1 = br1.readLine();
			ps = new PrintStream(ss.getOutputStream());
			ps.println(s1);
			if(s1.equals("bye"))
				break;
			else
			{
				br2 = new BufferedReader(new InputStreamReader(ss.getInputStream()));
				s2 = br2.readLine();
				System.out.println("Server : "+s2);
				System.out.print("Client : ");
			}
		}
	}
}