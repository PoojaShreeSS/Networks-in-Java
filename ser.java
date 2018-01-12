import java.net.*;
import java.io.*;
class ser
{
	public static void main(String ar[])throws IOException
	{
		ServerSocket sc = new ServerSocket(1);
		Socket s = sc.accept();
		BufferedReader br1,br2;
		String s1,s2;
		PrintStream ps;
		while(true)
		{
			br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			s1 = br1.readLine();
			System.out.println("Client :  "+s1);
			System.out.print("Server : ");
			br2 = new BufferedReader(new InputStreamReader(System.in));
			s2 = br2.readLine();
			ps = new PrintStream(s.getOutputStream());
			ps.println(s2);
			if(s1.equals("bye"))
				break;
		}
	}
}