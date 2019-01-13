package com.homeworks.live.reflections;

import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

/**
 * Created by home on 11/21/2018.
 */
public class GenericMethodReturnTypes {
    public static void main(String[] args) throws NoSuchMethodException {
        Method method = MyClass.class.getMethod("getStringList", null);
        Type returnType = method.getGenericReturnType();

        if(returnType instanceof ParameterizedType){
            ParameterizedType type = (ParameterizedType) returnType;
            Type[] typeArguments = type.getActualTypeArguments();
            for(Type typeArgument : typeArguments){
                Class typeArgClass = (Class) typeArgument;
                System.out.println("typeArgClass = " + typeArgClass);
            }
        }
    }
}
class MyClass {

    protected Map<String, Integer> stringList = null;

    public Map<String, Integer> getStringList() {
        return this.stringList;
    }
}