package com.example.demo.bean;

/**
 * Created by rahulb on 10/8/17.
 */
public class ThreadLocalWrapper  {

    private static final  ThreadLocal<AuthenticatedEntityContext> context;

    static {
        context = new ThreadLocal<>();
    }

    public static ThreadLocal<AuthenticatedEntityContext> getContext() {
        return context;
    }

    public static void putAuthenticatedEntityContext( AuthenticatedEntityContext authenticatedEntityContext){
        context.set(authenticatedEntityContext);
    }

}
