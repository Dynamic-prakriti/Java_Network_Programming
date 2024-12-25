import java.net.*;
import java.util.*;
import java.io.*;
public class UDPClient {
    public static void main(String[] args) throws IOException{
        DatagramSocket socket = new DatagramSocket();
        byte buf[] = new byte[256];

        InetAddress address = InetAddress.getByName("localhost");
        DatagramPacket Packet = new DatagramPacket(buf,buf.length,address,9999);

        socket.send(Packet);

        Packet = new DatagramPacket(buf,buf.length);
        socket.receive(Packet);

        String received = new String(Packet.getData());
        System.out.println("From the server: "+received);
        socket.close();
        
    }
    
}
