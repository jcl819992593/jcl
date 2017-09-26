package com.huasheng.service;

import com.huasheng.pojo.oldpojo.*;

import java.util.List;

/**
 * @desc:老数据库内容
 * @author: 江承良
 * @date: 2017/9/20 10:29
 */
public interface OldService {
    /**
     * 药物
     * @param page
     * @return
     */
    List<OldKtDrug> getOldList(int page);
    List<OldKtDrugSynonym> getOldDrugSynonymList(int page);
    List<OldKtDrugOtherName> getOldDrugOtherNameList(int page);
    List<OldKtDrugExternalId> getOldDrugExternalIdList(int page);
    List<OldKtDrugSequence> getOldDrugSequenceList(int page);
    List<OldKtDrugInteraction> getOldDrugInteractionList(int page);
    List<OldKtDrugCategory> getOldDrugCategoryList(int page);

    /**
     * 药品
     * @param page
     * @return
     */
    List<OldKtDrugProduct> getOldKtDrugProductList(int page);
    List<OldKtDrugProductEtnId> getOldDrugProductEtnIdList(int page);

    /**
     * 副反应
     * @param page
     * @return
     */
    List<OldKtSideEffect> getOldKtSideEffectList(int page);

    /**
     * 药物作用分类
     * @param page
     * @return
     */
    List<OldKtMeshCategory> getOldKtMeshCategoryList(int page);

    /**
     * 基因
     * @param page
     * @return
     */
    List<OldKtGene> getOldGeneList(int page);
    List<OldKtGeneAlias> getOldGeneAliasList(int page);
    List<OldKtGeneExternalId> getOldGeneExternalIdList(int page);
    List<OldKtGeneOtherName> getOldGeneOtherNameList(int page);
    List<OldKtGeneGenomicContext> getOldGeneGenomicContextList(int page);
    List<OldKtGeneLocation> getOldGeneLocationList(int page);

    /**
     * 适应症
     * @param page
     * @return
     */
    List<OldKtIndication> getOlcIndicationList(int page);

    /**
     * 突变
     * @param page
     * @return
     */
    List<OldKtVariant> getOldKtVariantList(int page);

    /**
     * 蛋白
     * @param page
     * @return
     */
    List<OldKtProtein> getOldKtProteinList(int page);
    List<OldKtProteinSynonym> getProteinSynonymList(int page);

    /**
     * 临床
     * @param page
     * @return
     */
    List<OldKtClinicalTrial> getOldKtClinicalTrialList(int page);
    List<OldKtClinicalTrailOutcome> getOldClinicalTrailOutcome(int page);
    List<OldKtClinicalTrailCancer> getOldClinicalTrailCancerList(int page);

    /**
     * 用药方案
     * @param page
     * @return
     */
    List<OldKtMedicationPlan> getOldKtMedicationPlanList(int page);
    List<OldKtPlanCancer> getOldPlanCancerList(int page);
    List<OldKtPlanDrug> getOldPlanDrugList(int page);
    List<OldKtPlanInstruction> getOldPlanInstructionList(int page);
    List<OldKtPlanInstructionMessage> getOldPlanInstructionMessageList(int page);
    List<OldKtPlanReference> getOldPlanReferenceList(int page);
    List<OldKtPlanStudy> getOldPlanStudyList(int page);
    /**
     * 化学分类
     * @param page
     * @return
     */
    List<OldKtChemicalClassification> getOldKtChemicalList(int page);
    List<OldKtChemicalSynonym> getOldKtChemicalSynonyms(int page);

    /**
     * 疾病
     * @param page
     * @return
     */
    List<OldKtCancer> getOldKtCancerList(int page);

    /**
     * 证据
     * @param page
     * @return
     */
    List<OldKtEvidence> getOldKtEvidence(int page);
    List<OldKtEvidenceDrug> getOldEvidenceDrugList(int page);
    List<OldKtEvidenceReference> getOldEvidenceReferenceList(int page);
}
