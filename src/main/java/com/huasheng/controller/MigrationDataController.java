package com.huasheng.controller;

import com.huasheng.pojo.newpojo.KtDrug;
import com.huasheng.service.NewDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by admin on 2017/7/10.
 */
@Controller
@RequestMapping("/migrationData")
public class MigrationDataController {
    @Autowired
    private NewDBService newDBService;

    @RequestMapping("/newDBTest")
    @ResponseBody
    public List<KtDrug> newDBTest(){
        System.out.println("asdfasdfdsf");
        List<KtDrug> drugList = newDBService.getDrugList();
        return drugList;
    }
}
