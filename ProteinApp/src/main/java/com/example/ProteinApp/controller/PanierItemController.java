package com.example.ProteinApp.controller;

import java.util.List;
import javax.validation.Valid;
import com.example.ProteinApp.entities.PanierItem;
import com.example.ProteinApp.service.IpanieritemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/protein")
public class PanierItemController {
	@Autowired
	IpanieritemService itemv;
	
	@GetMapping("/items")
	public List<PanierItem> getAllItems() {
		List<PanierItem> pro = itemv.findAllItems();
        return pro;
	}
	
	@GetMapping("/item/{id}")
    public ResponseEntity<PanierItem> getPanierItemById(@PathVariable Long id) {
        return itemv.findById(id)
                .map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

	@PostMapping("/additem")
	public PanierItem createPanier(@Valid @RequestBody PanierItem item) {
	    return itemv.saveItem(item);
	}
	
	@PutMapping("/item/{id}")
    public ResponseEntity<PanierItem> updatePanierItem(@PathVariable Long id, @RequestBody PanierItem panierItemDetails) {
        return itemv.update(id, panierItemDetails);
    }

    @DeleteMapping("/item/{id}")
    public ResponseEntity<Void> deletePanierItem(@PathVariable Long id) {
        return itemv.delete(id);
    }
}


