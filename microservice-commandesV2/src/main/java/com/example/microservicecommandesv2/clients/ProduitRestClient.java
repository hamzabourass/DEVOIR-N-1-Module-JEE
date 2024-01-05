package com.example.microservicecommandesv2.clients;

import com.example.microservicecommandesv2.model.Produit;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

// utilise le nom du micro service qu'il le recupere a partive de Discovery service eurika
@FeignClient(name = "PRODUIT-SERVICE")

public interface ProduitRestClient {


    @GetMapping("/produits/{id}")
    //name pour permettre de configurer dans fichier properties
    //fallbackMethode indique quel methode doit appeler si la methode echoue
    @CircuitBreaker(name = "produitService", fallbackMethod = "getDefaultProduct")
    Produit findProductById(@PathVariable Long id);
    @GetMapping("/produits")
    @CircuitBreaker(name = "produitService", fallbackMethod = "getAllProducts")
    List<Produit> allProduct();

    //fallback methode transmettre l'exception a cette methode
    default Produit getDefaultProduct(Long id, Exception exception){
        Produit produit=new Produit();
        produit.setId(id);
        produit.setName("No Name Available");
        produit.setDesc("No Description Available");
        produit.setPrice(null);

        return produit;
    }
    default List<Produit> getAllProducts(Exception exception){
        return List.of();
    }
}
