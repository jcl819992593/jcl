package com.huasheng.service.impl;

import com.alibaba.druid.util.StringUtils;
import com.github.pagehelper.PageHelper;
import com.huasheng.dao.newdao.*;
import com.huasheng.datasource.DbcontextHolder;
import com.huasheng.pojo.knpojo.*;
import com.huasheng.pojo.newpojo.*;
import com.huasheng.pojo.oldpojo.*;
import com.huasheng.service.NewDBService;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @desc:
 * @author: 江承良
 * @date: 2017/9/19 15:12
 */
@Service
public class NewDBServiceImpl implements NewDBService {
    private Integer checkState=3;
    private Integer createdWay=3;

    @Autowired
    private KtDrugDao drugDao;
    @Autowired
    private KtDrugProductDao productDao;
    @Autowired
    private KtSideEffectDao sideEffectDao;
    @Autowired
    private KtMeshCategoryDao meshCategoryDao;
    @Autowired
    private KtGeneDao geneDao;
    @Autowired
    private KtIndicationDao indicationDao;
    @Autowired
    private KtVariantDao variantDao;
    @Autowired
    private KtProteinDao proteinDao;
    @Autowired
    private KtClinicalTrialDao clinicalTrialDao;
    @Autowired
    private KtMedicationPlanDao medicationPlanDao;
    @Autowired
    private KtChemicalCategoryDao chemicalCategoryDao;
    @Autowired
    private KtCancerDao cancerDao;
    @Autowired
    private KtEvidenceDao evidenceDao;
    @Autowired
    private KtProteinSynonymDao proteinSynonymDao;
    @Autowired
    private KtChemicalCategorySynonymDao categorySynonymDao;
    @Autowired
    private KtDrugSynonymDao drugSynonymDao;
    @Autowired
    private  KtDrugOtherNameDao drugOtherNameDao;
    @Autowired
    private KtDrugExternalIdDao drugExternalIdDao;
    @Autowired
    private KtDrugSequenceDao drugSequenceDao;
    @Autowired
    private KtDrugInteractionDao drugInteractionDao;
    @Autowired
    private KtDrugAdverseReactionDao drugAdverseReactionDao;
    @Autowired
    private KtDrugProductEtnIdDao productEtnIdDao;
    @Autowired
    private KtClinicalTrialOutcomeDao clinicalTrialOutcomeDao;
    @Autowired
    private KtGeneAliasDao geneAliasDao;
    @Autowired
    private KtGeneExternalIdDao geneExternalIdDao;
    @Autowired
    private KtGeneOtherNameDao geneOtherNameDao;
    @Autowired
    private KtGeneGenomicContextDao genomicContextDao;
    @Autowired
    private KtGeneLocationDao geneLocationDao;
    @Autowired
    private KtClinicalTrialCancerDao clinicalTrialCancerDao;
    @Autowired
    private KtEvidenceDrugDao evidenceDrugDao;
    @Autowired
    private KtEvidenceReferenceDao evidenceReferenceDao;
    @Autowired
    private KtPlanCancerDao planCancerDao;
    @Autowired
    private KtPlanDrugDao planDrugDao;
    @Autowired
    private KtPlanInstructionDao planInstructionDao;
    @Autowired
    private KtPlanInstructionMessageDao instructionMessageDao;
    @Autowired
    private KtPlanReferenceDao planReferenceDao;
    @Autowired
    private KtPlanStudyDao planStudyDao;
    @Autowired
    private KtCancerAliasDao cancerAliasDao;
    @Autowired
    private KtCancerPhenotypeDao cancerPhenotypeDao;
    @Autowired
    private KtGeneCancerDao geneCancerDao;
    @Autowired
    private KtDocumentDao documentDao;
    @Autowired
    private KtScientificResearchDao scientificResearchDao;
    @Autowired
    private KtScientificResearchCancerDao scientificResearchCancerDao;
    @Autowired
    private KtScientificResearchDrugDao scientificResearchDrugDao;
    @Autowired
    private KtScientificResearchGeneDao scientificResearchGeneDao;
    @Autowired
    private KtSyndromeGeneCancerDao syndromeGeneCancerDao;
    @Autowired
    private KtSyndromeCancerDao syndromeCancerDao;
    @Autowired
    private KtSyndromeGeneDao syndromeGeneDao;
    @Autowired
    private KtKeggPathwayDao keggPathwayDao;
    @Autowired
    private KtGeneKeggPathwayDao geneKeggPathwayDao;

    @Override
    public int insertDrugList(List<KnDrug> knDrugList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtDrug> ktDrugList = new ArrayList<KtDrug>();
        List<KtDrugAdverseReaction> drugAdverseReactions = new ArrayList<KtDrugAdverseReaction>();
        for (KnDrug knDrug : knDrugList) {
            KtDrug ktDrug = drugDao.selectByPrimaryKey(knDrug.getId());
            if(ktDrug==null){
                KtDrug drug = new KtDrug();
                drug.setDrugKey(knDrug.getId());
                drug.setDrugId(0);
                drug.setDrugType(knDrug.getType());
                drug.setNameChinese(knDrug.getNameCn());
                drug.setNameEn(knDrug.getName());
                drug.setAbsorption(knDrug.getSingleDosePeakTime());
                drug.setAttention(knDrug.getContraindications());
                drug.setProteinBinding(knDrug.getPlasmaProteinBindingRate());
                drug.setMajorMetabolicSites(knDrug.getMainMetabolism());
                drug.setHalfLife(knDrug.getPlasmaHalfLife());
                drug.setRouteOfElimination(knDrug.getMainWaysEliminate());
                drug.setCheckState(checkState);
                drug.setCreatedAt(System.currentTimeMillis());
                drug.setCreatedWay(createdWay);
                ktDrugList.add(drug);
                String adverseReactionsId = knDrug.getAdverseReactionsId();
                if(!StringUtils.isEmpty(adverseReactionsId)){
                    String[] adverseReactions = adverseReactionsId.split(",");
                    String reactionsFrequency = knDrug.getAdverseReactionsFrequency();
                    String[] frequencies = reactionsFrequency.split(",");
                    for (int i=0;i<adverseReactions.length;i++){
                        KtSideEffect sideEffect = sideEffectDao.selectByPrimaryKey(adverseReactions[i]);
                        if(sideEffect!=null){
                            KtDrugAdverseReaction drugAdverseReaction = new KtDrugAdverseReaction();
                            drugAdverseReaction.setAdressName(sideEffect.getSideEffectName());
                            drugAdverseReaction.setDrugKey(drug.getDrugKey());
                            drugAdverseReaction.setDrugId(drug.getDrugId());
                            drugAdverseReaction.setSideEffectKey(sideEffect.getSideEffectKey());
                            if(i<frequencies.length){
                                drugAdverseReaction.setFerquency(frequencies[i]);
                            }
                            drugAdverseReactions.add(drugAdverseReaction);
                        }
                    }
                }
            }
        }
        int i = drugDao.insertDrugList(ktDrugList);
       /* if(drugAdverseReactions!=null&&drugAdverseReactions.size()>0){
            drugAdverseReactionDao.addKtDrugAdverseReactionMore(drugAdverseReactions);
        }*/
        return i;
    }

    @Override
    public int insertDrugSynonymList(List<OldKtDrugSynonym> drugSynonymList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtDrugSynonym> drugSynonyms = new ArrayList<KtDrugSynonym>();
        for (OldKtDrugSynonym oldKtDrugSynonym : drugSynonymList) {
            KtDrugSynonym drugSynonym = new KtDrugSynonym();
            KtDrug drug = drugDao.selectByDrugId(oldKtDrugSynonym.getDrugId());
            if(drug!=null){
                drugSynonym.setDrugSynonym(oldKtDrugSynonym.getDrugSynonym());
                drugSynonym.setDrugId(oldKtDrugSynonym.getDrugId());
                drugSynonym.setSynonymKey(oldKtDrugSynonym.getId());
                drugSynonym.setDrugKey(drug.getDrugKey());
                drugSynonyms.add(drugSynonym);
            }
        }
        return drugSynonymDao.addKtDrugSynonymMore(drugSynonyms);
    }

    @Override
    public int insertDrugOtherNameList(List<OldKtDrugOtherName> otherNameList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtDrugOtherName> otherNames = new ArrayList<KtDrugOtherName>();
        for (OldKtDrugOtherName oldKtDrugOtherName : otherNameList) {
            KtDrugOtherName drugOtherName = new KtDrugOtherName();
            KtDrug drug = drugDao.selectByDrugId(oldKtDrugOtherName.getDrugId());
            if(drug!=null){
                drugOtherName.setOtherName(oldKtDrugOtherName.getOtherName());
                drugOtherName.setDrugId(oldKtDrugOtherName.getDrugId());
                drugOtherName.setOtherNameKey(oldKtDrugOtherName.getId());
                drugOtherName.setDrugKey(drug.getDrugKey());
                otherNames.add(drugOtherName);
            }
        }
        return drugOtherNameDao.addKtDrugOtherNameMore(otherNames);
    }

    @Override
    public int insertDrugExternalIdList(List<OldKtDrugExternalId> externalIdList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtDrugExternalId> externalIds = new ArrayList<KtDrugExternalId>();
        for (OldKtDrugExternalId oldKtDrugExternalId : externalIdList) {
            KtDrugExternalId drugExternalId = new KtDrugExternalId();
            KtDrug drug = drugDao.selectByDrugId(oldKtDrugExternalId.getDrugId());
            if(drug!=null){
                drugExternalId.setDrugId(oldKtDrugExternalId.getDrugId());
                drugExternalId.setDrugKey(drug.getDrugKey());
                drugExternalId.setExternalId(oldKtDrugExternalId.getExternalId());
                drugExternalId.setExternalIdKey(oldKtDrugExternalId.getId());
                drugExternalId.setExternalIdSource(oldKtDrugExternalId.getSource());
                externalIds.add(drugExternalId);
            }
        }
        return drugExternalIdDao.addKtDrugExternalIdMore(externalIds);
    }

