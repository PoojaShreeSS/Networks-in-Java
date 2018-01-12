import java.net.*;
import java.io.*;
class SNMPclient
{
	public static void main(String ar[])throws IOException
	{
		Socket ss = new Socket("localhost",8999);
		BufferedReader br1,br2;
		String s1,s2;
		PrintStream ps;
		while(true)
		{
			s1 = "Ubuntu Linu x86";
			ps = new PrintStream(ss.getOutputStream());
			ps.println(s1);
			br2 = new BufferedReader(new InputStreamReader(ss.getInputStream()));
			s2 = br2.readLine();
			System.out.println("Assigned IP :"+s2);
				
		}
	}}
