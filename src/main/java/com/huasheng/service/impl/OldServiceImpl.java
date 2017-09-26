package com.huasheng.service.impl;

import com.github.pagehelper.PageHelper;
import com.huasheng.dao.olddao.*;
import com.huasheng.datasource.DbcontextHolder;
import com.huasheng.pojo.oldpojo.*;
import com.huasheng.service.OldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @desc:
 * @author: 江承良
 * @date: 2017/9/20 10:29
 */
@Service
public class OldServiceImpl implements OldService {
    @Autowired
    private OldKtDrugDao oldKtDrugDao;
    @Autowired
    private OldKtDrugProductDao productDao;
    @Autowired
    private OldKtSideEffectDao sideEffectDao;
    @Autowired
    private OldKtMeshCategoryDao meshCategoryDao;
    @Autowired
    private OldKtGeneDao geneDao;
    @Autowired
    private OldKtIndicationDao indicationDao;
    @Autowired
    private OldKtVariantDao variantDao;
    @Autowired
    private OldKtProteinDao proteinDao;
    @Autowired
    private OldKtClinicalTrialDao clinicalTrialDao;
    @Autowired
    private OldKtMedicationPlanDao medicationPlanDao;
    @Autowired
    private OldKtChemicalClassificationDao chemicalClassificationDao;
    @Autowired
    private OldKtCancerDao cancerDao;
    @Autowired
    private OldKtEvidenceDao evidenceDao;
    @Autowired
    private OldKtProteinSynonymDao proteinSynonymDao;
    @Autowired
    private OldKtChemicalSynonymDao chemicalSynonymDao;
    @Autowired
    private OldKtDrugSynonymDao drugSynonymDao;
    @Autowired
    private OldKtDrugOtherNameDao drugOtherNameDao;
    @Autowired
    private OldKtDrugExternalIdDao drugExternalIdDao;
    @Autowired
    private OldKtDrugSequenceDao drugSequenceDao;
    @Autowired
    private OldKtDrugProductEtnIdDao productEtnIdDao;
    @Autowired
    private OldKtDrugInteractionDao drugInteractionDao;
    @Autowired
    private OldKtClinicalTrailOutcomeDao clinicalTrailOutcomeDao;
    @Autowired
    private OldKtGeneAliasDao geneAliasDao;
    @Autowired
    private OldKtGeneExternalIdDao geneExternalIdDao;
    @Autowired
    private OldKtGeneOtherNameDao geneOtherNameDao;
    @Autowired
    private OldKtGeneGenomicContextDao geneGenomicContextDao;
    @Autowired
    private OldKtGeneLocationDao geneLocationDao;
    @Autowired
    private OldKtClinicalTrailCancerDao clinicalTrailCancerDao;
    @Autowired
    private OldKtDrugCategoryDao drugCategoryDao;
    @Autowired
    private OldKtEvidenceDrugDao evidenceDrugDao;
    @Autowired
    private OldKtEvidenceReferenceDao evidenceReferenceDao;
    @Autowired
    private OldKtPlanCancerDao planCancerDao;
    @Autowired
    private OldKtPlanDrugDao planDrugDao;
    @Autowired
    private OldKtPlanInstructionDao planInstructionDao;
    @Autowired
    private OldKtPlanInstructionMessageDao instructionMessageDao;
    @Autowired
    private OldKtPlanReferenceDao planReferenceDao;
    @Autowired
    private OldKtPlanStudyDao planStudyDao;

    @Override
    public List<OldKtDrug> getOldList(int page) {
        setDataSourceAndPage(page);
        return oldKtDrugDao.getOldDrugList();
    }

    @Override
    public List<OldKtDrugSynonym> getOldDrugSynonymList(int page) {
        setDataSourceAndPage(page);
        return drugSynonymDao.getDrugSynonymList();
    }

    @Override
    public List<OldKtDrugOtherName> getOldDrugOtherNameList(int page) {
        setDataSourceAndPage(page);
        return drugOtherNameDao.getOldDrugOtherNameList();
    }

    @Override
    public List<OldKtDrugExternalId> getOldDrugExternalIdList(int page) {
        setDataSourceAndPage(page);
        return drugExternalIdDao.getOldKtDrugExternalIdList();
    }

    @Override
    public List<OldKtDrugSequence> getOldDrugSequenceList(int page) {
        setDataSourceAndPage(page);
        return drugSequenceDao.getOldKtDrugSequenceList();
    }

    @Override
    public List<OldKtDrugInteraction> getOldDrugInteractionList(int page) {
        setDataSourceAndPage(page);
        return drugInteractionDao.getOldDrugInteractionList();
    }

    @Override
    public List<OldKtDrugCategory> getOldDrugCategoryList(int page) {
        setDataSourceAndPage(page);
        return drugCategoryDao.getOldDrugCategoryList();
    }

    @Override
    public List<OldKtDrugProduct> getOldKtDrugProductList(int page) {
        setDataSourceAndPage(page);
        return productDao.getOldKtDrugProductList();
    }

    @Override
    public List<OldKtDrugProductEtnId> getOldDrugProductEtnIdList(int page) {
        setDataSourceAndPage(page);
        return productEtnIdDao.getOldKtDrugProductEtnIdList();
    }

    @Override
    public List<OldKtSideEffect> getOldKtSideEffectList(int page) {
        setDataSourceAndPage(page);
        return sideEffectDao.getOldKtSideEffectList();
    }

