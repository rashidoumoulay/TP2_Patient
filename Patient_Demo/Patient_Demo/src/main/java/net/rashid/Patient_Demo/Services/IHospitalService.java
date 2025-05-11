package net.rashid.Patient_Demo.Services;

import net.rashid.Patient_Demo.entities.Consultation;
import net.rashid.Patient_Demo.entities.Medecin;
import net.rashid.Patient_Demo.entities.Patient;
import net.rashid.Patient_Demo.entities.RendezVous;

public interface IHospitalService {
    Patient savePatient(Patient p);
    Medecin saveMedecin(Medecin m);
    RendezVous saveRDV(RendezVous rdv);
    Consultation saveConsultation(Consultation c);
}
