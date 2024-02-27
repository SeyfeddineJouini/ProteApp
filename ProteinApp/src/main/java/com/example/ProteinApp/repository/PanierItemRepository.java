package com.example.ProteinApp.repository;

import com.example.ProteinApp.entities.PanierItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PanierItemRepository extends JpaRepository<PanierItem, Long> {
}

