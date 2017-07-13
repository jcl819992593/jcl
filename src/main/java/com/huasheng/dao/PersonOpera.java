package com.huasheng.dao;

import com.huasheng.pojo.Person;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/**
 * Created by admin on 2017/7/11.
 */
@Repository
public interface PersonOpera {
    public List<Person> getPerson();
    public Person getByParam(Map map);
}
