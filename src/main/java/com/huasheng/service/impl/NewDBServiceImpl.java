package com.huasheng.service.impl;

import com.huasheng.dao.newdao.KtDrugDao;
import com.huasheng.datasource.DbcontextHolder;
import com.huasheng.pojo.newpojo.KtDrug;
import com.huasheng.service.NewDBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @desc:
 * @author: 江承良
 * @date: 2017/9/19 15:12
 */
@Service
public class NewDBServiceImpl implements NewDBService {
    @Autowired
    private KtDrugDao drugDao;

    @Override
    public List<KtDrug> getDrugList() {
        DbcontextHolder.setDbType("newDataSource");
        /*KtDrug drug = drugDao.selectByPrimaryKey("0e4c3b64c5dea35b4dcebbe80e131d9a");
        List<KtDrug> drugList = new ArrayList<KtDrug>();*/
        List<KtDrug> drugList = drugDao.getNewDrugList();
        return drugList;
    }
}