    @Override
    public int insertDrugSequenceList(List<OldKtDrugSequence> sequenceList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtDrugSequence> sequences = new ArrayList<KtDrugSequence>();
        for (OldKtDrugSequence oldKtDrugSequence : sequenceList) {
            KtDrugSequence drugSequence = new KtDrugSequence();
            KtDrug drug = drugDao.selectByDrugId(oldKtDrugSequence.getDrugId());
            if(drug!=null){
                drugSequence.setDrugId(oldKtDrugSequence.getDrugId());
                drugSequence.setSequence(oldKtDrugSequence.getSequence());
                drugSequence.setSequenceKey(oldKtDrugSequence.getId());
                drugSequence.setDrugKey(drug.getDrugKey());
                sequences.add(drugSequence);
            }
        }
        return drugSequenceDao.insertDrugSequenceList(sequences);
    }

    @Override
    public int insertDrugInteractionList(List<OldKtDrugInteraction> interactionList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtDrugInteraction> interactions = new ArrayList<KtDrugInteraction>();
        for (OldKtDrugInteraction oldKtDrugInteraction : interactionList) {
            KtDrugInteraction drugInteraction = new KtDrugInteraction();
            drugInteraction.setDescription(oldKtDrugInteraction.getDescription());
            drugInteraction.setInteractionKey(oldKtDrugInteraction.getId());
            drugInteraction.setDrugId(oldKtDrugInteraction.getDrugId());
            drugInteraction.setDrugIdInteraction(oldKtDrugInteraction.getDrugIdInteraction());
            KtDrug ktDrug = drugDao.selectByDrugId(oldKtDrugInteraction.getDrugId());
            KtDrug ktDrug1 = drugDao.selectByDrugId(oldKtDrugInteraction.getDrugIdInteraction());
            if(ktDrug!=null){
                drugInteraction.setDrugKey(ktDrug.getDrugKey());
            }
            if(ktDrug1!=null){
                drugInteraction.setDrugInteractionKey(ktDrug1.getDrugKey());
            }
            interactions.add(drugInteraction);
        }
        return drugInteractionDao.addKtDrugInteractionMore(interactions);
    }

    @Override
    public int insertDrugCategoryList(List<OldKtDrugCategory> categoryList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtDrugCategory> drugCategories = new ArrayList<KtDrugCategory>();
        for (OldKtDrugCategory oldKtDrugCategory : categoryList) {

        }
        return 0;
    }

    @Override
    public int insertKnDrugAlias(List<KnDrugAlias> knDrugAliasList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtDrugSynonym> synonyms = new ArrayList<KtDrugSynonym>();
        for (KnDrugAlias knDrugAlias : knDrugAliasList) {
            KtDrug ktDrug = drugDao.selectByPrimaryKey(knDrugAlias.getDrugId());
            if(ktDrug!=null){
                KtDrugSynonym drugSynonym = new KtDrugSynonym();
                drugSynonym.setDrugKey(knDrugAlias.getDrugId());
                drugSynonym.setDrugSynonym(knDrugAlias.getAliasName());
                drugSynonym.setSynonymKey(knDrugAlias.getId());
                drugSynonym.setDrugId(ktDrug.getDrugId());
                synonyms.add(drugSynonym);
            }
        }
        return synonyms==null||synonyms.size()==0?0:drugSynonymDao.addKtDrugSynonymMore(synonyms);
    }

    @Override
    public int insertDrugProduct(List<OldKtDrugProduct> productList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtDrugProduct> products = new ArrayList<KtDrugProduct>();
        for (OldKtDrugProduct product : productList) {
            KtDrugProduct drugProduct = new KtDrugProduct();
            drugProduct.setApproved(product.getApproved());
            drugProduct.setTradeName(product.getTradeName());
            drugProduct.setReferencePrice(product.getReferencePrice());
            drugProduct.setProductSource(product.getSource());
            drugProduct.setProductName(product.getName());
            drugProduct.setProductRoute(product.getRoute());
            drugProduct.setProductKey(product.getId());
            drugProduct.setPackageImage(product.getPackageImage());
            drugProduct.setMarketingStart(product.getMarketingStart());
            drugProduct.setMarketingEnd(product.getMarketingEnd());
            drugProduct.setLabeller(product.getLabeller());
            drugProduct.setIsMedicalInsurance(product.getIsMedicalInsurance());
            drugProduct.setGeneric(product.getGeneric());
            KtDrug drug = drugDao.selectByDrugId(product.getDrugId());
            drugProduct.setDrugKey(drug.getDrugKey());
            drugProduct.setDrugId(product.getDrugId());
            drugProduct.setDrugAttribute(product.getDrugAttribute());
            drugProduct.setDosageStrength(product.getDosageStrength());
            drugProduct.setDosageForm(product.getDosageForm());
            drugProduct.setCountry(product.getCountry());
            drugProduct.setCheckState(checkState);
            drugProduct.setCreatedAt(System.currentTimeMillis());
            drugProduct.setCreatedWay(createdWay);
            products.add(drugProduct);
        }
        int i = productDao.insertDrugProductList(products);
        return i;
    }

    @Override
    public int insertDrugProductEtnId(List<OldKtDrugProductEtnId> productEtnIdList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtDrugProductEtnId> productEtnIds = new ArrayList<KtDrugProductEtnId>();
        for (OldKtDrugProductEtnId oldKtDrugProductEtnId : productEtnIdList) {
            KtDrugProductEtnId productEtnId = new KtDrugProductEtnId();
            KtDrugProduct drugProduct = productDao.selectByPrimaryKey(oldKtDrugProductEtnId.getId());
            if(drugProduct!=null){
                String primaryKey = getPrimaryKey("1e2fa5fde6f16a321a8114a88e5a420d", "kt_drug_product_etn_id");
                productEtnId.setEtnIdKey(primaryKey);
                productEtnId.setProductKey(oldKtDrugProductEtnId.getId());
                productEtnId.setNdcProductCode(oldKtDrugProductEtnId.getNdcProductCode());
                productEtnId.setNdcId(oldKtDrugProductEtnId.getNdcId());
                productEtnId.setDpdId(oldKtDrugProductEtnId.getDpdId());
                productEtnId.setCfdaId(oldKtDrugProductEtnId.getCfdaId());
                productEtnIds.add(productEtnId);
            }
        }
        return productEtnIdDao.addKtDrugProductEtnId(productEtnIds);
    }

    @Override
    public int insertKtSideEffect(List<OldKtSideEffect> sideEffectList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtSideEffect> sideEffects = new ArrayList<KtSideEffect>();
        for (OldKtSideEffect oldSideEffect : sideEffectList) {
            KtSideEffect sideEffect = new KtSideEffect();
            sideEffect.setSideEffectKey(oldSideEffect.getId());
            sideEffect.setUmlsConceptId(oldSideEffect.getUmlsConceptId());
            sideEffect.setSideEffectName(oldSideEffect.getSideEffectName());
            sideEffect.setMeddraId(oldSideEffect.getMeddraId());
            sideEffect.setKindOfTerm(oldSideEffect.getKindOfTerm());
            sideEffect.setCheckState(checkState);
            sideEffect.setCreatedWay(createdWay);
            sideEffect.setCreatedAt(System.currentTimeMillis());
            sideEffects.add(sideEffect);
        }
        int i = sideEffectDao.insertSideEffectList(sideEffects);
        return i;
    }

    @Override
    public int insertKnSideEffect(List<KnAdverseReactions> knAdverseReactionsList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtSideEffect> sideEffects = new ArrayList<KtSideEffect>();
        for (KnAdverseReactions knAdverseReactions : knAdverseReactionsList) {
            KtSideEffect ktSideEffect = sideEffectDao.selectByPrimaryKey(knAdverseReactions.getId());
            if(ktSideEffect==null){
                KtSideEffect sideEffect = new KtSideEffect();
                if("1".equals(knAdverseReactions.getType())){
                    sideEffect.setKindOfTerm("基类");
                }
                else if("2".equals(knAdverseReactions.getType())){
                    sideEffect.setKindOfTerm("大类");
                }
                else if("3".equals(knAdverseReactions.getType())){
                    sideEffect.setKindOfTerm("小类");
                }else {
                    sideEffect.setKindOfTerm(knAdverseReactions.getType());
                }
                sideEffect.setSideEffectKey(knAdverseReactions.getId());
                sideEffect.setSideEffectName(knAdverseReactions.getName());
                sideEffect.setCheckState(checkState);
                sideEffect.setCreatedWay(createdWay);
                sideEffect.setCreatedAt(System.currentTimeMillis());
                sideEffects.add(sideEffect);
            }
        }
        return sideEffects==null||sideEffects.size()==0?0:sideEffectDao.insertSideEffectList(sideEffects);
    }

    @Override
    public int insertMeshCategory(List<OldKtMeshCategory> meshCategoryList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtMeshCategory> list = new ArrayList<KtMeshCategory>();
        for (OldKtMeshCategory oldKtMeshCategory : meshCategoryList) {
            KtMeshCategory meshCategory = new KtMeshCategory();
            meshCategory.setMeshCategoryKey(oldKtMeshCategory.getId());
            meshCategory.setCategoryName(oldKtMeshCategory.getCategoryName());
            meshCategory.setMeshId(oldKtMeshCategory.getMeshId());
            meshCategory.setCheckState(checkState);
            meshCategory.setCreatedAt(System.currentTimeMillis());
            meshCategory.setCreatedWay(createdWay);
            list.add(meshCategory);
        }
        int i = meshCategoryDao.insertMeshCategoryList(list);
        return i;
    }

