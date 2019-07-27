package com.example.jpa;

import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Slf4j
public class Service1 {

    @Autowired
    private InfoDao infoDao;

    @Transactional(rollbackOn = Exception.class)
    public void save1(Info info) throws Exception {
        log.info("开始保存info:{}", JSONObject.toJSONString(info));
        infoDao.save(info);
        if(info.getUname().contains("a")){
            throw new Exception("bbbbb");
        }
    }
}
