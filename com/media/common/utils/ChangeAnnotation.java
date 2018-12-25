package com.media.common.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

import com.media.common.annotation.LogManager;

public class ChangeAnnotation {
    public static <T> Object changeAnnotation(T t, String methodName, Object newValue) throws Exception {
        Object object = null;
        System.out.println("t.toString =" + t.toString());
        System.out.println("t.getClass().getDeclaredMethods()===" + (t.getClass().getDeclaredMethods().length));
        for (Method method : t.getClass().getDeclaredMethods()) {
            System.out.println(method.getName());
            if (method.getName().equals(methodName)) {
                System.out.println("diaoyong==doChangeAnnotation");
                object = doChangeAnnotation(method.getAnnotation(LogManager.class), "content", newValue);
                LogManager log = method.getAnnotation(LogManager.class);
                System.out.println("diaoyong==LogManager====" + log.content());
            }
        }
        return object;

    }

    @SuppressWarnings("unchecked")
    public static Object doChangeAnnotation(Annotation annotation, String key, Object newValue) throws Exception {
        InvocationHandler handler = Proxy.getInvocationHandler(annotation);
        Field f;
        try {
            f = handler.getClass().getDeclaredField("memberValues");
        } catch (Exception e) {
            throw new IllegalStateException("f异常");
        }
        f.setAccessible(true);
        Map<String, Object> memberValues;
        memberValues = (Map<String, Object>) f.get(handler);
        Object oldValue = memberValues.get(key);
        // if(oldValue == null || oldValue.getClass() != newValue.getClass()){
        // throw new IllegalArgumentException("oldValue异常");
        // }
        memberValues.put(key, String.valueOf(newValue));

        return newValue;

    }
}
