package main.com.codesigne.services;


import jakarta.transaction.Transactional;
import main.com.codesigne.entities.Consultation;
import main.com.codesigne.repositories.ConsultationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ConsultationService {

    ConsultationRepository consultationRepository;

    @Autowired
    public ConsultationService(ConsultationRepository consultationRepository) {
        this.consultationRepository = consultationRepository;
    }

    public Consultation save(Consultation cons){
        return consultationRepository.save(cons);
    }

    public List<Consultation> listAll() {
        return consultationRepository.findAll();
    }

    public Consultation get(Long id) {
        return consultationRepository.findById(id).get();
    }

    public void delete(Long id) {
        consultationRepository.deleteById(id);
    }
}