    @Override
    public int insertGeneList(List<OldKtGene> geneList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtGene> genes = new ArrayList<KtGene>();
        for (OldKtGene oldKtGene : geneList) {
            KtGene gene = new KtGene();
            gene.setGeneKey(oldKtGene.getId());
            gene.setHasCosmicMutations(oldKtGene.getHasCosmicMutations());
            gene.setGeneType(oldKtGene.getGeneType());
            gene.setGeneSymbol(oldKtGene.getGeneSymbol());
            gene.setGeneId(oldKtGene.getGeneId());
            gene.setGeneFullName(oldKtGene.getGeneFullName());
            gene.setEntrezGeneSummary(oldKtGene.getEntrezGeneSummary());
            gene.setCytogeneticBand(oldKtGene.getCytogeneticBand());
            gene.setCancerGene(oldKtGene.getCancerGene());
            gene.setCheckState(checkState);
            gene.setCreatedAt(System.currentTimeMillis());
            gene.setCreatedWay(createdWay);
            genes.add(gene);
        }
        int i = geneDao.insertGeneList(genes);
        return i;
    }

    @Override
    public int insertGeneAliasList(List<OldKtGeneAlias> geneAliasList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtGeneAlias> geneAliases = new ArrayList<KtGeneAlias>();
        for (OldKtGeneAlias oldKtGeneAlias : geneAliasList) {
            KtGene gene = geneDao.selectById(oldKtGeneAlias.getGeneId());
            if(gene!=null){
                KtGeneAlias geneAlias = new KtGeneAlias();
                geneAlias.setGeneAlias(oldKtGeneAlias.getGeneAlias());
                geneAlias.setGeneId(oldKtGeneAlias.getGeneId());
                geneAlias.setGeneAliasKey(oldKtGeneAlias.getId());
                geneAlias.setGeneKey(gene.getGeneKey());
                geneAliases.add(geneAlias);
            }
        }
        return geneAliases==null||geneAliases.size()==0?0:geneAliasDao.addKtGeneAlias(geneAliases);
    }

    @Override
    public int insertGeneExternalIdList(List<OldKtGeneExternalId> geneExternalIdList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtGeneExternalId> externalIds = new ArrayList<KtGeneExternalId>();
        for (OldKtGeneExternalId oldKtGeneExternalId : geneExternalIdList) {
            KtGene gene = geneDao.selectById(oldKtGeneExternalId.getGeneId());
            if(gene!=null){
                KtGeneExternalId externalId = new KtGeneExternalId();
                externalId.setGeneExternalIdKey(oldKtGeneExternalId.getId());
                externalId.setGeneId(oldKtGeneExternalId.getGeneId());
                externalId.setSource(oldKtGeneExternalId.getSource());
                externalId.setSourceId(oldKtGeneExternalId.getSourceId());
                externalId.setGeneKey(gene.getGeneKey());
                externalIds.add(externalId);
            }
        }
        return externalIds==null||externalIds.size()==0?0:geneExternalIdDao.addKtGeneExternalId(externalIds);
    }

    @Override
    public int insertGeneOtherNameList(List<OldKtGeneOtherName> geneOtherNameList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtGeneOtherName> otherNames = new ArrayList<KtGeneOtherName>();
        for (OldKtGeneOtherName oldKtGeneOtherName : geneOtherNameList) {
            KtGene gene = geneDao.selectById(oldKtGeneOtherName.getGeneId());
            if(gene!=null){
                KtGeneOtherName geneOtherName = new KtGeneOtherName();
                geneOtherName.setGeneId(oldKtGeneOtherName.getGeneId());
                geneOtherName.setGeneOtherNameKey(oldKtGeneOtherName.getId());
                geneOtherName.setOtherName(oldKtGeneOtherName.getOtherName());
                geneOtherName.setGeneKey(gene.getGeneKey());
                otherNames.add(geneOtherName);
            }
        }
        return otherNames==null||otherNames.size()==0?0:geneOtherNameDao.addKtGeneOtherName(otherNames);
    }

    @Override
    public int insertGeneGenomicContextList(List<OldKtGeneGenomicContext> genomicContextList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtGeneGenomicContext> genomicContexts = new ArrayList<KtGeneGenomicContext>();
        for (OldKtGeneGenomicContext oldKtGeneGenomicContext : genomicContextList) {
            KtGene gene = geneDao.selectById(oldKtGeneGenomicContext.getGeneId());
            if(gene!=null){
                KtGeneGenomicContext genomicContext = new KtGeneGenomicContext();
                genomicContext.setChraccver(oldKtGeneGenomicContext.getChraccver());
                genomicContext.setChrloc(oldKtGeneGenomicContext.getChrloc());
                genomicContext.setGeneId(oldKtGeneGenomicContext.getGeneId());
                genomicContext.setGeneGenomicContextKey(oldKtGeneGenomicContext.getId());
                genomicContext.setExoncount(oldKtGeneGenomicContext.getExoncount());
                genomicContext.setChrstop(oldKtGeneGenomicContext.getChrstop());
                genomicContext.setChrstart(oldKtGeneGenomicContext.getChrstart());
                genomicContext.setGeneKey(gene.getGeneKey());
                genomicContexts.add(genomicContext);
            }
        }
        return genomicContexts==null||genomicContexts.size()==0?0:genomicContextDao.insertlist(genomicContexts);
    }

    @Override
    public int insertGeneLocationList(List<OldKtGeneLocation> geneLocationList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtGeneLocation> locations = new ArrayList<KtGeneLocation>();
        for (OldKtGeneLocation oldKtGeneLocation : geneLocationList) {
            KtGene gene = geneDao.selectById(oldKtGeneLocation.getGeneId());
            if(gene!=null){
                KtGeneLocation geneLocation = new KtGeneLocation();
                geneLocation.setRefAssembly(oldKtGeneLocation.getRefAssembly());
                geneLocation.setOrientatio(oldKtGeneLocation.getOrientation());
                geneLocation.setGeneStop(oldKtGeneLocation.getStop());
                geneLocation.setGeneStart(oldKtGeneLocation.getStart());
                geneLocation.setGeneSize(oldKtGeneLocation.getSize());
                geneLocation.setGeneLocationKey(oldKtGeneLocation.getId());
                geneLocation.setGeneKey(gene.getGeneKey());
                geneLocation.setGeneId(oldKtGeneLocation.getGeneId());
                geneLocation.setExoncount(oldKtGeneLocation.getExoncount());
                geneLocation.setChromosome(oldKtGeneLocation.getChromosome());
                locations.add(geneLocation);
            }
        }
        return locations==null||locations.size()==0?0:geneLocationDao.insertList(locations);
    }

    @Override
    public int insertKnGeneList(List<KnGene> knGeneList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtGene> genes = new ArrayList<KtGene>();
        List<KtGeneAlias> aliases = new ArrayList<KtGeneAlias>();
        int num;
        for (KnGene knGene : knGeneList) {
            KtGene ktGene = geneDao.selectByPrimaryKey(knGene.getId());
            if(ktGene==null){
                KtGene gene = new KtGene();
                gene.setGeneKey(knGene.getId());
                gene.setGeneType(knGene.getGeneType());
                gene.setGeneSymbol(knGene.getName());
                gene.setGeneFullName(knGene.getName());
                gene.setEntrezGeneSummary(knGene.getDescription());
                gene.setGeneId(0);
                gene.setCheckState(checkState);
                gene.setCreatedWay(createdWay);
                gene.setCreatedAt(System.currentTimeMillis());
                String aliasName = knGene.getAliasName();
                if(!StringUtils.isEmpty(aliasName)){
                    String[] aliasNames = null;
                    if(",".equals(aliasName)){
                        aliasNames = aliasName.split(",");
                    }else aliasNames = aliasName.split(";");
                    for(int i=0;i<aliasNames.length;i++){
                        KtGeneAlias geneAlias = new KtGeneAlias();
                        geneAlias.setGeneKey(gene.getGeneKey());
                        geneAlias.setGeneId(gene.getGeneId());
                        geneAlias.setGeneAlias(aliasNames[i]);
                        geneAlias.setGeneAliasKey(getPrimaryKey("1e2fa5fde6f16a321a8114a88e5a420d","kt_gene_alias"));
                        aliases.add(geneAlias);
                    }
                }
                genes.add(gene);
            }
        }
        num = genes==null||genes.size()==0?0:geneDao.insertGeneList(genes);
        geneAliasDao.addKtGeneAlias(aliases);
        return num;
    }

    @Override
    public int insertKnGeneCancer(List<KnGeneCancer> geneCancerList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtGeneCancer> geneCancers = new ArrayList<KtGeneCancer>();
        for (KnGeneCancer knGeneCancer : geneCancerList) {
            KtGene gene = geneDao.selectByPrimaryKey(knGeneCancer.getGeneId());
            KtCancer cancer = cancerDao.selectByPrimaryKey(knGeneCancer.getCancerId());
            if(gene!=null&&cancer!=null){
                KtGeneCancer geneCancer = new KtGeneCancer();
                geneCancer.setCancerKey(knGeneCancer.getCancerId());
                geneCancer.setGeneKey(knGeneCancer.getGeneId());
                geneCancer.setDoid(Integer.parseInt(cancer.getDoid()));
                geneCancer.setGeneId(gene.getGeneId());
                geneCancer.setMutationFrequency(knGeneCancer.getMutationFrequency());
                geneCancer.setProteinApplication(knGeneCancer.getProteinApplication());
                geneCancer.setGeneDetectionDescription(knGeneCancer.getGeneTest());
                geneCancer.setGeneDetectionDescriptionShort(knGeneCancer.getGeneTestShort());
                geneCancers.add(geneCancer);
            }
        }
        return geneCancers==null||geneCancers.size()==0?0:geneCancerDao.insertList(geneCancers);
    }

