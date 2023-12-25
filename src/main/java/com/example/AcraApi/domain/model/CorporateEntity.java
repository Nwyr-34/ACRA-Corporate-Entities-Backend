package com.example.AcraApi.domain.model;

import com.example.AcraApi.domain.enums.BusinessConstitution;
import com.example.AcraApi.domain.enums.CompanyType;
import com.example.AcraApi.domain.enums.EntityStatus;
import com.example.AcraApi.domain.enums.EntityType;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "tb_corporate_entities")
@Table(name = "tb_corporate_entities")
public class CorporateEntity {
    @Id
    @Column(name = "uen")
    private String uen; // Unique Entity Number

    @Column(name = "issuance_agency_id", columnDefinition = "varchar(10) default 'ACRA'")
    private String issuanceAgencyId;

    @Column(nullable = false, name = "entity_name")
    private String entityName;


    @Column(name = "entity_type_description")
    @Enumerated(EnumType.STRING)
    private EntityType entityTypeDescription;

    @Column(name = "business_constitution_description")
    @Enumerated(EnumType.STRING)
    private BusinessConstitution businessConstitutionDescription;

    @Column(name = "company_type_description")
    @Enumerated(EnumType.STRING)
    private CompanyType companyTypeDescription;

    @Column(name = "entity_status_description")
    @Enumerated(EnumType.STRING)
    private EntityStatus entityStatusDescription;

    @Column(name = "registration_incorporation_date")
    private Date registrationIncorporationDate;

    @Column(name = "uen_issue_date")
    private Date uenIssueDate;

    @Column(name = "address_type", columnDefinition = "varchar(255) default 'LOCAL'")
    private String addressType;

    @Column(name = "block")
    private int block;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "level_no", columnDefinition = "varchar(255) default 'na'")
    private String level;

    @Column(name = "unit_no", columnDefinition = "varchar(255) default 'na'")
    private String unit;

    @Column(name = "building_name", columnDefinition = "varchar(255) default 'na'")
    private String buildingName;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "account_due_date")
    private Date accountDueDate;

    @Column(name = "annual_return_date")
    private Date annualReturnDate;

    @Column(name = "no_of_charges")
    private int noOfCharges;

    @Column(name = "primary_ssic_code")
    private int primarySsicCode;

    @Column(name = "primary_ssic_description")
    private String primarySsicDescription;

    @Column(name = "primary_user_described_activity", columnDefinition = "varchar(255) default 'na'")
    private String primaryUserDescribedActivity;

    @Column(name = "secondary_ssic_code", columnDefinition = "varchar(255) default 'na'")
    private String secondarySsicCode;

    @Column(name = "secondary_ssic_description", columnDefinition = "varchar(255) default 'na'")
    private String secondarySsicDescription;

    @Column(name = "secondary_user_described_activity", columnDefinition = "varchar(255) default 'na'")
    private String secondaryUserDescribedActivity;

    @Column(name = "no_of_officers")
    private int noOfOfficers;

    @Column(name = "former_entity_name", columnDefinition = "varchar(255) default 'na'")
    private String formerEntityName;

    @Column(name = "paid_up_capital_currency", columnDefinition = "varchar(10) default 'na'")
    private String paidUpCapitalCurrency;

    @Column(name = "paid_up_capital_ordinary", columnDefinition = "varchar(20) default 'na'")
    private String paidUpCapitalOrdinary;

    @Column(name = "paid_up_capital_preference", columnDefinition = "varchar(20) default 'na'")
    private String paidUpCapitalPreference;

    @Column(name = "paid_up_capital_others", columnDefinition = "varchar(20) default 'na'")
    private String paidUpCapitalOthers;

    @Column(name = "uen_of_audit_firm", columnDefinition = "varchar(255) default 'na'")
    private String uenOfAuditFirm;

    @Column(name = "name_of_audit_firm", columnDefinition = "varchar(255) default 'na'")
    private String nameOfAuditFirm;

}
