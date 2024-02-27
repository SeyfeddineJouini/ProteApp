package com.example.ProteinApp.service;

import org.springframework.http.ResponseEntity;
import com.example.ProteinApp.entities.PanierItem;
import java.util.List;
import java.util.Optional;

public interface IpanieritemService {

    List<PanierItem> findAllItems();

    Optional<PanierItem> findById(Long id);

    PanierItem saveItem(PanierItem item);

    ResponseEntity<PanierItem> update(Long id, PanierItem panierItemDetails);

    ResponseEntity<Void> delete(Long id);
}
