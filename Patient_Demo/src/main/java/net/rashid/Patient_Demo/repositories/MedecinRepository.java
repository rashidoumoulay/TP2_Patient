package net.rashid.Patient_Demo.repositories;

import net.rashid.Patient_Demo.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin , Long> {
    Medecin findByNom(String nom);

}
