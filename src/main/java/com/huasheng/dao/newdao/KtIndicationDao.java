package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugIndication;
import com.huasheng.pojo.newpojo.KtDrugStructuredIndication;
import com.huasheng.pojo.newpojo.KtIndication;

import java.util.List;
import java.util.Map;

public interface KtIndicationDao {
    int deleteByPrimaryKey(String indicationKey);

    int insert(KtIndication record);

    int insertSelective(KtIndication record);

    KtIndication selectByPrimaryKey(String indicationKey);

    int updateByPrimaryKeySelective(KtIndication record);

    int updateByPrimaryKey(KtIndication record);

    /**
     * 分页
     * @param map
     * @return
     */
    List<KtIndication> getIndicationPage(Map<String, Object> map);

    /**
     * 更新检查状态
     * @param indication
     * @return
     */
    int updateCheckState(KtIndication indication);

    /**
     * 查数量
     * @param map
     * @return
     */
    int getIndicationPending(Map<String, Object> map);

    int getIndicationMonth(Map<String, Object> map);

    List<KtDrugIndication> getKtIndicationByList(List<KtDrugStructuredIndication> list);

    int deleteAllIndication();
}