    @Override
    public List<OldKtMeshCategory> getOldKtMeshCategoryList(int page) {
        setDataSourceAndPage(page);
        return meshCategoryDao.getOldMeshCategoryList();
    }

    @Override
    public List<OldKtGene> getOldGeneList(int page) {
        setDataSourceAndPage(page);
        return geneDao.getOldGeneList();
    }

    @Override
    public List<OldKtGeneAlias> getOldGeneAliasList(int page) {
        setDataSourceAndPage(page);
        return geneAliasDao.getOldKtGeneAliasList();
    }

    @Override
    public List<OldKtGeneExternalId> getOldGeneExternalIdList(int page) {
        setDataSourceAndPage(page);
        return geneExternalIdDao.getOldGeneExternalIdList();
    }

    @Override
    public List<OldKtGeneOtherName> getOldGeneOtherNameList(int page) {
        setDataSourceAndPage(page);
        return geneOtherNameDao.getOldGeneOtherNameList();
    }

    @Override
    public List<OldKtGeneGenomicContext> getOldGeneGenomicContextList(int page) {
        setDataSourceAndPage(page);
        return geneGenomicContextDao.getOldGeneGenomicContextList();
    }

    @Override
    public List<OldKtGeneLocation> getOldGeneLocationList(int page) {
        setDataSourceAndPage(page);
        return geneLocationDao.getOldGeneLocationList();
    }

    @Override
    public List<OldKtIndication> getOlcIndicationList(int page) {
        setDataSourceAndPage(page);
        return indicationDao.getOldKtIndicationList();
    }

    @Override
    public List<OldKtVariant> getOldKtVariantList(int page) {
        setDataSourceAndPage(page);
        return variantDao.getOldKtVariantList();
    }

    @Override
    public List<OldKtProtein> getOldKtProteinList(int page) {
        setDataSourceAndPage(page);
        return proteinDao.getOldKtProteinList();
    }

    @Override
    public List<OldKtProteinSynonym> getProteinSynonymList(int page) {
        setDataSourceAndPage(page);
        return proteinSynonymDao.getOldKtProteinSynonymList();
    }

    @Override
    public List<OldKtClinicalTrial> getOldKtClinicalTrialList(int page) {
        setDataSourceAndPage(page);
        return clinicalTrialDao.getOldKtClinicalTrialList();
    }

    @Override
    public List<OldKtClinicalTrailOutcome> getOldClinicalTrailOutcome(int page) {
        setDataSourceAndPage(page);
        return clinicalTrailOutcomeDao.getOldClinicalTrailOutcomeList();
    }

    @Override
    public List<OldKtClinicalTrailCancer> getOldClinicalTrailCancerList(int page) {
        setDataSourceAndPage(page);
        return clinicalTrailCancerDao.getOldClinicalTrailCancerList();
    }

    @Override
    public List<OldKtMedicationPlan> getOldKtMedicationPlanList(int page) {
        setDataSourceAndPage(page);
        return medicationPlanDao.getOldKtMedicationPlanList();
    }

    @Override
    public List<OldKtPlanCancer> getOldPlanCancerList(int page) {
        setDataSourceAndPage(page);
        return planCancerDao.getOldPlanCancerList();
    }

    @Override
    public List<OldKtPlanDrug> getOldPlanDrugList(int page) {
        setDataSourceAndPage(page);
        return planDrugDao.getOldPlanDrugList();
    }

    @Override
    public List<OldKtPlanInstruction> getOldPlanInstructionList(int page) {
        setDataSourceAndPage(page);
        return planInstructionDao.getOldPlanInstructionList();
    }

    @Override
    public List<OldKtPlanInstructionMessage> getOldPlanInstructionMessageList(int page) {
        setDataSourceAndPage(page);
        return instructionMessageDao.getOldPlanInstructionMessageList();
    }

    @Override
    public List<OldKtPlanReference> getOldPlanReferenceList(int page) {
        setDataSourceAndPage(page);
        return planReferenceDao.getOldPlanReferenceList();
    }

    @Override
    public List<OldKtPlanStudy> getOldPlanStudyList(int page) {
        setDataSourceAndPage(page);
        return planStudyDao.getOldPlanStudyList();
    }

    @Override
    public List<OldKtChemicalClassification> getOldKtChemicalList(int page) {
        setDataSourceAndPage(page);
        return chemicalClassificationDao.getChemicalList();
    }

    @Override
    public List<OldKtChemicalSynonym> getOldKtChemicalSynonyms(int page) {
        setDataSourceAndPage(page);
        return chemicalSynonymDao.getOldKtChemicalSynonyms();
    }

    @Override
    public List<OldKtCancer> getOldKtCancerList(int page) {
        setDataSourceAndPage(page);
        return cancerDao.getOldKtCancerList();
    }

    @Override
    public List<OldKtEvidence> getOldKtEvidence(int page) {
        setDataSourceAndPage(page);
        return evidenceDao.getOldKtEvidenceList();
    }

    @Override
    public List<OldKtEvidenceDrug> getOldEvidenceDrugList(int page) {
        setDataSourceAndPage(page);
        return evidenceDrugDao.getOldEvidenceDrugList();
    }

    @Override
    public List<OldKtEvidenceReference> getOldEvidenceReferenceList(int page) {
        setDataSourceAndPage(page);
        return evidenceReferenceDao.getOldEvidenceReferenceList();
    }

    /**
     *设置数据源以及页数
     * @param page
     */
    public void setDataSourceAndPage(int page){
        DbcontextHolder.setDbType("oldDataSource");
        PageHelper.startPage(page,1000);
    }
}
