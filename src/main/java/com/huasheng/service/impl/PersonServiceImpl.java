package com.huasheng.service.impl;

import com.huasheng.dao.PersonOpera;
import com.huasheng.pojo.Person;
import com.huasheng.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;


/**
 * Created by admin on 2017/7/11.
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonOpera personOpera;

    @Override
    public void getByMap() {
        HashMap<String, Object> maps = new HashMap<String, Object>();
        maps.put("uId",1);
        maps.put("name","zhangsan");
        Person person = personOpera.getByParam(maps);
        System.out.println(person);
    }

    @Override
    public void getPerson() {
        List<Person> persons = personOpera.getPerson();
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}
