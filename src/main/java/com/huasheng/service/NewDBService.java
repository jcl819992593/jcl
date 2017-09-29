package com.huasheng.service;

import com.huasheng.pojo.knpojo.*;
import com.huasheng.pojo.oldpojo.*;

import java.util.List;

/**
 * @desc:将数据插入新数据库
 * @author: 江承良
 * @date: 2017/9/19 15:12
 */
public interface NewDBService {
    /**
     * 药物
     * @param oldKtDrugs
     * @return
     */
    int insertDrugList(List<KnDrug> oldKtDrugs);
    int insertDrugSynonymList(List<OldKtDrugSynonym> drugSynonymList);
    int insertDrugOtherNameList(List<OldKtDrugOtherName> otherNameList);
    int insertDrugExternalIdList(List<OldKtDrugExternalId> externalIdList);
    int insertDrugSequenceList(List<OldKtDrugSequence> sequenceList);
    int insertDrugInteractionList(List<OldKtDrugInteraction> interactionList);
    int insertDrugCategoryList(List<OldKtDrugCategory> categoryList);
    int insertKnDrugAlias(List<KnDrugAlias> knDrugAliasList);

    /**
     * 药品
     * @param productList
     * @return
     */
    int insertDrugProduct(List<OldKtDrugProduct> productList);
    int insertDrugProductEtnId(List<OldKtDrugProductEtnId> productEtnIdList);

    /**
     * 副反应
     * @param sideEffects
     * @return
     */
    int insertKtSideEffect(List<OldKtSideEffect> sideEffects);
    int insertKnSideEffect(List<KnAdverseReactions> knAdverseReactionsList);

    /**
     * 药物作用分类
     * @param meshCategoryList
     * @return
     */
    int insertMeshCategory(List<OldKtMeshCategory> meshCategoryList);

    /**
     * 基因
     * @param oldGeneList
     * @return
     */
    int insertGeneList(List<OldKtGene> oldGeneList);
    int insertGeneAliasList(List<OldKtGeneAlias> geneAliasList);
    int insertGeneExternalIdList(List<OldKtGeneExternalId> geneExternalIdList);
    int insertGeneOtherNameList(List<OldKtGeneOtherName> geneOtherNameList);
    int insertGeneGenomicContextList(List<OldKtGeneGenomicContext> genomicContextList);
    int insertGeneLocationList(List<OldKtGeneLocation> geneLocationList);

    int insertKnGeneList(List<KnGene> knGeneList);
    int insertKnGeneCancer(List<KnGeneCancer> geneCancerList);
    int insertKtGeneKeggPathway(List<KnGeneGeneMetabolism> geneGeneMetabolismList);

    /**
     * 适应症
     * @param indicationList
     * @return
     */
    int insertIndication(List<OldKtIndication> indicationList);

    /**
     * 突变
     * @param variantList
     * @return
     */
    int insertVariantList(List<OldKtVariant> variantList);
    int insertKtVariantList(List<KnGeneMutation> geneMutationList);

    /**
     * 蛋白
     * @param proteinList
     * @return
     */
    int insertProteinList(List<OldKtProtein> proteinList);
    int insertProteinSynonymList(List<OldKtProteinSynonym> proteinSynonymList);

    /**
     * 临床试验
     * @param clinicalTrialList
     * @return
     */
    int insertClinicalTrialList(List<OldKtClinicalTrial> clinicalTrialList);
    int insertClinicalTrailOutcomeList(List<OldKtClinicalTrailOutcome> clinicalTrailOutcomeList);
    int insertClinicalTrailCancerList(List<OldKtClinicalTrailCancer> clinicalTrailCancerList);

