package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugProduct;
import com.huasheng.pojo.newpojo.KtDrugProductApproval;

import java.util.List;
import java.util.Map;

public interface KtDrugProductDao {
    int deleteByPrimaryKey(String productKey);

    int insert(KtDrugProduct record);

    int insertSelective(KtDrugProduct record);

    KtDrugProduct selectByPrimaryKey(String productKey);

    int updateByPrimaryKeySelective(KtDrugProduct record);

    int updateByPrimaryKey(KtDrugProduct record);

    /**
     * 根据药品主键查询药品和药物
     * @param productKey
     * @return
     */
    Map<String,Object> getKtDrugProductByProductKey(String productKey);

    /**
     * 根据药品主键查询机构和药物连接
     * @param productKey
     * @return
     */
    List<Map<String,Object>> getApprovalAndProduct(String productKey);

    List<Map<String,Object>> getDrugProductList(Map<String, Object> map);

    int updateKtDrugProductCheckState(KtDrugProduct ktDrugProduct);

    /**
     * 更新翻译字段
     * @param ktDrugProduct
     * @return
     */
    int updateTranslator(KtDrugProduct ktDrugProduct);

    KtDrugProduct getDrugProductById(String drugId);

    int checkEnDrug(Map<String, Object> map);
    List<KtDrugProductApproval> getApprovalTrans(String productKey);

    /**
     * 未审核药品数量
     * @param
     * @param
     * @return
     */
    int getDrugCountPending(Map<String, Object> map);

    int getDrugCountTranslateMonth(Map<String, Object> map);

    int deleteAll();

    int insertDrugProductList(List<KtDrugProduct> list);
}