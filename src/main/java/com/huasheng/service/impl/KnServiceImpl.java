package com.huasheng.service.impl;

import com.huasheng.dao.kndao.*;
import com.huasheng.datasource.DbcontextHolder;
import com.huasheng.pojo.knpojo.*;
import com.huasheng.service.KnService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
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
    @Autowired
    private KnClinicalTrialsDao clinicalTrialsDao;
    @Autowired
    private KnClinicalTrialsGeneDao clinicalTrialsGeneDaoDao;
    @Autowired
    private KnClinicalTrialsCancerDao knClinicalTrialsCancerDao;
    @Autowired
    private KnClinicalTrialsDrugDao knClinicalTrialsDrugDao;

    @Autowired
    private KnDetectionItemDao knDetectionItemDao;
    @Autowired
    private KnDetectionitemCancerDao knDetectionitemCancerDao;
    @Autowired
    private KnDetectionitemDrugDao knDetectionitemDrugDao;
    @Autowired
    private KnDetectionSubitemDao knDetectionSubitemDao;
    @Autowired
    private KnDetectionitemDetectionsubitemDao knDetectionitemDetectionsubitemDao;
    @Autowired
    private KnDetectionOrganizationDao knDetectionOrganizationDao;
    @Autowired
    private KnDetectionitemDetectionitemorganizationDao knDetectionitemDetectionitemorganizationDao;
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

    @Override
    public List<KnClinicalTrials> getKnClinicalTrialsList() {
        DbcontextHolder.setDbType("knDataSource");
        return clinicalTrialsDao.getKnClinicalTrialsList();
    }

    @Override
    public List<KnClinicalTrialsGene> getKnClinicalTrialsGeneList() {
        DbcontextHolder.setDbType("knDataSource");
        return clinicalTrialsGeneDaoDao.getKnClinicalTrialsGeneList();
    }

    @Override
    public List<KnClinicalTrialsCancer> getKnClinicalTrialsCancerList() {
        DbcontextHolder.setDbType("knDataSource");
        return knClinicalTrialsCancerDao.getKnClinicalTrialsCancerList();
    }

    @Override
    public List<KnClinicalTrialsDrug> getKnClinicalTrialsDrugList() {
        DbcontextHolder.setDbType("knDataSource");
        return knClinicalTrialsDrugDao.getKnClinicalTrialsDrugList();
    }

    @Override
    public List<KnDetectionItem> getKnDetectionItem() {
        DbcontextHolder.setDbType("knDataSource");
        List<KnDetectionItem> itemList=knDetectionItemDao.getKnDetectionItemList();
        for(int i=0;i<itemList.size();i++){
            String subitemId = itemList.get(i).getSubitemId();
            String[] subitemIds=subitemId.split(",");
            List<KnDetectionSubitem> subitemList=new ArrayList<KnDetectionSubitem>();
            for(int j=0;j<subitemIds.length;j++){
                KnDetectionSubitem knDetectionSubitem=knDetectionSubitemDao.selectByPrimaryKey(subitemIds[j]);
                subitemList.add(knDetectionSubitem);
            }
            itemList.get(i).setKnDetectionSubitemList(subitemList);
        }
        return itemList;
    }
    @Override
    public List<KnDetectionitemCancer> getKnDetectionitemCancerList() {
        DbcontextHolder.setDbType("knDataSource");
        return knDetectionitemCancerDao.getKnDetectionitemCancerList();
    }

    @Override
    public List<KnDetectionitemDrug> getKnDetectionitemDrugList() {
        DbcontextHolder.setDbType("knDataSource");
        return knDetectionitemDrugDao.getKnDetectionitemDrugList();
    }

    @Override
    public List<KnDetectionSubitem> getKnDetectionSubitemList() {
        DbcontextHolder.setDbType("knDataSource");
        return knDetectionSubitemDao.getSubitemList();
    }

    @Override
    public List<KnDetectionSubitemCancer> getKnDetectionCancerListNew() {
        DbcontextHolder.setDbType("knDataSource");
        List<KnDetectionSubitemCancer> subitemCancerList=new ArrayList<KnDetectionSubitemCancer>();
        List<KnDetectionSubitem> subitemList=getKnDetectionSubitemList();
        for(KnDetectionSubitem knDetectionSubitem:subitemList){
            KnDetectionitemDetectionsubitem knDetectionItem = knDetectionitemDetectionsubitemDao.getBySubItemId(knDetectionSubitem.getId());
            List<KnDetectionitemCancer> knDetectionitemCancerList= knDetectionitemCancerDao.getKnDetectionitemCancerByItemId(knDetectionItem.getDetectionitemId());
            for(KnDetectionitemCancer knDetectionitemCancer:knDetectionitemCancerList){
                KnDetectionSubitemCancer subitemCancer=new KnDetectionSubitemCancer();
                subitemCancer.setDetectionSubitemId(knDetectionSubitem.getId());
                subitemCancer.setCancerId(knDetectionitemCancer.getCancerId());
                subitemCancerList.add(subitemCancer);
            }
        }
        return subitemCancerList;
    }

    @Override
    public List<KnDetectionOrganization> getKnDetectionOrganizationList() {
        DbcontextHolder.setDbType("knDataSource");
        List<KnDetectionOrganization> knDetectionOrganizationList=knDetectionOrganizationDao.getOrganizationList();
        return knDetectionOrganizationList;
    }

    @Override
    public List<KnDetectionitemDetectionitemorganization> getItemOrganizationList() {
        DbcontextHolder.setDbType("knDataSource");

        return knDetectionitemDetectionitemorganizationDao.getItemOrganizationList();
    }

}
