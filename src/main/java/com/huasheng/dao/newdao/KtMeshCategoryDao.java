package com.huasheng.dao.newdao;

import com.huasheng.pojo.newpojo.KtDrugCategory;
import com.huasheng.pojo.newpojo.KtMeshCategory;

import java.util.List;
import java.util.Map;

public interface KtMeshCategoryDao {
    int deleteByPrimaryKey(String meshCategoryKey);

    int insert(KtMeshCategory record);

    int insertSelective(KtMeshCategory record);

    KtMeshCategory selectByPrimaryKey(String meshCategoryKey);

    int updateByPrimaryKeySelective(KtMeshCategory record);

    int updateByPrimaryKeyWithBLOBs(KtMeshCategory record);

    int updateByPrimaryKey(KtMeshCategory record);

    List<KtMeshCategory> getMeshCategoryList(Map map);

    /**
     * 未翻译数量
     * @param map
     * @return
     */
    int getmeshCategoryPending(Map<String, Object> map);

    int getmeshCategoryMonth(Map<String, Object> map);

    List<KtDrugCategory> getMeshCategoryByList(List<KtDrugCategory> list);

    int deleteAllMeshCategory();

    int insertMeshCategoryList(List<KtMeshCategory> list);

    KtMeshCategory selectByMeshId(String meshId);
}