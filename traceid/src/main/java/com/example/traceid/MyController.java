package com.example.traceid;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.RandomStringUtils;
import org.slf4j.MDC;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MyController {
    @GetMapping
    public void test() {
        MDC.put("traceid", RandomStringUtils.randomAlphabetic(20));
        log.info("收到请求");
        MDC.clear();
    }
}
