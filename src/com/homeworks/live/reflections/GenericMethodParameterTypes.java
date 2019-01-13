package com.homeworks.live.reflections;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * Created by home on 11/21/2018.
 */
public class GenericMethodParameterTypes {
    public static void main(String[] args) throws NoSuchMethodException {
        Method method = null;
        method = MyClass1.class.getMethod("setStringList", List.class, Map.class);

        Type[] genericParameterTypes = method.getGenericParameterTypes();

        for(Type genericParameterType : genericParameterTypes){
            if(genericParameterType instanceof ParameterizedType){
                ParameterizedType aType = (ParameterizedType) genericParameterType;
                Type[] parameterArgTypes = aType.getActualTypeArguments();
                for(Type parameterArgType : parameterArgTypes){
                    Class parameterArgClass = (Class) parameterArgType;
                    System.out.println("parameterArgClass = " + parameterArgClass + " " + aType.getRawType());
                }
            }
        }
    }
}
 class MyClass1 {
    protected List<String> stringList = null;

    public void setStringList(List<String> list, Map<String,Integer> map){
        this.stringList = list;
    }
}