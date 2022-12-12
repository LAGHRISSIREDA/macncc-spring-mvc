package main.com.codesigne.services;


import jakarta.transaction.Transactional;
import main.com.codesigne.entities.Patient;
import main.com.codesigne.repositories.PatientRepository;
import main.com.codesigne.security.Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

@Service
@Transactional
public class PatientService {

    final PatientRepository patientRepository;

    @Autowired
    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public void save(Patient patient){
        patientRepository.save(patient);
    }

    public List<Patient> listAll() {
        return patientRepository.findAll();
    }

    public Patient get(Long id) {
        return patientRepository.findById(id).get();
    }

    public void delete(Long id) {
        patientRepository.deleteById(id);
    }

    public Patient patientExists(String email, String password) {
        List<Patient> patients = listAll()
                .stream()
                .filter( agt -> Objects.equals(agt.getEmail(), email) && Hash.verifyPassword(password, agt.getPassword())).collect(Collectors.toList());
        return patients.size() > 0 ? patients.get(0) : null;
    }
}
