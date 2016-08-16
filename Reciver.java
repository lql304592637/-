package com.sophlean.rmes.test.PushSystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by lql on 2016/4/21.
 */
public class Reciver {

    private ServerSocket serverSocket = null;
    private Socket socket = null;

    public void intitRecive(int port) {
        try {
            serverSocket = new ServerSocket(port);
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void reciveMessage() {
        try {
            while(true) {
                socket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                String message = in.readLine();
                System.out.println(message);
            }
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
