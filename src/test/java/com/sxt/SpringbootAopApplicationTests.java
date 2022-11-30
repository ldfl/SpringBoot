package com.sxt;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class SpringbootAopApplicationTests {
    //@Resource
    @Autowired
    //@Qualifier("F1")
    private LiuInter liuInter;

    @Test
    void contextLoads() {
        liuInter.a(); // F1
    }

}
