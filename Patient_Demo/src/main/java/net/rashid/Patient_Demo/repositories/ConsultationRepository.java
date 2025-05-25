package net.rashid.Patient_Demo.repositories;

import net.rashid.Patient_Demo.entities.Consultation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConsultationRepository extends JpaRepository<Consultation , Long> {
}