    @Override
    public int insertKtGeneKeggPathway(List<KnGeneGeneMetabolism> geneGeneMetabolismList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtGeneKeggPathway> geneKeggPathways = new ArrayList<KtGeneKeggPathway>();
        for (KnGeneGeneMetabolism knGeneGeneMetabolism : geneGeneMetabolismList) {
            KtGene ktGene = geneDao.selectByPrimaryKey(knGeneGeneMetabolism.getGeneId());
            KtKeggPathway ktKeggPathway = keggPathwayDao.selectByPrimaryKey(knGeneGeneMetabolism.getGeneMetabolismId());
            if(ktGene!=null&&ktKeggPathway!=null){
                KtGeneKeggPathway geneKeggPathway = new KtGeneKeggPathway();
                geneKeggPathway.setGeneKey(knGeneGeneMetabolism.getGeneId());
                geneKeggPathway.setGeneId(String.valueOf(ktGene.getGeneId()));
                geneKeggPathway.setKeggId(ktKeggPathway.getKeggId());
                geneKeggPathway.setPathwayKey(knGeneGeneMetabolism.getGeneMetabolismId());
                geneKeggPathways.add(geneKeggPathway);
            }
        }
        return geneKeggPathways==null||geneKeggPathways.size()==0?0:geneKeggPathwayDao.insertList(geneKeggPathways);
    }

    @Override
    public int insertIndication(List<OldKtIndication> indicationList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtIndication> indications = new ArrayList<KtIndication>();
        for (OldKtIndication oldKtIndication : indicationList) {
            KtIndication indication = new KtIndication();
            indication.setUmlsConceptIdOfMeddra(oldKtIndication.getUmlsConceptIdOfMeddra());
            indication.setStitchCompoundId(oldKtIndication.getStitchCompoundId());
            indication.setMethodOfDetection(oldKtIndication.getMethodOfDetection());
            indication.setMeddraConceptType(oldKtIndication.getMeddraConceptType());
            indication.setMeddraConceptName(oldKtIndication.getMeddraConceptName());
            indication.setIndicationKey(oldKtIndication.getId());
            indication.setConceptName(oldKtIndication.getConceptName());
            indication.setUmlsConceptId(oldKtIndication.getUmlsConceptId());
            indication.setCheckState(checkState);
            indication.setCreatedWay(createdWay);
            indication.setCreatedAt(System.currentTimeMillis());
            indications.add(indication);
        }
        return indicationDao.insertIndicationList(indications);
    }

    @Override
    public int insertVariantList(List<OldKtVariant> variantList) {DbcontextHolder.setDbType("newDataSource");
        DbcontextHolder.setDbType("newDataSource");
        List<KtVariant> variants = new ArrayList<KtVariant>();
        for (OldKtVariant oldKtVariant : variantList) {
            KtVariant variant = new KtVariant();
            variant.setVariantType(oldKtVariant.getVariantType());
            variant.setVariantKey(oldKtVariant.getId());
            variant.setVariantId(oldKtVariant.getVariantId());
            variant.setRemark(oldKtVariant.getRemark());
            variant.setOncogenicity(oldKtVariant.getOncogenicity());
            variant.setMutationEffect(oldKtVariant.getMutationEffect());
            variant.setMutationDetection(oldKtVariant.getMutationDetection());
            variant.setGrch(oldKtVariant.getGrch());
            variant.setGenomicPosition(oldKtVariant.getGenomicPosition());
            variant.setGeneId(oldKtVariant.getGeneId());
            KtGene ktGene = geneDao.selectById(oldKtVariant.getGeneId());
            if(ktGene!=null){
                variant.setGeneKey(ktGene.getGeneKey());
            }
            variant.setDbsnpId(oldKtVariant.getDbsnpId());
            variant.setCosmicId(oldKtVariant.getCosmicId());
            variant.setCdsMutation(oldKtVariant.getCdsMutation());
            variant.setAaMutation(oldKtVariant.getAaMutation());
            variant.setCheckState(checkState);
            variant.setCreatedAt(System.currentTimeMillis());
            variant.setCreatedWay(createdWay);
            variants.add(variant);
        }
        int i = variantDao.insertVariantList(variants);
        return i;
    }

    @Override
    public int insertKtVariantList(List<KnGeneMutation> geneMutationList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtVariant> variants = new ArrayList<KtVariant>();
        for (KnGeneMutation knGeneMutation : geneMutationList) {
            KtVariant ktVariant = variantDao.selectByPrimaryKey(knGeneMutation.getId());
            KtGene gene = geneDao.selectByPrimaryKey(knGeneMutation.getGeneId());
            if(ktVariant==null){
                KtVariant variant = new KtVariant();
                variant.setVariantType(knGeneMutation.getType());
                variant.setVariantKey(knGeneMutation.getId());
                variant.setRemark(knGeneMutation.getRemark());
                variant.setMutationEffect(knGeneMutation.getFrequency());
                variant.setCdsMutation(knGeneMutation.getCds());
                variant.setMutationDetection(knGeneMutation.getDetection());
                if(gene!=null){
                    variant.setGeneId(gene.getGeneId());
                    variant.setGeneKey(knGeneMutation.getGeneId());
                }
                variant.setCreatedWay(createdWay);
                variant.setCreatedAt(System.currentTimeMillis());
                variant.setCheckState(checkState);
                variants.add(variant);
            }
        }
        return variants==null||variants.size()==0?0:variantDao.insertVariantList(variants);
    }

    @Override
    public int insertProteinList(List<OldKtProtein> proteinList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtProtein> proteins = new ArrayList<KtProtein>();
        for (OldKtProtein oldKtProtein : proteinList) {
            KtProtein protein = new KtProtein();
            protein.setTissueSpecificityEvidenceId(oldKtProtein.getTissueSpecificityEvidenceId());
            protein.setProteinName(oldKtProtein.getProteinName());
            protein.setProteinKey(oldKtProtein.getId());
            protein.setProteinId(oldKtProtein.getProteinId());
            protein.setMass(oldKtProtein.getMass());
            protein.setLength(oldKtProtein.getLength());
            protein.setGeneId(oldKtProtein.getGeneId());
            KtGene ktGene = geneDao.selectById(oldKtProtein.getGeneId());
            if(ktGene!=null){
                protein.setGeneKey(ktGene.getGeneKey());
            }
            protein.setFunctionDescription(oldKtProtein.getFunctionDescription());
            protein.setEntryName(oldKtProtein.getEntryName());
            protein.setTissueSpecificity(oldKtProtein.getTissueSpecificity());
            protein.setCreatedAt(System.currentTimeMillis());
            protein.setCreatedWay(createdWay);
            protein.setCheckState(checkState);
            proteins.add(protein);
        }
        int i = proteinDao.insertProteinList(proteins);
        return i;
    }

    @Override
    public int insertProteinSynonymList(List<OldKtProteinSynonym> proteinSynonymList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtProteinSynonym> synonyms = new ArrayList<KtProteinSynonym>();
        for (OldKtProteinSynonym oldKtProteinSynonym : proteinSynonymList) {
            KtProteinSynonym proteinSynonym = new KtProteinSynonym();
            KtProtein protein = proteinDao.selectById(oldKtProteinSynonym.getProteinId());
            if(protein!=null){
                proteinSynonym.setProteinId(oldKtProteinSynonym.getProteinId());
                proteinSynonym.setSynonym(oldKtProteinSynonym.getSynonym());
                proteinSynonym.setProteinSynonymKey(oldKtProteinSynonym.getId());
                proteinSynonym.setProteinKey(protein.getProteinKey());
                synonyms.add(proteinSynonym);
            }
        }
        return proteinSynonymDao.insertKtProteinSynonym(synonyms);
    }

    @Override
    public int insertClinicalTrialList(List<OldKtClinicalTrial> clinicalTrialList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtClinicalTrial> clinicalTrials = new ArrayList<KtClinicalTrial>();
        for (OldKtClinicalTrial oldKtClinicalTrial : clinicalTrialList) {
            KtClinicalTrial clinicalTrial = new KtClinicalTrial();
            clinicalTrial.setTreatmentType(oldKtClinicalTrial.getTreatmentType());
            clinicalTrial.setTheUrl(oldKtClinicalTrial.getUrl());
            clinicalTrial.setTheType(oldKtClinicalTrial.getType());
            clinicalTrial.setTheTitle(oldKtClinicalTrial.getTitle());
            clinicalTrial.setTheStatus(oldKtClinicalTrial.getStatus());
            clinicalTrial.setThePmid(oldKtClinicalTrial.getPmid());
            clinicalTrial.setThePhase(oldKtClinicalTrial.getPhase());
            clinicalTrial.setTheCfda(oldKtClinicalTrial.getCfda());
            clinicalTrial.setTestCenter(oldKtClinicalTrial.getTestCenter());
            clinicalTrial.setSynonyms(oldKtClinicalTrial.getSynonyms());
            clinicalTrial.setStartDate(oldKtClinicalTrial.getStartDate());
            clinicalTrial.setRelatedGene(oldKtClinicalTrial.getRelatedGene());
            clinicalTrial.setRandom(oldKtClinicalTrial.getRandom());
            clinicalTrial.setPathologicalState(oldKtClinicalTrial.getPathologicalState());
            clinicalTrial.setOrganization(oldKtClinicalTrial.getOrganization());
            clinicalTrial.setGroupCase(oldKtClinicalTrial.getGroupCase());
            clinicalTrial.setGeneDetection(oldKtClinicalTrial.getGeneDetection());
            clinicalTrial.setExistTreatment(oldKtClinicalTrial.getExistTreatment());
            clinicalTrial.setDoubleBlind(oldKtClinicalTrial.getDoubleBlind());
            clinicalTrial.setCountries(oldKtClinicalTrial.getCountries());
            clinicalTrial.setContract(oldKtClinicalTrial.getContrast());
            clinicalTrial.setClinicalTrialKey(oldKtClinicalTrial.getId());
            clinicalTrial.setClinicalTrialId(oldKtClinicalTrial.getClinicalTrialId());
            clinicalTrial.setCreatedAt(System.currentTimeMillis());
            clinicalTrial.setCreatedWay(createdWay);
            clinicalTrial.setCheckState(checkState);
            clinicalTrials.add(clinicalTrial);
        }
        int i = clinicalTrialDao.insertClinicalTrialList(clinicalTrials);
        return i;
    }

