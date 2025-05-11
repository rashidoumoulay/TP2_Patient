package net.rashid.Patient_Demo.Services;

import jakarta.transaction.Transactional;
import net.rashid.Patient_Demo.entities.Consultation;
import net.rashid.Patient_Demo.entities.Medecin;
import net.rashid.Patient_Demo.entities.Patient;
import net.rashid.Patient_Demo.entities.RendezVous;
import net.rashid.Patient_Demo.repositories.ConsultationRepository;
import net.rashid.Patient_Demo.repositories.MedecinRepository;
import net.rashid.Patient_Demo.repositories.PatientRepository;
import net.rashid.Patient_Demo.repositories.RendezVousRepository;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public HospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }

    @Override
    public Patient savePatient(Patient p) {
        return null;
    }

    @Override
    public Medecin saveMedecin(Medecin m) {
        return null;
    }

    @Override
    public RendezVous saveRDV(RendezVous rdv) {
        return null;
    }

    @Override
    public Consultation saveConsultation(Consultation c) {
        return null;
    }
}
