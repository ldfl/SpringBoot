package com.sxt;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component("F1")
public class Fang1 implements LiuInter {
    @Override
    public void a() {
        System.out.println("20251025");
        System.out.println("F1");
    }
}