    @Override
    public int insertClinicalTrailOutcomeList(List<OldKtClinicalTrailOutcome> clinicalTrailOutcomeList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtClinicalTrialOutcome> clinicalTrialOutcomes = new ArrayList<KtClinicalTrialOutcome>();
        for (OldKtClinicalTrailOutcome oldKtClinicalTrailOutcome : clinicalTrailOutcomeList) {
            String clinicalTrailId = oldKtClinicalTrailOutcome.getClinicalTrailId();
            KtClinicalTrial clinicalTrial = clinicalTrialDao.selectByClinicalId(clinicalTrailId);
            if(clinicalTrial!=null){
                KtClinicalTrialOutcome clinicalTrialOutcome = new KtClinicalTrialOutcome();
                clinicalTrialOutcome.setCategory(oldKtClinicalTrailOutcome.getCategory());
                clinicalTrialOutcome.setUnit(oldKtClinicalTrailOutcome.getUnit());
                clinicalTrialOutcome.setTitle(oldKtClinicalTrailOutcome.getTitle());
                clinicalTrialOutcome.setResultGroup(oldKtClinicalTrailOutcome.getResultGroup());
                clinicalTrialOutcome.setParamValue(oldKtClinicalTrailOutcome.getParamValue());
                clinicalTrialOutcome.setParamType(oldKtClinicalTrailOutcome.getParamType());
                clinicalTrialOutcome.setDispValue(oldKtClinicalTrailOutcome.getDispValue());
                clinicalTrialOutcome.setDispType(oldKtClinicalTrailOutcome.getDispType());
                clinicalTrialOutcome.setDispMin(oldKtClinicalTrailOutcome.getDispMin());
                clinicalTrialOutcome.setDispMax(oldKtClinicalTrailOutcome.getDispMax());
                clinicalTrialOutcome.setClinicalTrialOutcomeKey(oldKtClinicalTrailOutcome.getId());
                clinicalTrialOutcome.setClinicalTrialKey(clinicalTrial.getClinicalTrialKey());
                clinicalTrialOutcome.setClinicalTrialId(oldKtClinicalTrailOutcome.getClinicalTrailId());
                clinicalTrialOutcome.setClassification(oldKtClinicalTrailOutcome.getClassification());
                clinicalTrialOutcomes.add(clinicalTrialOutcome);
            }
        }
        return clinicalTrialOutcomes==null||clinicalTrialOutcomes.size()==0?0:clinicalTrialOutcomeDao.insertList(clinicalTrialOutcomes);
    }

    @Override
    public int insertClinicalTrailCancerList(List<OldKtClinicalTrailCancer> clinicalTrailCancerList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtClinicalTrialCancer> clinicalTrialCancers = new ArrayList<KtClinicalTrialCancer>();
        for (OldKtClinicalTrailCancer oldKtClinicalTrailCancer : clinicalTrailCancerList) {
            KtCancer cancer = cancerDao.selectByDoid(String.valueOf(oldKtClinicalTrailCancer.getDoid()));
            KtClinicalTrial clinicalTrial = clinicalTrialDao.selectByClinicalId(oldKtClinicalTrailCancer.getClinicalTrailId());
            if(cancer!=null&&clinicalTrial!=null){
                KtClinicalTrialCancer clinicalTrialCancer = new KtClinicalTrialCancer();
                clinicalTrialCancer.setCancerKey(cancer.getCancerKey());
                clinicalTrialCancer.setClinicalTrialKey(clinicalTrial.getClinicalTrialKey());
                clinicalTrialCancer.setclinicalTrialId(oldKtClinicalTrailCancer.getClinicalTrailId());
                clinicalTrialCancer.setDoid(oldKtClinicalTrailCancer.getDoid());
                clinicalTrialCancers.add(clinicalTrialCancer);
            }
        }
        return clinicalTrialCancers==null||clinicalTrialCancers.size()==0?0:clinicalTrialCancerDao.insertList(clinicalTrialCancers);
    }

    @Override
    public int insertMedicationPlanList(List<OldKtMedicationPlan> medicationPlanList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtMedicationPlan> medicationPlans = new ArrayList<KtMedicationPlan>();
        for (OldKtMedicationPlan oldKtMedicationPlan : medicationPlanList) {
            KtMedicationPlan medicationPlan = new KtMedicationPlan();
            medicationPlan.setRegimenName(oldKtMedicationPlan.getRegimenName());
            medicationPlan.setRegimenDescription(oldKtMedicationPlan.getRegimenDescription());
            medicationPlan.setProgramNameC(oldKtMedicationPlan.getProgramNameC());
            medicationPlan.setMedicinePlanId(oldKtMedicationPlan.getMedicinePlanId());
            medicationPlan.setMedicationPlanKey(oldKtMedicationPlan.getId());
            medicationPlan.setDiseaseName(oldKtMedicationPlan.getDiseaseName());
            medicationPlan.setChemotherapyType(oldKtMedicationPlan.getChemotherapyType());
            medicationPlan.setChemotherapyName(oldKtMedicationPlan.getChemotherapyName());
            medicationPlan.setApprovalLink(oldKtMedicationPlan.getApprovalLink());
            medicationPlan.setApprovalAgency(oldKtMedicationPlan.getApprovalAgency());
            medicationPlan.setCreatedAt(System.currentTimeMillis());
            medicationPlan.setCheckState(checkState);
            medicationPlan.setCreatedWay(createdWay);
            medicationPlans.add(medicationPlan);
        }
        int i = medicationPlanDao.insertMedicationPlanList(medicationPlans);
        return i;
    }

    @Override
    public int insertPlanCancerList(List<OldKtPlanCancer> planCancerList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtPlanCancer> planCancers = new ArrayList<KtPlanCancer>();
        for (OldKtPlanCancer oldKtPlanCancer : planCancerList) {
            KtCancer cancer = cancerDao.selectByDoid(String.valueOf(oldKtPlanCancer.getDoid()));
            KtMedicationPlan medicationPlan = medicationPlanDao.selectById(oldKtPlanCancer.getMedicinePlanId());
            if(cancer!=null&&medicationPlan!=null){
                KtPlanCancer planCancer = new KtPlanCancer();
                planCancer.setCancerKey(cancer.getCancerKey());
                planCancer.setMedicinePlanId(oldKtPlanCancer.getMedicinePlanId());
                planCancer.setMedicationPlanKey(medicationPlan.getMedicationPlanKey());
                planCancer.setDoid(oldKtPlanCancer.getDoid());
                planCancer.setDoidName(oldKtPlanCancer.getDoidName());
                planCancers.add(planCancer);
            }
        }
        return planCancers==null||planCancers.size()==0?0:planCancerDao.insertList(planCancers);
    }

    @Override
    public int insertPlanDrugList(List<OldKtPlanDrug> planDrugList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtPlanDrug> planDrugs = new ArrayList<KtPlanDrug>();
        for (OldKtPlanDrug oldKtPlanDrug : planDrugList) {
            KtDrug drug = drugDao.selectByDrugId(oldKtPlanDrug.getDrugId());
            KtMedicationPlan medicationPlan = medicationPlanDao.selectById(oldKtPlanDrug.getMedicationPlanId());
            if(drug!=null&&medicationPlan!=null){
                KtPlanDrug planDrug = new KtPlanDrug();
                planDrug.setDrugId(oldKtPlanDrug.getDrugId());
                planDrug.setMedicationPlanId(oldKtPlanDrug.getMedicationPlanId());
                planDrug.setDrugKey(drug.getDrugKey());
                planDrug.setMedicationPlanKey(medicationPlan.getMedicationPlanKey());
                planDrugs.add(planDrug);
            }
        }
        return planDrugs==null||planDrugs.size()==0?0:planDrugDao.insertPlanDrugList(planDrugs);
    }

    @Override
    public int insertPlanInstructionList(List<OldKtPlanInstruction> planInstructionList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtPlanInstruction> planInstructions = new ArrayList<KtPlanInstruction>();
        for (OldKtPlanInstruction oldKtPlanInstruction : planInstructionList) {
            KtMedicationPlan medicationPlan = medicationPlanDao.selectById(oldKtPlanInstruction.getMedicationPlanId());
            if(medicationPlan!=null){
                KtPlanInstruction planInstruction = new KtPlanInstruction();
                planInstruction.setDrugIds(oldKtPlanInstruction.getDrugIds());
                planInstruction.setTheOrder(oldKtPlanInstruction.getOrder());
                planInstruction.setTheName(oldKtPlanInstruction.getName());
                planInstruction.setTheCourse(oldKtPlanInstruction.getCourse());
                planInstruction.setReviewRequired(oldKtPlanInstruction.getReviewRequired());
                planInstruction.setPlanInstructionKey(oldKtPlanInstruction.getId());
                planInstruction.setMedicationPlanKey(medicationPlan.getMedicationPlanKey());
                planInstruction.setMedicationPlanId(oldKtPlanInstruction.getMedicationPlanId());
                planInstruction.setInstructionId(oldKtPlanInstruction.getInstructionId());
                planInstructions.add(planInstruction);
            }
        }
        return planInstructions==null||planInstructions.size()==0?0:planInstructionDao.insertPlanInstructionList(planInstructions);
    }

