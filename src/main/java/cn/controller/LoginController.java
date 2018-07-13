package java.cn.controller;

import java.cn.domain.User;
import java.cn.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

@Controller
public class LoginController {

    @Resource
    private UserService userService;

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(@RequestBody User user){
        User user1 = userService.selectById(user.getId());
        return "index";
    }
}
