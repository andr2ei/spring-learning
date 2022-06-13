package ru.andronov.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LogBeforeAspect {

    @Before("execution(* ru.andronov.services.*.*(..))")
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("Log Before: " + joinPoint.getTarget());
    }
}
