package com.example.ProteinApp.controller;

import java.util.List;
import javax.validation.Valid;
import com.example.ProteinApp.entities.Panier;
import com.example.ProteinApp.service.IpanierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/protein")
public class PanierController {
	@Autowired
	IpanierService panierv;
	
	@GetMapping("/paniers")
	public List<Panier> getAllPaniers() {
		List<Panier> pro = panierv.findAllPaniers();
        return pro;
	}
	
	@GetMapping("/panier/{id}")
    public ResponseEntity<Panier> getPanierItemById(@PathVariable Long id) {
        return panierv.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

	@PostMapping("/addpanier")
	public Panier createPanier(@Valid @RequestBody Panier panier) {
		return panierv.savePanier(panier);
	}
	
	@PutMapping("/panier/{id}")
    public ResponseEntity<Panier> updatePanierItem(@PathVariable Long id, @RequestBody Panier panierDetails) {
        return panierv.update(id, panierDetails);
    }

    @DeleteMapping("/panier/{id}")
    public ResponseEntity<Void> deletePanierItem(@PathVariable Long id) {
        return panierv.delete(id);
    }
}