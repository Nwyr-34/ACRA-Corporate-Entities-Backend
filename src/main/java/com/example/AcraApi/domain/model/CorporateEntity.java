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

    @Column(nullable = false, name = "issuance_agency_id")
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

    @Column(name = "address_type")
    private String addressType;

    @Column(name = "block")
    private int block;

    @Column(name = "street_name")
    private String streetName;

    @Column(name = "level_no")
    private String level;

    @Column(name = "unit_no")
    private String unit;

    @Column(name = "building_name")
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

    @Column(name = "primary_user_described_activity")
    private String primaryUserDescribedActivity;

    @Column(name = "secondary_ssic_code")
    private int secondarySsicCode;

    @Column(name = "secondary_ssic_description")
    private String secondarySsicDescription;

    @Column(name = "secondary_user_described_activity")
    private String secondaryUserDescribedActivity;

    @Column(name = "no_of_officers")
    private int noOfOfficers;

    @Column(name = "former_entity_name")
    private String formerEntityName;

    @Column(name = "paid_up_capital_currency")
    private String paidUpCapitalCurrency;

    @Column(name = "paid_up_capital_ordinary")
    private String paidUpCapitalOrdinary;

    @Column(name = "paid_up_capital_preference")
    private String paidUpCapitalPreference;

    @Column(name = "paid_up_capital_others")
    private String paidUpCapitalOthers;

    @Column(name = "uen_of_audit_firm")
    private String uenOfAuditFirm;

    @Column(name = "name_of_audit_firm")
    private String nameOfAuditFirm;

}
