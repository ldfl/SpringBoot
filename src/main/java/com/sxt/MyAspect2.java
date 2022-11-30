package com.sxt;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAspect2 {
//    @Pointcut(value = "@annotation(com.sxt.Myannotation)")
//    public void pointMethod() {
//    }
    @Before("com.sxt.MyController.demo()")
    public void beforeMethod() {
        System.out.println("before... ");
    }
//    @After("pointMethod()")
//    public void After() {
//        System.out.println("After... ");
//    }
//    @AfterReturning("pointMethod()")
//    public void After2() {
//        System.out.println("After2... ");
//    }
//    @AfterThrowing("pointMethod()")
//    public void After3() {
//        System.out.println("exception... ");
//    }
//    @Around("pointMethod()")
//    public Object arround(ProceedingJoinPoint p){
//        System.out.println("环绕的前置通知");
//        Object proceed = null;
//        try {
//            proceed = p.proceed();
//        } catch (Throwable throwable) {
//            System.out.println("环绕通知发现异常..");
//        }
//        System.out.println("环绕的后置通知");
//        return proceed;
//    }
}
