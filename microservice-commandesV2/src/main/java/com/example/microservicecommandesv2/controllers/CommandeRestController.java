package com.example.microservicecommandesv2.controllers;

import com.example.microservicecommandesv2.clients.ProduitRestClient;
import com.example.microservicecommandesv2.configurations.ConfigurationApp;
import com.example.microservicecommandesv2.entities.Commande;
import com.example.microservicecommandesv2.model.Produit;
import com.example.microservicecommandesv2.repository.CommandeRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@AllArgsConstructor
public class CommandeRestController implements HealthIndicator {

    private final CommandeRepository commandeRepository;
    private final ProduitRestClient produitRestClient;

    private final ConfigurationApp configurationApp;

    @GetMapping("/commandes")
    public List<Commande> commandeList() throws Exception {

        List<Commande> commandeList = commandeRepository.findAll();
        commandeList.forEach(acc->{
            acc.setProduit(produitRestClient.findProductById(acc.getId_produit()));
        });
        if(commandeList.isEmpty()){
            throw new Exception("Pas de commande pour le momment ");
        }

        return commandeList.subList(0,configurationApp.getCommandes_last());
    }

    @GetMapping("/commande/{id}")
    public Commande showCommande(@PathVariable Long id){
        Commande cmd;
        cmd = commandeRepository.findById(id).orElse(null);
        Produit produit = produitRestClient.findProductById(id);
        cmd.setProduit(produit);

        return cmd;
    }
    @PutMapping("/modify/{id}")
    public ResponseEntity<Commande> modifyCommande(@PathVariable Long id, @RequestBody Commande CommandeModifie){
        Optional<Commande> optionalCommande = commandeRepository.findById(id);
        if(optionalCommande.isPresent()){
            Commande commandeExistante = optionalCommande.get();
            commandeExistante.setDate(CommandeModifie.getDate());
            commandeExistante.setDesc(CommandeModifie.getDesc());
            commandeExistante.setAmount(CommandeModifie.getAmount());
            commandeExistante.setQuantity(CommandeModifie.getQuantity());
            commandeRepository.save(commandeExistante);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Commande> deleteCommande(@PathVariable Long id){
        Optional<Commande> optionalCommande = commandeRepository.findById(id);
        if(optionalCommande.isPresent()){
            commandeRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @Override
    public Health getHealth(boolean includeDetails) {
        return HealthIndicator.super.getHealth(includeDetails);
    }

    @Override
    public Health health() {
        System.out.println("****** Actuator : CommandeRestController health() ");
        List<Commande> commandes = commandeRepository.findAll();
        if (commandes.isEmpty()) {
            return Health.down().build();
        }
        return Health.up().build();
    }
}

