package cn.lwkang.thymeleaf.controller;

import cn.lwkang.thymeleaf.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class HelloController {
    @RequestMapping("/hello")
    public String hello(ModelMap map){
        map.addAttribute("msg","http://lwkang.cn");
        return "hello";
    }

    @GetMapping("/index")
    public String index(ModelMap map){
        return "index";
    }

    @RequestMapping("home")
    public String home(ModelMap map){
        return "home";
    }

    @RequestMapping("/layout")
    public String layout(){
        return "layout";
    }

    @RequestMapping("/text")
    public String text(ModelMap map){
        map.addAttribute("userName","kk");
        return "example";
    }

    @RequestMapping("/ifunless")
    public String ifUnless(ModelMap map){
        map.addAttribute("flag","yes");
        return "ifunless";
    }

    @RequestMapping("/ifthen")
    public String ifthen(ModelMap map){
        map.addAttribute("age",10);
        return "ifthen";
    }

    @RequestMapping("/users")
    public String users(ModelMap map){
        List<User> users = new ArrayList<>();
        users.add(new User("kk","15","123456"));
        users.add(new User("xiao ming","12","654321"));
        map.addAttribute("users",users);
        return "users";
    }

    @RequestMapping("/href")
    public String url(ModelMap map){
        map.addAttribute("type","codeing");
        map.addAttribute("pageId",15);
        return "href";
    }

    @RequestMapping("/style")
    public String style(ModelMap map){
        map.addAttribute("img","https://www.google.com/images/branding/googlelogo/1x/googlelogo_color_272x92dp.png");
        return "style";
    }

    @RequestMapping("/inline")
    public String inline(ModelMap map){
        map.addAttribute("userName","kk");
        return "inline";
    }

    @RequestMapping("/util")
    public String util(ModelMap map){
        List<User> users = new ArrayList<>();
        users.add(new User("xiao ming","15","123456"));
        map.addAttribute("users",users);
        map.addAttribute("date",new Date());
        map.addAttribute("userName","kk");
        map.addAttribute("count",12);
        return "util";
    }

}
