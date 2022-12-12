package com.codesigne.services;


import com.codesigne.entities.Dossier;
import com.codesigne.repositories.DossierRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class DossierService  {

    DossierRepository dossierRepository;

    @Autowired
    public DossierService(DossierRepository dossierRepository) {
        this.dossierRepository = dossierRepository;
    }

    public Dossier save(Dossier dossier){
        return dossierRepository.save(dossier);
    }

    public List<Dossier> listAll() {
        return (List<Dossier>) dossierRepository.findAll();
    }

    public Dossier get(Long id) {
        return dossierRepository.findById(id).get();
    }

    public void delete(Long id) {
        dossierRepository.deleteById(id);
    }

    public void updateDossierStatus(String status, Long id){
        dossierRepository.updateStatus(status, id);
    }


}
