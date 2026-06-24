package com.deutsche.cds.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "asset")
@Data
public class Asset {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String Symbol;

}
