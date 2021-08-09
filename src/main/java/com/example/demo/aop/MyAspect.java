package com.example.demo.aop;

import com.example.demo.exception.AOPException;
import com.example.demo.exception.DAOException;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyAspect {

    @AfterThrowing(pointcut = "execution(public * com.example.demo.service.*Service.*(..))", throwing = "ex")
    public void reThrow(JoinPoint joinPoint, Throwable ex) throws Throwable {

        if(ex instanceof DAOException){
            throw new AOPException("Exception AOP");
        }

    }
}
