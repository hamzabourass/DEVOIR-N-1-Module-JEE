package ma.ecom.microserviceproduit.repository;

import ma.ecom.microserviceproduit.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProduitRepository extends JpaRepository<Produit,Long> {
}
