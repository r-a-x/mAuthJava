package com.example.demo.aop.annotation;

import com.example.demo.enums.Role;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by rahulb on 10/8/17.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD,ElementType.TYPE})
public @interface Secure {
    Role[]  getRoles() default  Role.USER;
}
