package com.deutsche.cds.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NseResponse {

    private String isin;
    private String tickerSymbol;
    private String companyName;
    private String securityType;
    private String exchange;
    private String currency;
    private String countryOfIssue;
    private String sector;
    private String industry;
    private String tradingStatus;
    private String issueDate;

//    ISIN
//    tickerSymbol;
//    Company Name
//    Security Type (Equity/Common Stock)
//    Exchange
//            Currency
//    Country of Issue
//            Sector
//    Industry
//    Trading Status
//    Issue Date

}
