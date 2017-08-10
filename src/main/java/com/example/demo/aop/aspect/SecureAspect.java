package com.example.demo.aop.aspect;

import com.example.demo.aop.annotation.Secure;
import com.example.demo.bean.ThreadLocalWrapper;
import com.example.demo.enums.Role;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;

import java.lang.reflect.Method;

/**
 * Created by rahulb on 10/8/17.
 */
@Aspect
public class SecureAspect {

    @Around()
    public Object secure(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        Secure secure = extractAnnotations(proceedingJoinPoint);
        Role[] roles = secure.getRoles();

        ThreadLocalWrapper
    }


    private Secure extractAnnotations(final ProceedingJoinPoint proceedingJoinPoint){

        MethodSignature methodSignature = (MethodSignature) proceedingJoinPoint.getSignature();
        Method method = methodSignature.getMethod();
        Secure secure = method.getAnnotation(Secure.class);

        if ( secure != null )
            return secure;

        secure = proceedingJoinPoint.getTarget().getClass().getAnnotation(Secure.class);
        return secure;

    }

}
