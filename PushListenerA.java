package com.sophlean.rmes.test.PushSystem;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sophlean.rmes.test.RedisMessage.RedisPersistMessageListener;
import org.springframework.context.annotation.Scope;

import javax.annotation.Resource;
import javax.inject.Named;
import java.lang.reflect.Type;
import java.util.Map;

/**
 * Created by lql on 2016/4/26.
 */
@Named("pushListenerA")
@Scope("singleton")
public class PushListenerA extends RedisPersistMessageListener {
    @Resource
    private PushService pushService;
    private Gson gson = new Gson();
    @Override
    public void executeMessage(String message) {
        Type type = new TypeToken<Map<String, String>>(){}.getType();
        Map<String, String> mesaageMap = gson.fromJson(message, type);
        String ip = mesaageMap.get("ip");
        String messageInfo = mesaageMap.get("pushInfo");
        pushService.pushMessage(messageInfo, ip);
    }
}
