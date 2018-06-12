package javasmall_ex.ex_71;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/*
  ex_71_SockeServer
  题目：用Socket实现服务端和客户端的通信，要求客户端能够回显发送的数据。
 */
public class Server {
    public static void main(String[] args) {
        BufferedReader br = null;
        PrintWriter pw = null;

        try {
            ServerSocket server = new ServerSocket(2000);
            Socket socket = server.accept();

            br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            pw = new PrintWriter(socket.getOutputStream(), true);
            String str = br.readLine();
            pw.println(str);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                br.close();
                pw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
