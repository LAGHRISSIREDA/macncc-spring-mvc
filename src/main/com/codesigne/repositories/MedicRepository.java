package main.com.codesigne.repositories;


import main.com.codesigne.entities.Medication;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicRepository extends JpaRepository<Medication, Long> {
}
