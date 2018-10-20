package cn.lwkang.quickstartweb.controller;

import cn.lwkang.quickstartweb.domain.User;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @RequestMapping("/getUser")
    public User getUser(User user){
        return new User("kk",22,"123456");
    }

    @RequestMapping("/getUsers")
    public List<User> getUsers(){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("xiao ming",13,"123"));
        users.add(new User("xiao hong",15,"456"));
        return users;
    }

    @RequestMapping("/get/{name}")
    public String get(@PathVariable String name){
        return "hello ,"+name;
    }

    @RequestMapping("saveUser")
    public List<ObjectError> saveUser(@Valid User user, BindingResult result){
        System.out.println("user:"+user);
        if (result.hasErrors()){
            List<ObjectError> list = result.getAllErrors();
            for (ObjectError error : list){
                System.out.println(error.getCode()+"-"+error.getDefaultMessage());
            }
            return list;
        }
        return null;
    }
}
