package com.example.AcraApi.domain.service;

import com.example.AcraApi.domain.model.CorporateEntity;

import java.util.List;

public interface CorporateEntityService {

    //Add new corporate entity
    CorporateEntity create(CorporateEntity corporateEntity);

    //Update corporate entity
    CorporateEntity update(String id, CorporateEntity corporateEntity);

    //Get all corporate entities
    List<CorporateEntity> findAll();

    //Get corporate entity by UEN
    CorporateEntity findByUen(String uen);

    //Delete corporate entity
    void delete(String id);

}
