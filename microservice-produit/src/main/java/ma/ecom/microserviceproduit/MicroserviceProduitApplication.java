package ma.ecom.microserviceproduit;

import ma.ecom.microserviceproduit.config.GlobalConfig;
import ma.ecom.microserviceproduit.entities.Produit;
import ma.ecom.microserviceproduit.repository.ProduitRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;

@SpringBootApplication
public class MicroserviceProduitApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceProduitApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProduitRepository produitRepository){
        return args -> {
            Produit produit1 = Produit.builder().name("HP").desc("Produit pc hp").price(10000.0).build();
            Produit produit2 = Produit.builder().name("Iphone").desc("Produit Iphone 12").price(8000.0).build();
            Produit produit3 = Produit.builder().name("Imprimante").desc("Produit Imprimante").price(5500.0).build();

            produitRepository.save(produit1);
            produitRepository.save(produit2);
            produitRepository.save(produit3);


        };
    }
}
