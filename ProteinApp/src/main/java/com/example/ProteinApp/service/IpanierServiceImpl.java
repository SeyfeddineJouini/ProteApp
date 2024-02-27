package com.example.ProteinApp.service;

import com.example.ProteinApp.entities.Panier;
import com.example.ProteinApp.repository.PanierRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class IpanierServiceImpl implements IpanierService {

    @Autowired
    private PanierRepository panierRepository;

    @Override
    public Panier savePanier(Panier panier) {
        // TODO Auto-generated method stub
        return panierRepository.save(panier);
    }

    @Override
    public List<Panier> findAllPaniers() {
        // TODO Auto-generated method stub
        return panierRepository.findAll();
    }

    @Override
    public Optional<Panier> findById(Long id) {
        // TODO Auto-generated method stub
        return panierRepository.findById(id);
    }

    @Override
    public ResponseEntity<Void> delete(Long id) {
        // TODO Auto-generated method stub
        panierRepository.deleteById(id);
		return null;
    }

	@Override
	public ResponseEntity<Panier> update(Long id, Panier panierItemDetails) {
		// TODO Auto-generated method stub
		return null;
	}
}
