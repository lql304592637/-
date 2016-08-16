package com.sophlean.rmes.test.PushSystem;

import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * Created by lql on 2016/4/21.
 */
public class Pusher {

    private Socket socket = null;
    public void initPush(String ip, int port) {
        try {
            socket = new Socket(ip, port);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void pushMessage(String message) {
        try {
            PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);
            out.println(message);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
