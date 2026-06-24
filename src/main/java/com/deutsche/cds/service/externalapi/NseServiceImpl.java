package com.deutsche.cds.service.externalapi;

import com.deutsche.cds.response.NseResponse;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NseServiceImpl implements NseService{

    @Override
    public List<NseResponse> getResponseFromNse() {
        List<NseResponse> equities = List.of(

                new NseResponse(
                        "US0378331005",
                        "AAPL",
                        "Apple Inc.",
                        "Common Stock",
                        "NASDAQ",
                        "USD",
                        "United States",
                        "Technology",
                        "Consumer Electronics",
                        "Active",
                        "1980-12-12"
                ),

                new NseResponse(
                        "US5949181045",
                        "MSFT",
                        "Microsoft Corporation",
                        "Common Stock",
                        "NASDAQ",
                        "USD",
                        "United States",
                        "Technology",
                        "Software",
                        "Active",
                        "1986-03-13"
                ),

                new NseResponse(
                        "US02079K3059",
                        "GOOGL",
                        "Alphabet Inc.",
                        "Common Stock",
                        "NASDAQ",
                        "USD",
                        "United States",
                        "Technology",
                        "Internet Services",
                        "Active",
                        "2004-08-19"
                ),

                new NseResponse(
                        "INE009A01021",
                        "INFY",
                        "Infosys Limited",
                        "Common Stock",
                        "NSE",
                        "INR",
                        "India",
                        "Information Technology",
                        "IT Services",
                        "Active",
                        "1993-06-14"
                ),

                new NseResponse(
                        "INE467B01029",
                        "TCS",
                        "Tata Consultancy Services",
                        "Common Stock",
                        "NSE",
                        "INR",
                        "India",
                        "Information Technology",
                        "IT Services",
                        "Active",
                        "2004-08-25"
                )
        );

        return equities;
    }
}
