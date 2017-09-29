package com.huasheng.service;

import com.huasheng.pojo.knpojo.*;

import java.util.List;

/**
 * @desc:
 * @author: 江承良
 * @date: 2017/9/25 10:05
 */
public interface KnService {
    /**
     * 药物
     * @return
     */
    List<KnDrug> getKnDrugList();
    List<KnDrugAlias> getKnDrugAliasList();

    /**
     * 副反应
     * @return
     */
    List<KnAdverseReactions> getKnAdverseReactionsList();

    /**
     * 疾病
     * @return
     */
    List<KnCancer> getKnCancerList();
    List<KnCancerAlias> getKnCancerAliasList();
    List<KnCancerPhenotypic> getKnCancerPhenotypicList();

    /**
     * 基因
     * @return
     */
    List<KnGene> getKnGeneList();
    List<KnGeneCancer> getKnGeneCancerList();
    List<KnGeneGeneMetabolism> getKnGeneGeneMetabolismList();

    /**
     * 文献
     * @return
     */
    List<KnDocument> getKnDocumentList();

    /**
     * 科学研究
     * @return
     */
    List<KnScientficResearch> getKnScientficResearchList();
    List<KnScientficResearchCancer> getKnScientficResearchCancerList();
    List<KnScientficResearchDrug> getKnScientficResearchDrugList();
    List<KnScientficResearchGene> getKnScientficResearchGeneList();

    /**
     * 遗传性肿瘤综合症
     * @return
     */
    List<KnInheritedTumorSyndrome> getKnInheritedTumorSyndromeList();
    List<KnInheritedTumorSyndromeCancer> getKnInheritedTumorSyndromeCancerList();
    List<KnInheritedTumorSyndromeGene> getKnInheritedTumorSyndromeGeneList();

    /**
     * 突变
     * @return
     */
    List<KnGeneMutation> getKnGeneMutationList();

    /**
     * 基因通路
     * @return
     */
    List<KnGeneMetabolism> getKnGeneMetabolismList();

    /**
     * 临床试验
     * @return
     */
    List<KnClinicalTrials> getKnClinicalTrialsList();
    List<KnClinicalTrialsGene> getKnClinicalTrialsGeneList();
    List<KnClinicalTrialsCancer> getKnClinicalTrialsCancerList();
    List<KnClinicalTrialsDrug> getKnClinicalTrialsDrugList();

    /**
     * 基因检测
     * @return
     */
    List<KnDetectionItem> getKnDetectionItem();
    List<KnDetectionitemCancer> getKnDetectionitemCancerList();
    List<KnDetectionitemDrug> getKnDetectionitemDrugList();
    List<KnDetectionSubitem> getKnDetectionSubitemList();

    List<KnDetectionSubitemCancer> getKnDetectionCancerListNew();

    List<KnDetectionOrganization> getKnDetectionOrganizationList();

    List<KnDetectionitemDetectionitemorganization> getItemOrganizationList();
}
