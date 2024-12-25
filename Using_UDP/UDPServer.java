import java.util.*;
import java.net.*;
import java.io.*;

public class UDPServer {
    public static void main(String[] args) throws IOException{
        byte buf[] = new byte[256];
        DatagramSocket socket = new DatagramSocket([port]);

        DatagramPacket Packet = new DatagramPacket(buf,buf.length);
        socket.receive(Packet);

        InetAddress address = Packet.getAddress();
        int port = Packet.getPort();
        String s = "Hello Client";
        buf = s.getBytes();

        Packet = new DatagramPacket(buf,buf.length,address,port);
        socket.send(Packet);
        socket.close();   
    }
    
}