    @Override
    public int insertPlanInstructionMessageList(List<OldKtPlanInstructionMessage> instructionMessageList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtPlanInstructionMessage> instructionMessages = new ArrayList<KtPlanInstructionMessage>();
        for (OldKtPlanInstructionMessage oldKtPlanInstructionMessage : instructionMessageList) {
            KtPlanInstruction planInstruction = planInstructionDao.selectById(oldKtPlanInstructionMessage.getInstructionId());
            if(planInstruction!=null){
                KtPlanInstructionMessage instructionMessage = new KtPlanInstructionMessage();
                instructionMessage.setDrugIds(oldKtPlanInstructionMessage.getDrugIds());
                instructionMessage.setInstructionId(oldKtPlanInstructionMessage.getInstructionId());
                instructionMessage.setPlanInstructionKey(planInstruction.getPlanInstructionKey());
                instructionMessage.setTheText(oldKtPlanInstructionMessage.getText());
                instructionMessage.setTheRoute(oldKtPlanInstructionMessage.getRoute());
                instructionMessage.setTheFrequency(oldKtPlanInstructionMessage.getFrequency());
                instructionMessage.setTheDuration(oldKtPlanInstructionMessage.getDuration());
                instructionMessage.setTheDosage(oldKtPlanInstructionMessage.getDosage());
                instructionMessage.setPlanInstructionMessageKey(oldKtPlanInstructionMessage.getId());
                instructionMessages.add(instructionMessage);
            }
        }
        return instructionMessages==null||instructionMessages.size()==0?0:instructionMessageDao.insertPlanInstructionMessageList(instructionMessages);
    }

    @Override
    public int insertPlanReferenceList(List<OldKtPlanReference> planReferenceList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtPlanReference> planReferences = new ArrayList<KtPlanReference>();
        for (OldKtPlanReference oldKtPlanReference : planReferenceList) {
            KtMedicationPlan medicationPlan = medicationPlanDao.selectById(oldKtPlanReference.getMedicinePlanId());
            if(medicationPlan!=null){
                KtPlanReference planReference = new KtPlanReference();
                planReference.setExternalId(oldKtPlanReference.getExternalId());
                planReference.setMedicinePlanId(oldKtPlanReference.getMedicinePlanId());
                planReference.setRefType(oldKtPlanReference.getRefType());
                planReference.setReferenceId(oldKtPlanReference.getReferenceId());
                planReference.setPlanReferenceKey(oldKtPlanReference.getId());
                planReference.setMedicationPlanKey(medicationPlan.getMedicationPlanKey());
                planReferences.add(planReference);
            }
        }
        return planReferences==null||planReferences.size()==0?0:planReferenceDao.insertPlanReferenceList(planReferences);
    }

    @Override
    public int insertPlanStudyList(List<OldKtPlanStudy> planStudyList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtPlanStudy> planStudies = new ArrayList<KtPlanStudy>();
        for (OldKtPlanStudy oldKtPlanStudy : planStudyList) {
            KtMedicationPlan medicationPlan = medicationPlanDao.selectById(oldKtPlanStudy.getMedicationPlanId());
            if(medicationPlan!=null){
                KtPlanStudy planStudy = new KtPlanStudy();
                planStudy.setMedicationPlanId(oldKtPlanStudy.getMedicationPlanId());
                planStudy.setMedicationPlanKey(medicationPlan.getMedicationPlanKey());
                planStudy.setPlanStudyKey(oldKtPlanStudy.getId());
                planStudy.setPmid(oldKtPlanStudy.getPmid());
                planStudy.setTheStudy(oldKtPlanStudy.getStudy());
                planStudy.setTheEvidence(oldKtPlanStudy.getEvidence());
                planStudy.setTheEfficacy(oldKtPlanStudy.getEfficacy());
                planStudy.setTheComparator(oldKtPlanStudy.getComparator());
                planStudies.add(planStudy);
            }
        }
        return planStudies==null||planStudies.size()==0?0:planStudyDao.insertPlanStudyList(planStudies);
    }

    @Override
    public int insertChemicalCategoryList(List<OldKtChemicalClassification> classificationList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtChemicalCategory> chemicalCategories = new ArrayList<KtChemicalCategory>();
        for (OldKtChemicalClassification oldKtChemicalClassification : classificationList) {
            KtChemicalCategory chemicalCategory = new KtChemicalCategory();
            chemicalCategory.setCategoryDefinition(oldKtChemicalClassification.getDefinition());
            chemicalCategory.setChemicalCategoryKey(oldKtChemicalClassification.getId());
            chemicalCategory.setChemontId(oldKtChemicalClassification.getChemontId());
            chemicalCategory.setClassificationName(oldKtChemicalClassification.getName());
            chemicalCategory.setParentId(oldKtChemicalClassification.getParentId());
            chemicalCategory.setCreatedAt(System.currentTimeMillis());
            chemicalCategory.setCreatedWay(createdWay);
            chemicalCategory.setCheckState(3);
            chemicalCategories.add(chemicalCategory);
        }
        int i = chemicalCategoryDao.insertChemicalCategoryList(chemicalCategories);
        return i;
    }

    @Override
    public int updateChemicalCategory(int page) {
        DbcontextHolder.setDbType("newDataSource");
        PageHelper.startPage(page,1000);
        List<KtChemicalCategory> categoryLists = chemicalCategoryDao.getChemicalCategoryLists();
        int i=0;
        for (KtChemicalCategory category : categoryLists) {
            if(category!=null){
                KtChemicalCategory chemicalCategory = chemicalCategoryDao.selectById(category.getParentId());
                if(chemicalCategory!=null){
                    category.setParentKey(chemicalCategory.getChemicalCategoryKey());
                    chemicalCategoryDao.updateByPrimaryKey(category);
                    i++;
                }
            }
        }
        return i;
    }

    @Override
    public int insertKtChemicalCategorySynonymList(List<OldKtChemicalSynonym> chemicalSynonymList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtChemicalCategorySynonym> categorySynonyms = new ArrayList<KtChemicalCategorySynonym>();
        for (OldKtChemicalSynonym oldKtChemicalSynonym : chemicalSynonymList) {
            KtChemicalCategorySynonym categorySynonym = new KtChemicalCategorySynonym();
            KtChemicalCategory category = chemicalCategoryDao.selectById(Integer.parseInt(oldKtChemicalSynonym.getChemontid()));
            if(category!=null){
                categorySynonym.setCategorySynonym(oldKtChemicalSynonym.getSynonym());
                categorySynonym.setChemontId(oldKtChemicalSynonym.getChemontid());
                categorySynonym.setCategorySynonymKey(oldKtChemicalSynonym.getId());
                categorySynonym.setChemicalCategoryKey(category.getChemicalCategoryKey());
                categorySynonyms.add(categorySynonym);
            }
        }
        return categorySynonymDao.insertSynonyms(categorySynonyms);
    }

    @Override
    public int insertCancerList(List<OldKtCancer> cancerList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtCancer> cancers = new ArrayList<KtCancer>();
        for (OldKtCancer oldKtCancer : cancerList) {
            KtCancer cancer = new KtCancer();
            cancer.setTheSource(oldKtCancer.getSource());
            cancer.setThePicture(oldKtCancer.getPicture());
            cancer.setTheLink(oldKtCancer.getLink());
            cancer.setSubtypeBase(oldKtCancer.getSubtypeBase());
            cancer.setPathogenesis(oldKtCancer.getPathogenesis());
            cancer.setParentIds(oldKtCancer.getParentId());
            cancer.setIsCommon(oldKtCancer.getIsCommon());
            cancer.setHistopathology(oldKtCancer.getHistopathology());
            cancer.setEnglishName(oldKtCancer.getEnglishName());
            cancer.setDoid(String.valueOf(oldKtCancer.getDoid()));
            cancer.setDiagnostics(oldKtCancer.getDiagnostics());
            cancer.setClinicalfeatures(oldKtCancer.getClinicalfeatures());
            cancer.setCancerName(oldKtCancer.getName());
            cancer.setCancerKey(oldKtCancer.getId());
            cancer.setCancerIncidence(oldKtCancer.getIncidence());
            cancer.setCancerDefinition(oldKtCancer.getDefinition());
            cancer.setCreatedAt(System.currentTimeMillis());
            cancer.setCheckState(checkState);
            cancer.setCreatedWay(createdWay);
            cancers.add(cancer);
        }
        return cancerDao.insertCancerList(cancers);
    }

    @Override
    public int updateCancer(int page) {
        DbcontextHolder.setDbType("newDataSource");
        PageHelper.startPage(page,1000);
        int i=0;
        List<KtCancer> cancerList = cancerDao.getCancerLists();
        for (KtCancer ktCancer : cancerList) {
            if(ktCancer!=null&&!StringUtils.isEmpty(ktCancer.getParentIds())){
                String parentIds = ktCancer.getParentIds();
                String[] doid = parentIds.split(",");
                List<String> idList = repeatString(doid);
                if(idList!=null&&idList.size()>0){
                    List<String> cancerListByIds = cancerDao.getCancerKeys(idList);
                    String[] parentKeyArray = cancerListByIds.toArray(new String[cancerListByIds.size()]);
                    String parentKeys = org.apache.commons.lang.StringUtils.join(parentKeyArray, ",");
                    ktCancer.setParentKeys(parentKeys);
                    i = cancerDao.updateByPrimaryKey(ktCancer);
                }
            }
        }
        return i;
    }

    @Override
    public int insertKnCancerList(List<KnCancer> knCancerList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtCancer> cancers = new ArrayList<KtCancer>();
        for (KnCancer knCancer : knCancerList) {
            KtCancer cancer = cancerDao.selectByPrimaryKey(knCancer.getId());
            if(cancer==null){
                KtCancer ktCancer = new KtCancer();
                ktCancer.setCancerKey(knCancer.getId());
                ktCancer.setTheSource(knCancer.getSource());
                ktCancer.setThePicture(knCancer.getPicture());
                ktCancer.setTheLink(knCancer.getLink());
                ktCancer.setSubtypeBase(knCancer.getSubtypeBase());
                ktCancer.setPathogenesis(knCancer.getPathogenesis());
                ktCancer.setIsCommon(knCancer.getCommon()==1?true:false);
                ktCancer.setHistopathology(knCancer.getHistopathology());
                ktCancer.setEnglishName(knCancer.getEnglishname());
                ktCancer.setDoid("0");
                ktCancer.setDiagnostics(knCancer.getDiagnostics());
                ktCancer.setClinicalfeatures(knCancer.getClinicalfeatures());
                ktCancer.setCancerName(knCancer.getName());
                ktCancer.setCancerIncidence(knCancer.getIncidence());
                ktCancer.setCancerDefinition(knCancer.getDefinition());
                ktCancer.setParentKeys(knCancer.getParentIds());
                ktCancer.setCheckState(checkState);
                ktCancer.setCreatedWay(createdWay);
                ktCancer.setCreatedAt(System.currentTimeMillis());
                cancers.add(ktCancer);
            }
        }
        return cancers==null||cancers.size()==0?0:cancerDao.insertCancerList(cancers);
    }

