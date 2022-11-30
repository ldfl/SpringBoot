package com.sxt;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
   // @Myannotation
   @Pointcut(value = "execution(* com.sxt.MyController.demo())")
    @RequestMapping("/A")
    public String demo() {
        System.out.println("demo");
        return "succ";
    }
}
