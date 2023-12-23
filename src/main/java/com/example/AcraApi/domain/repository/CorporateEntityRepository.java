package com.example.AcraApi.domain.repository;

import com.example.AcraApi.domain.model.CorporateEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorporateEntityRepository extends JpaRepository<CorporateEntity, String> {


}
