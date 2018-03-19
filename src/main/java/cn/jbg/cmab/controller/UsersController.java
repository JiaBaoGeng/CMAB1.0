package cn.jbg.cmab.controller;

import cn.jbg.cmab.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by jbg on 2018/2/8.
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/UsersController")
public class UsersController {

    @Autowired
    private UsersService usersService;
    @ResponseBody
    @RequestMapping("/cmab")
    public String test(){
        return usersService.test();
    }
}