    /**
     * 用药方案
     * @param medicationPlanList
     * @return
     */
    int insertMedicationPlanList(List<OldKtMedicationPlan> medicationPlanList);
    int insertPlanCancerList(List<OldKtPlanCancer> planCancerList);
    int insertPlanDrugList(List<OldKtPlanDrug> planDrugList);
    int insertPlanInstructionList(List<OldKtPlanInstruction> planInstructionList);
    int insertPlanInstructionMessageList(List<OldKtPlanInstructionMessage> instructionMessageList);
    int insertPlanReferenceList(List<OldKtPlanReference> planReferenceList);
    int insertPlanStudyList(List<OldKtPlanStudy> planStudyList);

    /**
     * 化学分类
     * @param classificationList
     * @return
     */
    int insertChemicalCategoryList(List<OldKtChemicalClassification> classificationList);
    int updateChemicalCategory(int page);
    int insertKtChemicalCategorySynonymList(List<OldKtChemicalSynonym> chemicalSynonymList);

    /**
     * 疾病
     * @param cancerList
     * @return
     */
    int insertCancerList(List<OldKtCancer> cancerList);
    int updateCancer(int page);
    int insertKnCancerList(List<KnCancer> knCancerList);
    int insertKnCancerAliasList(List<KnCancerAlias> cancerAliasList);
    int insertKnCancerPhenotypicList(List<KnCancerPhenotypic> knCancerPhenotypicList);

    /**
     * 证据
     * @param evidenceList
     * @return
     */
    int insertEvidenceList(List<OldKtEvidence> evidenceList);
    int insertEvidenceDrugList(List<OldKtEvidenceDrug> evidenceDrugList);
    int insertEvidenceReferenceList(List<OldKtEvidenceReference> evidenceReferenceList);

    /**
     * 文献
     * @return
     */
    int insertKnDocumentList(List<KnDocument> documentList);

    /**
     * 科学研究
     * @param scientficResearchList
     * @return
     */
    int insertKnScientficResearch(List<KnScientficResearch> scientficResearchList);
    int insertKnScientficResearchCancer(List<KnScientficResearchCancer> scientficResearchCancerList);
    int insertKnScientficResearchDrug(List<KnScientficResearchDrug> scientficResearchDrugList);
    int insertKnScientficResearchGene(List<KnScientficResearchGene> scientficResearchGeneList);

    /**
     * 遗传性肿瘤综合症
     * @param inheritedTumorSyndromeList
     * @return
     */
    int insertKtSyndromeGeneCancer(List<KnInheritedTumorSyndrome> inheritedTumorSyndromeList);
    int insertKtSyndromeCancer(List<KnInheritedTumorSyndromeCancer> inheritedTumorSyndromeCancerList);
    int insertKtSyndromeGene(List<KnInheritedTumorSyndromeGene> inheritedTumorSyndromeGeneList);

    int insertktKeggPathWay(List<KnGeneMetabolism> geneMetabolismList);


    /**
     * 临床试验
     * @param clinicalTrialsList
     * @return
     */
    int insertKtClinicalTrials(List<KnClinicalTrials> clinicalTrialsList);
    int insertKnKnClinicalTrialsGene(List<KnClinicalTrialsGene> clinicalTrialsGenesList);
    int insertKnClinicalTrailCancerList(List<KnClinicalTrialsCancer> knClinicalTrialsCancerList);
    int insertKnClinicalTrialsDrugList(List<KnClinicalTrialsDrug> knClinicalTrialsDrugList);

    /**
     * 基因检测
     * @param knDetectionItemList
     * @return
     */
    int insertKnDetectionItemList(List<KnDetectionItem> knDetectionItemList);
    int insertKnDetectionitemCancerList(List<KnDetectionitemCancer> knDetectionitemCancerList);
    int insertKnDetectionitemDrugList(List<KnDetectionitemDrug> knDetectionitemDrugList);

    int insertKnDetectionItemSubList(List<KnDetectionSubitem> knDetectionSubitemList);

    int insertItemOrganization(List<KnDetectionitemDetectionitemorganization> knDetectionitemDetectionitemorganizationList);
}
