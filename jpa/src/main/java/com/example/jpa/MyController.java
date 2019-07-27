package com.example.jpa;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @Autowired
    private Service1 service1;

    @GetMapping("save")
    public void save() throws Exception {
        Info info = new Info();
        info.setUname(RandomStringUtils.randomAlphabetic(20));
        service1.save1(info);
    }
}