    @Override
    public int insertKnCancerAliasList(List<KnCancerAlias> cancerAliasList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtCancerAlias> cancerAliases = new ArrayList<KtCancerAlias>();
        for (KnCancerAlias knCancerAlias : cancerAliasList) {
            KtCancer cancer = cancerDao.selectByPrimaryKey(knCancerAlias.getCancerId());
            if(cancer!=null){
                KtCancerAlias cancerAlias = new KtCancerAlias();
                cancerAlias.setAliasName(knCancerAlias.getAliasName());
                cancerAlias.setPingyin(knCancerAlias.getPingyin());
                cancerAlias.setCancerAliasKey(knCancerAlias.getId());
                cancerAlias.setCancerKey(knCancerAlias.getCancerId());
                cancerAlias.setDoid(Integer.parseInt(cancer.getDoid()));
                cancerAliases.add(cancerAlias);
            }
        }
        return cancerAliases==null||cancerAliases.size()==0?0:cancerAliasDao.insertList(cancerAliases);
    }

    @Override
    public int insertKnCancerPhenotypicList(List<KnCancerPhenotypic> knCancerPhenotypicList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtCancerPhenotype> cancerPhenotypes = new ArrayList<KtCancerPhenotype>();
        for (KnCancerPhenotypic knCancerPhenotypic : knCancerPhenotypicList) {
            KtCancer cancer = cancerDao.selectByPrimaryKey(knCancerPhenotypic.getCancerId());
            if(cancer!=null){
                KtCancerPhenotype cancerPhenotype = new KtCancerPhenotype();
                cancerPhenotype.setCancerKey(knCancerPhenotypic.getCancerId());
                cancerPhenotype.setDoid(Integer.parseInt(cancer.getDoid()));
                cancerPhenotype.setCancerPhenotypeKey(knCancerPhenotypic.getId());
                cancerPhenotype.setMimId(knCancerPhenotypic.getMimId());
                cancerPhenotype.setNameCn(knCancerPhenotypic.getNamecn());
                cancerPhenotype.setNameEn(knCancerPhenotypic.getName());
                cancerPhenotype.setRemark(knCancerPhenotypic.getRemarks());
                cancerPhenotypes.add(cancerPhenotype);
            }
        }
        return cancerPhenotypes==null||cancerPhenotypes.size()==0?0:cancerPhenotypeDao.insertList(cancerPhenotypes);
    }

    @Override
    public int insertEvidenceList(List<OldKtEvidence> evidenceList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtEvidence> evidences = new ArrayList<KtEvidence>();
        for (OldKtEvidence oldKtEvidence : evidenceList) {
            KtEvidence evidence = new KtEvidence();
            evidence.setSummary(oldKtEvidence.getSummary());
            evidence.setEvidenceType(oldKtEvidence.getEvidenceType());
            evidence.setEvidenceLevel(oldKtEvidence.getEvidenceLevel());
            evidence.setEvidenceKey(oldKtEvidence.getId());
            evidence.setEvidenceId(oldKtEvidence.getEvidenceId());
            evidence.setEvidenceDirection(oldKtEvidence.getEvidenceDirection());
            evidence.setVariantId(oldKtEvidence.getVariantId());
            evidence.setDoid(oldKtEvidence.getDoid());
            evidence.setDoidName(oldKtEvidence.getDoidName());
            KtVariant variant = variantDao.getVariantById(oldKtEvidence.getVariantId());
            KtCancer cancer = cancerDao.selectByDoid(String.valueOf(oldKtEvidence.getDoid()));
            if(variant!=null){
                evidence.setVariantKey(variant.getVariantKey());
            }
            if(cancer!=null){
                evidence.setCancerKey(cancer.getCancerKey());
            }
            evidence.setCreatedAt(System.currentTimeMillis());
            evidence.setCreatedWay(createdWay);
            evidence.setCheckState(checkState);
            evidences.add(evidence);
        }
        return evidenceDao.insertEvidenceList(evidences);
    }

    @Override
    public int insertEvidenceDrugList(List<OldKtEvidenceDrug> evidenceDrugList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtEvidenceDrug> evidenceDrugs = new ArrayList<KtEvidenceDrug>();
        for (OldKtEvidenceDrug oldKtEvidenceDrug : evidenceDrugList) {
            KtEvidence evidence = evidenceDao.selectById(oldKtEvidenceDrug.getEvidenceId());
            KtDrug drug = drugDao.selectByDrugId(oldKtEvidenceDrug.getDrugId());
            if(evidence!=null&&drug!=null){
                KtEvidenceDrug evidenceDrug = new KtEvidenceDrug();
                evidenceDrug.setDrugId(oldKtEvidenceDrug.getDrugId());
                evidenceDrug.setEvidenceId(oldKtEvidenceDrug.getEvidenceId());
                evidenceDrug.setDrugKey(drug.getDrugKey());
                evidenceDrug.setEvidenceKey(evidence.getEvidenceKey());
                evidenceDrugs.add(evidenceDrug);
            }
        }
        return evidenceDrugs==null||evidenceDrugs.size()==0?0:evidenceDrugDao.insertList(evidenceDrugs);
    }

    @Override
    public int insertEvidenceReferenceList(List<OldKtEvidenceReference> evidenceReferenceList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtEvidenceReference> evidenceReferences = new ArrayList<KtEvidenceReference>();
        for (OldKtEvidenceReference oldKtEvidenceReference : evidenceReferenceList) {
            KtEvidence evidence = evidenceDao.selectById(oldKtEvidenceReference.getEvidenceId());
            if(evidence!=null){
                KtEvidenceReference evidenceReference = new KtEvidenceReference();
                evidenceReference.setEvidenceId(oldKtEvidenceReference.getEvidenceId());
                evidenceReference.setRefType(oldKtEvidenceReference.getRefType());
                evidenceReference.setEvidenceReferenceKey(oldKtEvidenceReference.getId());
                evidenceReference.setExternalId(oldKtEvidenceReference.getExternalId());
                evidenceReference.setEvidenceKey(evidence.getEvidenceKey());
                evidenceReferences.add(evidenceReference);
            }
        }
        return evidenceReferences==null||evidenceReferences.size()==0?0:evidenceReferenceDao.insertList(evidenceReferences);
    }

    @Override
    public int insertKnDocumentList(List<KnDocument> documentList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtDocument> documents = new ArrayList<KtDocument>();
        for (KnDocument knDocument : documentList) {
            KtDocument ktDocument = documentDao.selectByPrimaryKey(knDocument.getId());
            if(ktDocument==null){
                KtDocument document = new KtDocument();
                document.setDocumentKey(knDocument.getId());
                document.setDocumentFileName(knDocument.getName());
                document.setDocumentFilePath(knDocument.getPath());
                document.setCreatedAt(System.currentTimeMillis());
                document.setCreatedWay(createdWay);
                document.setCheckState(checkState);
                documents.add(document);
            }
        }
        return documents==null||documents.size()==0?0:documentDao.insertList(documents);
    }

    @Override
    public int insertKnScientficResearch(List<KnScientficResearch> scientficResearchList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtScientificResearch> scientificResearches = new ArrayList<KtScientificResearch>();
        for (KnScientficResearch knScientficResearch : scientficResearchList) {
            KtScientificResearch scientificResearch = scientificResearchDao.selectByPrimaryKey(knScientficResearch.getId());
            if(scientificResearch==null){
                KtScientificResearch ktScientificResearch = new KtScientificResearch();
                ktScientificResearch.setTheUrl(knScientficResearch.getUrl());
                ktScientificResearch.setTheTitle(knScientficResearch.getTitle());
                ktScientificResearch.setTheTime(knScientficResearch.getTime());
                ktScientificResearch.setTheSource(knScientficResearch.getSource());
                ktScientificResearch.setTheSort(knScientficResearch.getSort());
                ktScientificResearch.setTheResult(knScientficResearch.getResult());
                ktScientificResearch.setThePmid(knScientficResearch.getPmid());
                ktScientificResearch.setTheJournal(knScientficResearch.getJournal());
                ktScientificResearch.setTheConclusion(knScientficResearch.getConclusion());
                ktScientificResearch.setTheBackground(knScientficResearch.getBackground());
                ktScientificResearch.setTheAuthor(knScientficResearch.getAuthor());
                ktScientificResearch.setTheApproach(knScientficResearch.getApproach());
                ktScientificResearch.setTheAbstracts(knScientficResearch.getAbstracts());
                ktScientificResearch.setScientificResearchId("0");
                ktScientificResearch.setResearchKey(knScientficResearch.getId());
                ktScientificResearch.setCheckState(checkState);
                ktScientificResearch.setCreatedWay(createdWay);
                ktScientificResearch.setCreatedAt(System.currentTimeMillis());
                scientificResearches.add(ktScientificResearch);
            }
        }
        return scientificResearches==null||scientificResearches.size()==0?0:scientificResearchDao.insertList(scientificResearches);
    }

