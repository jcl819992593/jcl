package com.huasheng.controller;

import com.huasheng.pojo.Person;
import com.huasheng.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by admin on 2017/7/10.
 */
@Controller
public class IndexController {
    @Autowired
    PersonService personService;

    @RequestMapping("/")
    public String nnn(){
        System.out.println("=========================asdasdasds======================");
        System.out.println("使用GitLab");
        Person person = personService.getPerson();
        System.out.println(person);
        return "index";

    }

}
