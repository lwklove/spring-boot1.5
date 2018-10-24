package cn.lwkang.thymeleafandjpa.controller;

import cn.lwkang.thymeleafandjpa.domain.User;
import cn.lwkang.thymeleafandjpa.param.UserParam;
import cn.lwkang.thymeleafandjpa.repository.UserRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import javax.validation.Valid;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
    @Resource
    private UserRepository userRepository;

    @RequestMapping("/toAdd")
    public String toAdd(){
        return "user/userAdd";
    }

    @RequestMapping("/add")
    public String add(@Valid UserParam userParam, BindingResult result, ModelMap map){
        String errorMsg = "";
        if(result.hasErrors()){
            List<ObjectError> errorList = result.getAllErrors();
            for(ObjectError error : errorList){
                errorMsg += error.getCode()+"-"+error.getDefaultMessage();
            }
            map.addAttribute("errorMsg",errorMsg);
            return "user/userAdd";
        }
        User user = userRepository.findByUserName(userParam.getUserName());
        if(user != null){
            map.addAttribute("errorMsg","用户已存在");
            return "user/userAdd";
        }
        User addUser = new User();
        BeanUtils.copyProperties(userParam,addUser);
        addUser.setRegTime(new Date());
        userRepository.save(addUser);
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(ModelMap map, @RequestParam(value = "page",defaultValue = "0") Integer page,@RequestParam(value = "size",defaultValue = "5")Integer size){
        Sort sort = new Sort(Sort.Direction.DESC,"id");
        Pageable pageable = new PageRequest(page, size, sort);
        Page<User> users = userRepository.findList(pageable);
        map.addAttribute("users",users);
        return "user/list";
    }

    @RequestMapping("/delete")
    public String del(Long id){
        userRepository.deleteById(id);
        return "redirect:/list";
    }

    @RequestMapping("toEdit")
    public String toEdit(ModelMap map,Long id){
        User user = userRepository.findById(id);
        map.addAttribute("user",user);
        return "user/userEdit";
    }

    @RequestMapping("/edit")
    public String edit(@Valid UserParam userParam,BindingResult result,ModelMap map){
        String errorMsg = "";
        if(result.hasErrors()){
            List<ObjectError> errorList = result.getAllErrors();
            for (ObjectError error : errorList){
                errorMsg += error.getCode()+"-"+error.getDefaultMessage();
            }
            map.addAttribute("errorMsg",errorMsg);
            return "user/userEdit";
        }

        User user = new User();
        BeanUtils.copyProperties(userParam,user);
        user.setRegTime(new Date());
        userRepository.save(user);
        return "redirect:/list";
    }
}
