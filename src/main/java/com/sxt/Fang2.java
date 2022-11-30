package com.sxt;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Primary
@Component("F2")
public class Fang2 implements LiuInter {
    @Override
    public void a() {
        System.out.println("F2");
    }
}
