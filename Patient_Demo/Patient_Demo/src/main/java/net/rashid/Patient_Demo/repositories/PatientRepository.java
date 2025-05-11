package net.rashid.Patient_Demo.repositories;

import net.rashid.Patient_Demo.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient , Long> {
    Patient findByNom(String nom);

}
