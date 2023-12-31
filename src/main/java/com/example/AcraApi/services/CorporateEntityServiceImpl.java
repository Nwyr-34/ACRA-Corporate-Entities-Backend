package com.example.AcraApi.services;

import com.example.AcraApi.domain.model.CorporateEntity;
import com.example.AcraApi.domain.repository.CorporateEntityRepository;
import com.example.AcraApi.domain.service.CorporateEntityService;
import com.example.AcraApi.exceptions.CorporateEntityNotFoundException;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CorporateEntityServiceImpl implements CorporateEntityService {

    @Autowired
    private CorporateEntityRepository corporateEntityRepository;

    @Override
    public CorporateEntity create(CorporateEntity corporateEntity) {

        return corporateEntityRepository.save(corporateEntity);
    }

    @Override
    public List<CorporateEntity> findAll() {
        return corporateEntityRepository.findAll();
    }
    @Override
    public CorporateEntity findByUen(String uen) {
        return corporateEntityRepository.findById(uen).orElseThrow(() -> new CorporateEntityNotFoundException("Corporate Entity with UEN: " + uen + " not found"));
    }

    @Override
    public CorporateEntity update(String uen, CorporateEntity corporateEntity) {
        CorporateEntity corporateEntityToUpdate = corporateEntityRepository.findById(uen)
                .orElseThrow(() -> new CorporateEntityNotFoundException("Corporate Entity with UEN: " + uen + " not found"));

        corporateEntityToUpdate.setUen(corporateEntity.getUen());
        corporateEntityToUpdate.setEntityName(corporateEntity.getEntityName());

        corporateEntityToUpdate.setEntityTypeDescription(corporateEntity.getEntityTypeDescription());
        corporateEntityToUpdate.setBusinessConstitutionDescription(corporateEntity.getBusinessConstitutionDescription());
        corporateEntityToUpdate.setCompanyTypeDescription(corporateEntity.getCompanyTypeDescription());
        corporateEntityToUpdate.setEntityStatusDescription(corporateEntity.getEntityStatusDescription());

        corporateEntityToUpdate.setRegistrationIncorporationDate(corporateEntity.getRegistrationIncorporationDate());
        corporateEntityToUpdate.setUenIssueDate(corporateEntity.getUenIssueDate());

        corporateEntityToUpdate.setAddressType(corporateEntity.getAddressType());
        corporateEntityToUpdate.setBlock(corporateEntity.getBlock());
        corporateEntityToUpdate.setStreetName(corporateEntity.getStreetName());
        corporateEntityToUpdate.setLevel(corporateEntity.getLevel());
        corporateEntityToUpdate.setUnit(corporateEntity.getUnit());
        corporateEntityToUpdate.setBuildingName(corporateEntity.getBuildingName());
        corporateEntityToUpdate.setPostalCode(corporateEntity.getPostalCode());

        corporateEntityToUpdate.setAccountDueDate(corporateEntity.getAccountDueDate());
        corporateEntityToUpdate.setAnnualReturnDate(corporateEntity.getAnnualReturnDate());

        corporateEntityToUpdate.setNoOfCharges(corporateEntity.getNoOfCharges());
        corporateEntityToUpdate.setPrimarySsicCode(corporateEntity.getPrimarySsicCode());
        corporateEntityToUpdate.setPrimarySsicDescription(corporateEntity.getPrimarySsicDescription());
        corporateEntityToUpdate.setPrimaryUserDescribedActivity(corporateEntity.getPrimaryUserDescribedActivity());
        corporateEntityToUpdate.setSecondarySsicCode(corporateEntity.getSecondarySsicCode());
        corporateEntityToUpdate.setSecondarySsicDescription(corporateEntity.getSecondarySsicDescription());
        corporateEntityToUpdate.setSecondaryUserDescribedActivity(corporateEntity.getSecondaryUserDescribedActivity());

        corporateEntityToUpdate.setNoOfOfficers(corporateEntity.getNoOfOfficers());
        corporateEntityToUpdate.setFormerEntityName(corporateEntity.getFormerEntityName());
        corporateEntityToUpdate.setPaidUpCapitalCurrency(corporateEntity.getPaidUpCapitalCurrency());
        corporateEntityToUpdate.setPaidUpCapitalOrdinary(corporateEntity.getPaidUpCapitalOrdinary());
        corporateEntityToUpdate.setPaidUpCapitalPreference(corporateEntity.getPaidUpCapitalPreference());
        corporateEntityToUpdate.setPaidUpCapitalOthers(corporateEntity.getPaidUpCapitalOthers());

        corporateEntityToUpdate.setUenOfAuditFirm(corporateEntity.getUenOfAuditFirm());
        corporateEntityToUpdate.setNameOfAuditFirm(corporateEntity.getNameOfAuditFirm());

        return corporateEntityRepository.save(corporateEntityToUpdate);
    }


    @Override
    public void delete(String id) {
        corporateEntityRepository.deleteById(id);
    }
}
