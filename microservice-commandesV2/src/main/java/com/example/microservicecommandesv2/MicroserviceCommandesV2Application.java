package com.example.microservicecommandesv2;

import com.example.microservicecommandesv2.clients.ProduitRestClient;
import com.example.microservicecommandesv2.entities.Commande;
import com.example.microservicecommandesv2.repository.CommandeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.time.LocalDate;

@SpringBootApplication
@EnableFeignClients
public class MicroserviceCommandesV2Application {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceCommandesV2Application.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(CommandeRepository commandeRepository, ProduitRestClient produitRestClient) {
        return args -> {


            Commande commande1 = Commande.builder().desc("Description de se produit").date(LocalDate.now()).quantity(12).id_produit(1L).amount(4500.0).build();
            Commande commande2 = Commande.builder().desc(" Autre Description de se produit").date(LocalDate.now()).quantity(12).id_produit(2L).amount(4500.0).build();
            Commande commande3 = Commande.builder().desc("Description de se produit").date(LocalDate.now()).quantity(12).id_produit(3L).amount(4500.0).build();

            commandeRepository.save(commande1);
            commandeRepository.save(commande2);
            commandeRepository.save(commande3);


        };
    }
}
