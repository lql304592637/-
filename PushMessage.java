package com.sophlean.rmes.test.PushSystem;

import com.google.gson.Gson;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by lql on 2016/5/3.
 */
public class PushMessage {
   private static Gson gson = new Gson();
    public static String getMessage(String ip, String messageInfo) {
        Map<String, String> info = new HashMap<String, String>();
        info.put("ip", ip);
        info.put("pushInfo", messageInfo);
        String msg = gson.toJson(info);
        return msg;
    }
}
