package com.example.ProteinApp.service;

import com.example.ProteinApp.entities.PanierItem;
import com.example.ProteinApp.repository.PanierItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class IpanieritemServiceImpl implements IpanieritemService {

    @Autowired
    private PanierItemRepository panierItemRepository;

    @Override
    public PanierItem saveItem(PanierItem panierItem) {
        // TODO Auto-generated method stub
        return panierItemRepository.save(panierItem);
    }

    @Override
    public List<PanierItem> findAllItems() {
        // TODO Auto-generated method stub
        return panierItemRepository.findAll();
    }

    @Override
    public Optional<PanierItem> findById(Long id) {
        // TODO Auto-generated method stub
        return panierItemRepository.findById(id);
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        // TODO Auto-generated method stub
        panierItemRepository.deleteById(id);
		return null;
    }

	@Override
	public ResponseEntity<PanierItem> update(Long id, PanierItem panierItemDetails) {
		// TODO Auto-generated method stub
		return null;
	}
}
