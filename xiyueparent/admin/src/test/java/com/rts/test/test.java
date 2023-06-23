package com.rts.test;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import java.util.HashMap;
import java.util.Map;
@Slf4j
public class test {

    static class User{
         final String name = "Mark";
        final int age = 20;
        public String getName() {return name;}
        public int getAge() { return  age;}
    }
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("user", new User());
        map.put("arr", new int[]{1,2,3});
        map.put("flag", true);
        map.put("str", "LongShine");
        map.put("year", 1996);
        System.out.println(JSON.toJSON(map));
        String a = "a";
        int b = 1;
        String k = b + a;
        log.info(k);
    }
}
