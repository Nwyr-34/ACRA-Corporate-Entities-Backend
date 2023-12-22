package com.example.AcraApi.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
    private String uen; // Unique Entity Number

    private String issuanceAgencyId;

    private String entityName;
    private EntityType entityTypeDescription;
    private BusinessConstitution businessConstitutionDescription;
    private CompanyType companyTypeDescription;
    private EntityStatus entityStatusDescription;

    private Date registrationIncorporationDate;
    private Date uenIssueDate;
    private String addressType;
    private int block;
    private String streetName;
    private String level; // Level No.
    private String unit; // Unit No.
    private String buildingName;
    private String postalCode;

    private Date accountDueDate;
    private Date annualReturnDate;
    private int noOfCharges; // No. of Charges
    private int primarySsicCode;
    private String primarySsicDescription;
    private String primaryUserDescribedActivity;
    private int secondarySsicCode;
    private String secondarySsicDescription;
    private String secondaryUserDescribedActivity;

    private int noOfOfficers; // No. of Officers
    private String formerEntityName;

    private String paidUpCapitalCurrency;
    private String paidUpCapitalOrdinary;
    private String paidUpCapitalPreference;
    private String paidUpCapitalOthers;

    private String uenOfAuditFirm; // UEN of Audit Firm
    private String nameOfAuditFirm;

}
