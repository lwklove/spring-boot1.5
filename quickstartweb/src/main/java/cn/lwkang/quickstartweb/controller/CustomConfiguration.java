package cn.lwkang.quickstartweb.controller;

import cn.lwkang.quickstartweb.customconfiguration.KProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class CustomConfiguration {
    @Resource
    private KProperties properties;
    @RequestMapping("customconfiguration")
    public String getCustom(){
        System.out.println(properties.getTitle()+"-"+properties.getDescription());
        return properties.getTitle()+"-"+properties.getDescription();
    }
}
