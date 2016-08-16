package com.sophlean.rmes.test.PushSystem;

/**
 * Created by lql on 2016/4/21.
 */
public class ipad {
    public static void main(String[] args) {
//        ipad接收方
        new Thread() {
            public void run() {
                Reciver reciver = new Reciver();
                reciver.intitRecive(5555);
                reciver.reciveMessage();
            }
        }.start();
    }
}
