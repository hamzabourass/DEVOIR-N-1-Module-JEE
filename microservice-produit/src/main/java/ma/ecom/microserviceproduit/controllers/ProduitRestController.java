package ma.ecom.microserviceproduit.controllers;

import io.github.resilience4j.timelimiter.annotation.TimeLimiter;
import lombok.AllArgsConstructor;
import ma.ecom.microserviceproduit.entities.Produit;
import ma.ecom.microserviceproduit.repository.ProduitRepository;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;

@RestController
@AllArgsConstructor
public class ProduitRestController implements HealthIndicator {

    private final ProduitRepository produitRepository;

    @GetMapping("/produits")
    public List<Produit> produitList(){
        return produitRepository.findAll();
    }

    @GetMapping("/produits/{id}")
    public Produit commandeById(@PathVariable Long id){
        return produitRepository.findById(id).get();
    }
    @Override
    public Health getHealth(boolean includeDetails) {
        return HealthIndicator.super.getHealth(includeDetails);
    }

    @Override
    public Health health() {
        return Health.up().build();
    }

   /* @Override
    public Health health() {
        System.out.println("****** Actuator : ProduitRestController health() ");
        List<Produit> produits = produitRepository.findAll();
        if (produits.isEmpty()) {
            return Health.down().build();
        }
        return Health.up().build();
    }*/
}
