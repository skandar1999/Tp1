package com.sska.produits.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.sska.produits.entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit, Long> {

}
