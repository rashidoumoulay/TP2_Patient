package net.rashid.Patient_Demo.repositories;

import net.rashid.Patient_Demo.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PatientRepository extends JpaRepository<Patient , Long> {
    Patient findByNom(String nom);

    void deletePatientById(Long id);
}
