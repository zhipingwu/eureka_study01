package com.example.client;

import com.netflix.discovery.converters.Auto;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.math.RandomUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ClientApplicationTests {
    @Autowired
    private MyController myController;

    @Test
    public void contextLoads() {
        for (int i = 0; i < 122222; i++) {
            try {
                Thread.sleep(RandomUtils.nextInt(2000));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            log.info(myController.test());
        }
    }

}
