package com.sophlean.rmes.test.PushSystem;

/**
 * Created by lql on 2016/4/21.
 */
public class RMES {
    public static void main(String[] args) {
        //推送方
        new Thread() {
            public void run() {
                int i = 0;
                PushService pushService = new PushService();
                while(true) {
                    pushService.pushMessage("这是来自于服务端的信息" + i++, "127.0.0.1");
                    System.out.println("发送了" + i + "条信息");
                    if(i % 500000 == 0)
                        break;
                }
            }
        }.start();
    }
}
