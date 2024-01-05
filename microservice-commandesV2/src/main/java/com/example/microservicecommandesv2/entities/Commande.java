package com.example.microservicecommandesv2.entities;

import com.example.microservicecommandesv2.model.Produit;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder @ToString
public class Commande {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String desc;
    private int quantity;
    private LocalDate date;
    private Double amount;
    @Transient //ignore l'objet produit
    private Produit produit;
    private Long id_produit;


}
