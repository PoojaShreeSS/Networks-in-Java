import java.net.*;
import java.util.*;
class Serverdns
{
            public static void main(String args[])
            {
            try
            {
                        DatagramSocket server=new DatagramSocket(1309);
                        while(true)
                        {
                                    byte[] sendbyte=new byte[1024];
                                    byte[] receivebyte=new byte[1024];
                                    DatagramPacket receiver=new DatagramPacket(receivebyte,receivebyte.length);
                                    server.receive(receiver);
                                    String str=new String(receiver.getData());
                                    String s=str.trim();
                                    //System.out.println(s);
                                    InetAddress addr=receiver.getAddress();
                                    int port=receiver.getPort();
                                    String ip[]={"8.8.8.8","66.220.144.0"};
                                    String name[]={"www.google.com","www.facebook.com"};
                                    for(int i=0;i<ip.length;i++)
                                    {
                                                if(s.equals(ip[i]))
                                                {
                                                            sendbyte=name[i].getBytes();
                                                            DatagramPacket sender=new DatagramPacket(sendbyte,sendbyte.length,addr,port);
                                                            server.send(sender);
                                                            break;
                                                }
                                                else if(s.equals(name[i]))
                                                {
                                                            sendbyte=ip[i].getBytes();
                                                            DatagramPacket sender=new DatagramPacket(sendbyte,sendbyte.length,addr,port);
                                                            server.send(sender);
                                                            break;
                                                }
                                               
                                    }         
                                    break;


                        }
            }
            catch(Exception e)
            {
                        System.out.println(e);
            }
            }
}
