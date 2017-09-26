package com.huasheng.service.impl;

import com.huasheng.dao.kndao.*;
import com.huasheng.datasource.DbcontextHolder;
import com.huasheng.pojo.knpojo.*;
import com.huasheng.service.KnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @desc:
 * @author: 江承良
 * @date: 2017/9/25 10:05
 */
@Service
public class KnServiceImpl implements KnService {
    @Autowired
    private KnDrugDao drugDao;
    @Autowired
    private KnAdverseReactionsDao adverseReactionsDao;
    @Autowired
    private KnCancerDao cancerDao;
    @Autowired
    private KnCancerAliasDao cancerAliasDao;
    @Autowired
    private KnCancerPhenotypicDao cancerPhenotypicDao;
    @Autowired
    private KnGeneDao geneDao;
    @Autowired
    private KnGeneCancerDao geneCancerDao;
    @Autowired
    private KnDocumentDao documentDao;
    @Autowired
    private KnDrugAliasDao drugAliasDao;
    @Autowired
    private KnScientficResearchDao scientficResearchDao;
    @Autowired
    private KnScientficResearchCancerDao scientficResearchCancerDao;
    @Autowired
    private KnScientficResearchDrugDao scientficResearchDrugDao;
    @Autowired
    private KnScientficResearchGeneDao scientficResearchGeneDao;
    @Autowired
    private KnInheritedTumorSyndromeDao inheritedTumorSyndromeDao;
    @Autowired
    private KnInheritedTumorSyndromeCancerDao inheritedTumorSyndromeCancerDao;
    @Autowired
    private KnInheritedTumorSyndromeGeneDao inheritedTumorSyndromeGeneDao;
    @Autowired
    private KnGeneMutationDao geneMutationDao;
    @Autowired
    private KnGeneMetabolismDao geneMetabolismDao;
    @Autowired
    private KnGeneGeneMetabolismDao geneGeneMetabolismDao;

    @Override
    public List<KnDrug> getKnDrugList() {
        DbcontextHolder.setDbType("knDataSource");
        return drugDao.getKnDrugList();
    }

    @Override
    public List<KnDrugAlias> getKnDrugAliasList() {
        DbcontextHolder.setDbType("knDataSource");
        return drugAliasDao.getKnDrugAliasList();
    }

    @Override
    public List<KnAdverseReactions> getKnAdverseReactionsList() {
        DbcontextHolder.setDbType("knDataSource");
        return adverseReactionsDao.getKnAdverseReactionsList();
    }

    @Override
    public List<KnCancer> getKnCancerList() {
        DbcontextHolder.setDbType("knDataSource");
        return cancerDao.getKnCancerList();
    }

    @Override
    public List<KnCancerAlias> getKnCancerAliasList() {
        DbcontextHolder.setDbType("knDataSource");
        return cancerAliasDao.getKnCancerAliasList();
    }

    @Override
    public List<KnCancerPhenotypic> getKnCancerPhenotypicList() {
        DbcontextHolder.setDbType("knDataSource");
        return cancerPhenotypicDao.getKnCancerPhenotypicList();
    }

    @Override
    public List<KnGene> getKnGeneList() {
        DbcontextHolder.setDbType("knDataSource");
        return geneDao.getKnGeneList();
    }

    @Override
    public List<KnGeneCancer> getKnGeneCancerList() {
        DbcontextHolder.setDbType("knDataSource");
        return geneCancerDao.getKnGeneCancerList();
    }

    @Override
    public List<KnGeneGeneMetabolism> getKnGeneGeneMetabolismList() {
        DbcontextHolder.setDbType("knDataSource");
        return geneGeneMetabolismDao.getKnGeneGeneMetabolismList();
    }

    @Override
    public List<KnDocument> getKnDocumentList() {
        DbcontextHolder.setDbType("knDataSource");
        return documentDao.getKnDocumentList();
    }

    @Override
    public List<KnScientficResearch> getKnScientficResearchList() {
        DbcontextHolder.setDbType("knDataSource");
        return scientficResearchDao.getKnScientficResearchList();
    }

    @Override
    public List<KnScientficResearchCancer> getKnScientficResearchCancerList() {
        DbcontextHolder.setDbType("knDataSource");
        return scientficResearchCancerDao.getKnScientficResearchCancerList();
    }

    @Override
    public List<KnScientficResearchDrug> getKnScientficResearchDrugList() {
        DbcontextHolder.setDbType("knDataSource");
        return scientficResearchDrugDao.getKnScientficResearchDrugList();
    }

    @Override
    public List<KnScientficResearchGene> getKnScientficResearchGeneList() {
        DbcontextHolder.setDbType("knDataSource");
        return scientficResearchGeneDao.getKnScientficResearchGeneList();
    }

    @Override
    public List<KnInheritedTumorSyndrome> getKnInheritedTumorSyndromeList() {
        DbcontextHolder.setDbType("knDataSource");
        return inheritedTumorSyndromeDao.getKnInheritedTumorSyndromeList();
    }

    @Override
    public List<KnInheritedTumorSyndromeCancer> getKnInheritedTumorSyndromeCancerList() {
        DbcontextHolder.setDbType("knDataSource");
        return inheritedTumorSyndromeCancerDao.getKnInheritedTumorSyndromeCancerList();
    }

    @Override
    public List<KnInheritedTumorSyndromeGene> getKnInheritedTumorSyndromeGeneList() {
        DbcontextHolder.setDbType("knDataSource");
        return inheritedTumorSyndromeGeneDao.getKnInheritedTumorSyndromeGeneList();
    }

    @Override
    public List<KnGeneMutation> getKnGeneMutationList() {
        DbcontextHolder.setDbType("knDataSource");
        return geneMutationDao.getKnGeneMutationList();
    }

    @Override
    public List<KnGeneMetabolism> getKnGeneMetabolismList() {
        DbcontextHolder.setDbType("knDataSource");
        return geneMetabolismDao.getKnGeneMetabolismList();
    }
}
