package com.deutsche.cds.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "equity")
@Data
public class Equity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tickerSymbol;
    private String companyName;
    private String currency;
    private String exchange;
}
