import java.net.*;
import java.io.*;
public class serverFT
{
            public static void main(String args[])throws IOException
            {
                        byte b[]=new byte[3072];
                        DatagramSocket dsoc=new DatagramSocket(5556);
                        FileOutputStream f=new FileOutputStream("shree.txt");
                        while(true)
                        {
                                    DatagramPacket dp=new DatagramPacket(b,b.length);
                                    dsoc.receive(dp);
                                    System.out.println(new String(dp.getData(),0,dp.getLength()));                             

                        }
            }
}


