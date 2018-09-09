package com.demo.demo;

import lombok.Data;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() throws Exception {
        while(true){
           C1 c1 = new C1();
           c1.setContent(RandomStringUtils.randomAlphabetic(10000));
//            System.out.println(c1);
//            Thread.sleep(500l);
        }

    }

    @Data
    class C1{
        private String content;
    }

    @Data
    class C2{
        private String content;
    }


}
