package com.example.provider;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class MyController {
    @GetMapping("/test")
    public String test() {
        log.info("received request /test");
        return RandomStringUtils.randomAlphanumeric(20);
    }

}
