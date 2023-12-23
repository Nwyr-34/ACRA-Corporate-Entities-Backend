package com.example.AcraApi.controllers;

import com.example.AcraApi.domain.model.CorporateEntity;
import com.example.AcraApi.domain.service.CorporateEntityService;
import com.example.AcraApi.resources.CorporateEntityDto;
import com.example.AcraApi.resources.SaveCorporateEntityDto;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/entities")
public class CorporateEntityController {
    @Autowired
    private final ModelMapper mapper;

    @Autowired
    private CorporateEntityService corporateEntityService;

    //Post or Create
    @PostMapping("/create-entities")
    public CorporateEntityDto createCorporateEntity(@Valid @RequestBody SaveCorporateEntityDto resource) {
        CorporateEntity corporateEntity = convertToEntity(resource);
        return convertToResource(corporateEntityService.create(corporateEntity));
    }

    //Put or Update
    @PutMapping("/{uen}")
    public CorporateEntityDto updateCorporateEntity(@PathVariable String uen, @RequestBody SaveCorporateEntityDto resource) {
        CorporateEntity corporateEntity = convertToEntity(resource);
        return convertToResource(corporateEntityService.update(uen, corporateEntity));
    }

    //Get all
    @GetMapping
    public List<CorporateEntity> getAllCorporateEntities() {
        return corporateEntityService.findAll();
    }

    //Get by UEN (id)
    @GetMapping("/{uen}")
    public CorporateEntityDto getCorporateEntityByUen(@PathVariable String uen) {
        return convertToResource(corporateEntityService.findByUen(uen));
    }

    //Delete
    @DeleteMapping("/{uen}")
    public void deleteCorporateEntity(@PathVariable String uen) {
        corporateEntityService.delete(uen);
    }









    //Mapping methods
    private CorporateEntity convertToEntity(SaveCorporateEntityDto resource) {
        return mapper.map(resource, CorporateEntity.class);
    }
    private CorporateEntityDto convertToResource(CorporateEntity entity) {
        return mapper.map(entity, CorporateEntityDto.class);
    }



}
