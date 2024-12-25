import java.net.*;
import java.util.*;
import java.io.*;
public class TCPServer {
    public static void main(String[] args) throws IOException{
        ServerSocket ss = new ServerSocket([Port]);
        Socket cs = ss.accept();

        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream());

        String s = ins.nextLine();
        System.out.println("From Client: "+s);
        outs.println("Hello Client");
        
        outs.close();
        ins.close();
        cs.close();
    }
}
