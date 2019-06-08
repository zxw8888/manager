package cn.tedu.controller;

import cn.tedu.pojo.Users;
import cn.tedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Auther: panda
 * @Date: 2019/5/14
 * @Descripton: cn.tedu.controller
 * @version: 1.0
 */
@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping("findAll")
    @ResponseBody
    public List<Users> findAllUser() {
        System.out.println("findAll");
        System.out.println(userService.findAllUser());
        return userService.findAllUser();
    }

    @RequestMapping("hello")
    public String hello() {
        System.out.println("9999999");
        return "addUser";
    }

    @RequestMapping("addUser")
    public String hello(Users users) {
        System.out.println("555555");
        try {
            userService.addUser(users);
            System.out.println(users);
            return "ok";
        } catch (Exception e) {
            return "error";
        }
    }
}
