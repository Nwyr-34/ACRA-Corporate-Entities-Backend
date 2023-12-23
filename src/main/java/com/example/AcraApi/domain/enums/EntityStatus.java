package com.example.AcraApi.domain.enums;

public enum EntityStatus {
    Cancelled,
    NonRenewal, // Cancelled (Non-Renewal)
    Live,
    CeasedRegistration,
    LiveCompany,
    StruckOff,
    DissolvedMembers, // Dissolved (Members' Voluntary Winding Up)
    DissolvedCompulsory, // Dissolved (Compulsory Winding Up)
    InLiquidation, // In Liquidation Members' Voluntary Winding Up
    na // Not Applicable

}
