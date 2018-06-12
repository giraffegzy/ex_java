package javasmall_ex.ex_71;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/*

 */
public class SocketClient {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;
        PrintWriter pw = null;
        try{
            Socket socket = new Socket("localhost",2000);
            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw = new PrintWriter(socket.getOutputStream(),true);
            pw.println("Hello");
            String str = null;
            while (true){
                str= br.readLine();
                if(str!=null)
                    break;
            }
            System.out.println(str);
        }catch (Exception e){

        }finally {
            br.close();
            pw.close();
        }
    }
}
