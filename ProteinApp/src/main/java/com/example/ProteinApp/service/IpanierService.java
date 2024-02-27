package com.example.ProteinApp.service;

import com.example.ProteinApp.entities.Panier;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface IpanierService {

    List<Panier> findAllPaniers();

    Optional<Panier> findById(Long id);

    Panier savePanier(Panier panier);

    ResponseEntity<Panier> update(Long id, Panier panierDetails);

    ResponseEntity<Void> delete(Long id);
}
