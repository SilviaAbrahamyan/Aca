package com.homeworks.live.reflections.bygeeks;

import java.lang.reflect.Modifier;

/**
 * Created by home on 11/21/2018.
 */
public class GetModifiersFromAnObject {
    public static void main(String[] args) {
        Class<?> clazz = java.lang.ThreadLocal.class;

        // return the modifiers for this class or interface encoded in an integer
        int mod = clazz.getModifiers();

        System.out.println("Abstract: " + Modifier.isAbstract(mod));
        System.out.println("Final: " + Modifier.isFinal(mod));
        System.out.println("Interface: " + Modifier.isInterface(mod));
        System.out.println("Native: " + Modifier.isNative(mod));
        System.out.println("Private: " + Modifier.isPrivate(mod));
        System.out.println("Protected: " + Modifier.isProtected(mod));
        System.out.println("Public: " + Modifier.isPublic(mod));
        System.out.println("Static: " + Modifier.isStatic(mod));
    }
}