    @Override
    public int insertKnScientficResearchCancer(List<KnScientficResearchCancer> scientficResearchCancerList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtScientificResearchCancer> scientificResearchCancers = new ArrayList<KtScientificResearchCancer>();
        for (KnScientficResearchCancer knScientficResearchCancer : scientficResearchCancerList) {
            KtCancer cancer = cancerDao.selectByPrimaryKey(knScientficResearchCancer.getCancerId());
            KtScientificResearch scientificResearch = scientificResearchDao.selectByPrimaryKey(knScientficResearchCancer.getScientficResearchId());
            if(cancer!=null&&scientificResearch!=null){
                KtScientificResearchCancer ktScientificResearchCancer = new KtScientificResearchCancer();
                ktScientificResearchCancer.setCancerKey(knScientficResearchCancer.getCancerId());
                ktScientificResearchCancer.setDoid(Integer.parseInt(cancer.getDoid()));
                ktScientificResearchCancer.setResearchKey(knScientficResearchCancer.getScientficResearchId());
                ktScientificResearchCancer.setScientificResearchId(scientificResearch.getScientificResearchId());
                scientificResearchCancers.add(ktScientificResearchCancer);
            }
        }
        return scientificResearchCancers==null||scientificResearchCancers.size()==0?0:scientificResearchCancerDao.insertMore(scientificResearchCancers);
    }

    @Override
    public int insertKnScientficResearchDrug(List<KnScientficResearchDrug> scientficResearchDrugList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtScientificResearchDrug> scientificResearchDrugs = new ArrayList<KtScientificResearchDrug>();
        for (KnScientficResearchDrug knScientficResearchDrug : scientficResearchDrugList) {
            KtDrug ktDrug = drugDao.selectByPrimaryKey(knScientficResearchDrug.getDrugId());
            KtScientificResearch scientificResearch = scientificResearchDao.selectByPrimaryKey(knScientficResearchDrug.getScientficResearchId());
            if(ktDrug!=null&&scientificResearch!=null){
                KtScientificResearchDrug scientificResearchDrug = new KtScientificResearchDrug();
                scientificResearchDrug.setDrugId(String.valueOf(ktDrug.getDrugId()));
                scientificResearchDrug.setDrugKey(knScientficResearchDrug.getDrugId());
                scientificResearchDrug.setResearchKey(knScientficResearchDrug.getScientficResearchId());
                scientificResearchDrug.setScientificResearchId(scientificResearch.getScientificResearchId());
                scientificResearchDrugs.add(scientificResearchDrug);
            }
        }
        return scientificResearchDrugs==null||scientificResearchDrugs.size()==0?0:scientificResearchDrugDao.insertMore(scientificResearchDrugs);
    }

    @Override
    public int insertKnScientficResearchGene(List<KnScientficResearchGene> scientficResearchGeneList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtScientificResearchGene> scientificResearchGenes = new ArrayList<KtScientificResearchGene>();
        for (KnScientficResearchGene knScientficResearchGene : scientficResearchGeneList) {
            KtGene gene = geneDao.selectByPrimaryKey(knScientficResearchGene.getGeneId());
            KtScientificResearch scientificResearch = scientificResearchDao.selectByPrimaryKey(knScientficResearchGene.getScientficResearchId());
            if(gene!=null&&scientificResearch!=null){
                KtScientificResearchGene scientificResearchGene = new KtScientificResearchGene();
                scientificResearchGene.setGeneId(String.valueOf(gene.getGeneId()));
                scientificResearchGene.setGeneKey(knScientficResearchGene.getGeneId());
                scientificResearchGene.setScientificResearchId(scientificResearch.getScientificResearchId());
                scientificResearchGene.setResearchKey(knScientficResearchGene.getScientficResearchId());
                scientificResearchGenes.add(scientificResearchGene);
            }
        }
        return scientificResearchGenes==null||scientificResearchGenes.size()==0?0:scientificResearchGeneDao.insertMore(scientificResearchGenes);
    }

    @Override
    public int insertKtSyndromeGeneCancer(List<KnInheritedTumorSyndrome> inheritedTumorSyndromeList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtSyndromeGeneCancer> syndromeGeneCancers = new ArrayList<KtSyndromeGeneCancer>();
        for (KnInheritedTumorSyndrome knInheritedTumorSyndrome : inheritedTumorSyndromeList) {
            KtSyndromeGeneCancer ktSyndromeGeneCancer = syndromeGeneCancerDao.selectByPrimaryKey(knInheritedTumorSyndrome.getId());
            if(ktSyndromeGeneCancer==null){
                KtSyndromeGeneCancer syndromeGeneCancer = new KtSyndromeGeneCancer();
                syndromeGeneCancer.setTheSource(knInheritedTumorSyndrome.getDataSources());
                syndromeGeneCancer.setTheDescription(knInheritedTumorSyndrome.getIntroduction());
                syndromeGeneCancer.setSyndromeKey(knInheritedTumorSyndrome.getId());
                syndromeGeneCancer.setShortName(knInheritedTumorSyndrome.getAbbreviations());
                syndromeGeneCancer.setEnName(knInheritedTumorSyndrome.getName());
                syndromeGeneCancer.setCnName(knInheritedTumorSyndrome.getNamecn());
                syndromeGeneCancer.setCheckState(checkState);
                syndromeGeneCancer.setCreatedAt(System.currentTimeMillis());
                syndromeGeneCancer.setCreatedWay(createdWay);
                syndromeGeneCancers.add(syndromeGeneCancer);

            }
        }
        return syndromeGeneCancers==null||syndromeGeneCancers.size()==0?0:syndromeGeneCancerDao.insertList(syndromeGeneCancers);
    }

    @Override
    public int insertKtSyndromeCancer(List<KnInheritedTumorSyndromeCancer> inheritedTumorSyndromeCancerList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtSyndromeCancer> syndromeCancers = new ArrayList<KtSyndromeCancer>();
        for (KnInheritedTumorSyndromeCancer knInheritedTumorSyndromeCancer : inheritedTumorSyndromeCancerList) {
            KtCancer cancer = cancerDao.selectByPrimaryKey(knInheritedTumorSyndromeCancer.getCancerId());
            KtSyndromeGeneCancer ktSyndromeGeneCancer = syndromeGeneCancerDao.selectByPrimaryKey(knInheritedTumorSyndromeCancer.getInheritedTumorSyndromeId());
            if(cancer!=null&&ktSyndromeGeneCancer!=null){
                KtSyndromeCancer syndromeCancer = new KtSyndromeCancer();
                syndromeCancer.setCancerId(Integer.parseInt(cancer.getDoid()));
                syndromeCancer.setCancerKey(knInheritedTumorSyndromeCancer.getCancerId());
                syndromeCancer.setSyndromeKey(knInheritedTumorSyndromeCancer.getInheritedTumorSyndromeId());
                syndromeCancers.add(syndromeCancer);
            }
        }
        return syndromeCancers==null||syndromeCancers.size()==0?0:syndromeCancerDao.insertMore(syndromeCancers);
    }

    @Override
    public int insertKtSyndromeGene(List<KnInheritedTumorSyndromeGene> inheritedTumorSyndromeGeneList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtSyndromeGene> syndromeGenes = new ArrayList<KtSyndromeGene>();
        for (KnInheritedTumorSyndromeGene knInheritedTumorSyndromeGene : inheritedTumorSyndromeGeneList) {
            KtGene ktGene = geneDao.selectByPrimaryKey(knInheritedTumorSyndromeGene.getGeneId());
            KtSyndromeGeneCancer syndromeGeneCancer = syndromeGeneCancerDao.selectByPrimaryKey(knInheritedTumorSyndromeGene.getInheritedTumorSyndromeId());
            if(ktGene!=null&&syndromeGeneCancer!=null){
                KtSyndromeGene syndromeGene = new KtSyndromeGene();
                syndromeGene.setGeneId(ktGene.getGeneId());
                syndromeGene.setGeneKey(knInheritedTumorSyndromeGene.getGeneId());
                syndromeGene.setSyndromeKey(knInheritedTumorSyndromeGene.getInheritedTumorSyndromeId());
                syndromeGenes.add(syndromeGene);
            }
        }
        return syndromeGenes==null||syndromeGenes.size()==0?0:syndromeGeneDao.insertMore(syndromeGenes);
    }

    @Override
    public int insertktKeggPathWay(List<KnGeneMetabolism> geneMetabolismList) {
        DbcontextHolder.setDbType("newDataSource");
        List<KtKeggPathway> keggPathways = new ArrayList<KtKeggPathway>();
        for (KnGeneMetabolism knGeneMetabolism : geneMetabolismList) {
            KtKeggPathway ktKeggPathway = keggPathwayDao.selectByPrimaryKey(knGeneMetabolism.getId());
            if(ktKeggPathway==null){
                KtKeggPathway keggPathway = new KtKeggPathway();
                keggPathway.setKeggId(knGeneMetabolism.getNo());
                keggPathway.setSelleckLink(knGeneMetabolism.getSelleckLink());
                keggPathway.setPathwayName(knGeneMetabolism.getName());
                keggPathway.setPathwayKey(knGeneMetabolism.getId());
                keggPathway.setKeggLink(knGeneMetabolism.getKeggLink());
                keggPathway.setCreatedAt(System.currentTimeMillis());
                keggPathway.setCreatedWay(createdWay);
                keggPathway.setCheckState(checkState);
                keggPathways.add(keggPathway);
            }
        }
        return keggPathways==null||keggPathways.size()==0?0:keggPathwayDao.insertList(keggPathways);
    }

    /**
     * 去数组空串
     * @param str
     * @return
     */
    public List<String> repeatString(String[] str){
        List<String> list = new ArrayList<String>();
        for(int i = 0;i<str.length;i++){
            if(!StringUtils.isEmpty(str[i])){
                list.add(str[i]);
            }
        }
        return list;
    }

    /**
     * 主键生成
     * @param userKey
     * @param tableName
     * @return
     */
    public String getPrimaryKey(String userKey,String tableName) {
        UUID u = UUID.randomUUID();
        Random random = new Random();
        Integer s = random.nextInt(1000);
        //System.currentTimeMillis()
        String str = userKey + tableName + u.toString() + s.toString();
        String primaryKey = DigestUtils.md5Hex(str);
        return primaryKey;
    }
}
