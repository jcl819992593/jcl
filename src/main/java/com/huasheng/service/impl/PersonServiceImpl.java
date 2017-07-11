package com.huasheng.service.impl;

import com.huasheng.dao.PersonOpera;
import com.huasheng.pojo.Person;
import com.huasheng.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * Created by admin on 2017/7/11.
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
     private PersonOpera personOpera;

    @Override
    public Person getPerson() {
        Person person = personOpera.getPerson();
        return person;
    }
}
