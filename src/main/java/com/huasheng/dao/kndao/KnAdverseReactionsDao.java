package com.huasheng.dao.kndao;

import com.huasheng.pojo.knpojo.KnAdverseReactions;

import java.util.List;

public interface KnAdverseReactionsDao {
    int deleteByPrimaryKey(String id);

    int insert(KnAdverseReactions record);

    int insertSelective(KnAdverseReactions record);

    KnAdverseReactions selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(KnAdverseReactions record);

    int updateByPrimaryKey(KnAdverseReactions record);

    List<KnAdverseReactions> getKnAdverseReactionsList();
}