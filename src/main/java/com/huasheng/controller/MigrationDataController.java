package com.huasheng.controller;

import com.huasheng.pojo.knpojo.*;
import com.huasheng.pojo.oldpojo.*;
import com.huasheng.service.KnService;
import com.huasheng.service.NewDBService;
import com.huasheng.service.OldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by admin on 2017/7/10.
 */
@Controller
@RequestMapping("/migrationData")
public class MigrationDataController {
    @Autowired
    private NewDBService newDBService;
    @Autowired
    private OldService oldService;
    @Autowired
    private KnService knService;

    @RequestMapping("/newDBTest")
    @ResponseBody
    public int newDBTest(int page){
        int num=0;
        for(int i=1;i<=page;i++){
            //List<OldKtDrug> oldKtDrugs = oldService.getOldList(page);
            //int drugList = newDBService.insertDrugList(oldKtDrugs);

            //List<KnDrug> knDrugList = knService.getKnDrugList();
            //num = newDBService.insertDrugList(knDrugList);

            //List<KnDrugAlias> knDrugAliasList = knService.getKnDrugAliasList();
            //num = newDBService.insertKnDrugAlias(knDrugAliasList);

            //List<OldKtDrugProduct> productList = oldService.getOldKtDrugProductList(i);
            //num = newDBService.insertDrugProduct(productList);

            //List<OldKtSideEffect> sideEffectList = oldService.getOldKtSideEffectList(i);
            //num = newDBService.insertKtSideEffect(sideEffectList);

            //List<KnAdverseReactions> adverseReactionsList = knService.getKnAdverseReactionsList();
            //num = newDBService.insertKnSideEffect(adverseReactionsList);

            //List<OldKtMeshCategory> meshCategoryList = oldService.getOldKtMeshCategoryList(i);
            //num = newDBService.insertMeshCategory(meshCategoryList);

            //List<OldKtGene> geneList = oldService.getOldGeneList(i);
            //num = newDBService.insertGeneList(geneList);

            //List<KnGene> knGeneList = knService.getKnGeneList();
            //num = newDBService.insertKnGeneList(knGeneList);

            //List<KnGeneCancer> geneCancerList = knService.getKnGeneCancerList();
            //num = newDBService.insertKnGeneCancer(geneCancerList);

            List<KnGeneGeneMetabolism> geneGeneMetabolismList = knService.getKnGeneGeneMetabolismList();
            num = newDBService.insertKtGeneKeggPathway(geneGeneMetabolismList);

            //List<KnDocument> documentList = knService.getKnDocumentList();
            //num = newDBService.insertKnDocumentList(documentList);

            //List<OldKtIndication> indicationList = oldService.getOlcIndicationList(i);
            //num = newDBService.insertIndication(indicationList);

           // List<OldKtVariant> variantList = oldService.getOldKtVariantList(i);
            //num = newDBService.insertVariantList(variantList);

            //List<KnGeneMutation> geneMutationList = knService.getKnGeneMutationList();
            //num = newDBService.insertKtVariantList(geneMutationList);

            //List<OldKtProtein> proteinList = oldService.getOldKtProteinList(i);
            //num = newDBService.insertProteinList(proteinList);

            //List<OldKtClinicalTrial> clinicalTrialList = oldService.getOldKtClinicalTrialList(i);
            //num = newDBService.insertClinicalTrialList(clinicalTrialList);

            //List<OldKtMedicationPlan> medicationPlanList = oldService.getOldKtMedicationPlanList(i);
            //num = newDBService.insertMedicationPlanList(medicationPlanList);

            //List<OldKtChemicalClassification> chemicalList = oldService.getOldKtChemicalList(i);
            //num = newDBService.insertChemicalCategoryList(chemicalList);
            //num = newDBService.updateChemicalCategory(i);

            //List<OldKtCancer> cancerList = oldService.getOldKtCancerList(i);
            //num = newDBService.insertCancerList(cancerList);
            //num = newDBService.updateCancer(i);

            //List<KnCancer> knCancerList = knService.getKnCancerList();
            //num = newDBService.insertKnCancerList(knCancerList);

            //List<KnCancerAlias> cancerAliasList = knService.getKnCancerAliasList();
            //num = newDBService.insertKnCancerAliasList(cancerAliasList);

            //List<KnCancerPhenotypic> cancerPhenotypicList = knService.getKnCancerPhenotypicList();
            //num = newDBService.insertKnCancerPhenotypicList(cancerPhenotypicList);

            //List<OldKtEvidence> evidenceList = oldService.getOldKtEvidence(i);
            //num = newDBService.insertEvidenceList(evidenceList);

            //List<OldKtProteinSynonym> proteinSynonymList = oldService.getProteinSynonymList(i);
            //num = newDBService.insertProteinSynonymList(proteinSynonymList);

            //List<OldKtChemicalSynonym> chemicalSynonymList = oldService.getOldKtChemicalSynonyms(i);
            //num = newDBService.insertKtChemicalCategorySynonymList(chemicalSynonymList);

            //List<OldKtDrugSynonym> drugSynonymList = oldService.getOldDrugSynonymList(i);
            //num = newDBService.insertDrugSynonymList(drugSynonymList);

            //List<OldKtDrugOtherName> otherNameList = oldService.getOldDrugOtherNameList(i);
            //num = newDBService.insertDrugOtherNameList(otherNameList);

            //List<OldKtDrugExternalId> externalIdList = oldService.getOldDrugExternalIdList(i);
            //num = newDBService.insertDrugExternalIdList(externalIdList);

            //List<OldKtDrugSequence> sequenceList = oldService.getOldDrugSequenceList(i);
            //num = newDBService.insertDrugSequenceList(sequenceList);

            //List<OldKtDrugInteraction> interactionList = oldService.getOldDrugInteractionList(i);
            //num = newDBService.insertDrugInteractionList(interactionList);

            //List<OldKtDrugProductEtnId> productEtnIdList = oldService.getOldDrugProductEtnIdList(i);
            //num = newDBService.insertDrugProductEtnId(productEtnIdList);

            //List<OldKtClinicalTrailOutcome> clinicalTrailOutcomeList = oldService.getOldClinicalTrailOutcome(i);
            //num = newDBService.insertClinicalTrailOutcomeList(clinicalTrailOutcomeList);

            //List<OldKtGeneAlias> oldGeneAliasList = oldService.getOldGeneAliasList(i);
            //num = newDBService.insertGeneAliasList(oldGeneAliasList);

            //List<OldKtGeneExternalId> externalIdList = oldService.getOldGeneExternalIdList(i);
            //num = newDBService.insertGeneExternalIdList(externalIdList);

            //List<OldKtGeneOtherName> geneOtherNameList = oldService.getOldGeneOtherName(i);
            //num = newDBService.insertGeneOtherNameList(geneOtherNameList);

           // List<OldKtGeneGenomicContext> genomicContextList = oldService.getOldGeneGenomicContextList(i);
            //num = newDBService.insertGeneGenomicContextList(genomicContextList);

            //List<OldKtGeneLocation> geneLocationList = oldService.getOldGeneLocationList(i);
            //num = newDBService.insertGeneLocationList(geneLocationList);

            //List<OldKtClinicalTrailCancer> clinicalTrailCancerList = oldService.getOldClinicalTrailCancerList(i);
            //num = newDBService.insertClinicalTrailCancerList(clinicalTrailCancerList);

            //List<OldKtEvidenceDrug> evidenceDrugList = oldService.getOldEvidenceDrugList(i);
            //num = newDBService.insertEvidenceDrugList(evidenceDrugList);

            //List<OldKtEvidenceReference> evidenceReferenceList = oldService.getOldEvidenceReferenceList(i);
            //num = newDBService.insertEvidenceReferenceList(evidenceReferenceList);

            //List<OldKtPlanCancer> planCancerList = oldService.getOldPlanCancerList(i);
            //num = newDBService.insertPlanCancerList(planCancerList);

           // List<OldKtPlanDrug> planDrugList = oldService.getOldPlanDrugList(i);
            //num = newDBService.insertPlanDrugList(planDrugList);

            //List<OldKtPlanInstruction> planInstructionList = oldService.getOldPlanInstructionList(i);
            //num = newDBService.insertPlanInstructionList(planInstructionList);

            //List<OldKtPlanInstructionMessage> instructionMessageList = oldService.getOldPlanInstructionMessageList(i);
            //num = newDBService.insertPlanInstructionMessageList(instructionMessageList);

            //List<OldKtPlanReference> planReferenceList = oldService.getOldPlanReferenceList(i);
            //num = newDBService.insertPlanReferenceList(planReferenceList);

            //List<OldKtPlanStudy> planStudyList = oldService.getOldPlanStudyList(i);
            //num = newDBService.insertPlanStudyList(planStudyList);

            //List<KnScientficResearch> scientficResearchList = knService.getKnScientficResearchList();
            //num = newDBService.insertKnScientficResearch(scientficResearchList);

            //List<KnScientficResearchCancer> researchCancerList = knService.getKnScientficResearchCancerList();
            //num = newDBService.insertKnScientficResearchCancer(researchCancerList);

            //List<KnScientficResearchDrug> scientficResearchDrugList = knService.getKnScientficResearchDrugList();
            //num = newDBService.insertKnScientficResearchDrug(scientficResearchDrugList);

            //List<KnScientficResearchGene> scientficResearchGeneList = knService.getKnScientficResearchGeneList();
            //num = newDBService.insertKnScientficResearchGene(scientficResearchGeneList);

            //List<KnInheritedTumorSyndrome> inheritedTumorSyndromeList = knService.getKnInheritedTumorSyndromeList();
            //num = newDBService.insertKtSyndromeGeneCancer(inheritedTumorSyndromeList);

            //List<KnInheritedTumorSyndromeCancer> inheritedTumorSyndromeCancerList = knService.getKnInheritedTumorSyndromeCancerList();
            //num = newDBService.insertKtSyndromeCancer(inheritedTumorSyndromeCancerList);

            //List<KnInheritedTumorSyndromeGene> inheritedTumorSyndromeGeneList = knService.getKnInheritedTumorSyndromeGeneList();
            //num = newDBService.insertKtSyndromeGene(inheritedTumorSyndromeGeneList);

            //List<KnGeneMetabolism> geneMetabolismList = knService.getKnGeneMetabolismList();
            //num = newDBService.insertktKeggPathWay(geneMetabolismList);
        }
        return num;
    }

    @RequestMapping("/knDrugTest")
    @ResponseBody
    public List<KnDrug> getKnDrug(){
        List<KnDrug> knDrugList = knService.getKnDrugList();
        return knDrugList;
    }
}
