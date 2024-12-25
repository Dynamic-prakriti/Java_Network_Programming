import java.net.*;
import java.io.*;
import java.util.*;

public class TCPClient{
    public static void main(String args[]) throws IOException{
        Socket cs = new Socket("localhost",[Port]);
        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);

        outs.println("Hello server");
        String s = ins.nextLine();
        System.out.println("From Server: "+s);
        ins.close();
        outs.close();
        cs.close();
    }
}