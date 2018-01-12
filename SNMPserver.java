
import java.net.*;
import java.io.*;
import java.util.Random;
class SNMPserver
{
	public static void main(String ar[])throws IOException
	{
		ServerSocket sc = new ServerSocket(8999);
		Socket s = sc.accept();
		BufferedReader br1,br2;
		String s1,s2;
		PrintStream ps;
		String array[]={"192.168.1.2","192.168.1.3","192.168.1.4","192.168.1.5"};

		int x = new Random().nextInt(3);
			br1 = new BufferedReader(new InputStreamReader(s.getInputStream()));
			s1 = br1.readLine();
			System.out.println(s1+"   "+array[x]);
			ps = new PrintStream(s.getOutputStream());
			s2 = array[x];
			ps.println(s2);
	}
}
