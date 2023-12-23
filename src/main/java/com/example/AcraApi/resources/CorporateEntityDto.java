package com.example.AcraApi.resources;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class CorporateEntityDto {
    private String uen; // Unique Entity Number

    private String issuanceAgencyId;

    private String entityName;

    private String entityTypeDescription;

    private String businessConstitutionDescription;


    private String companyTypeDescription;

    private String entityStatusDescription;

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
