package com.example.microservicecommandesv2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter @Setter @ToString
public class Produit {
    private Long id;
    private String name;
    private String desc;
    private Double price;
}
