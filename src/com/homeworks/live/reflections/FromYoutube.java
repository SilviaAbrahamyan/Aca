package com.homeworks.live.reflections;

import com.homeworks.HM9.Transient;

import java.security.Provider;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by home on 11/20/2018.
 */
public class FromYoutube {
    private static Map<String,Object> serviceMap = new HashMap<>();

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        loadService("services.SimpleService");
        loadService("services.LazyService");
        loadService("java.lang.String");

        for (Object o : serviceMap.values()){


        }
    }

    private static void loadService(String name) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> clazz = Class.forName(name);
        if (clazz.isAnnotationPresent(Transient.class)){
            Object obj = clazz.newInstance();
            serviceMap.put(name,obj);
        }
    }
}
