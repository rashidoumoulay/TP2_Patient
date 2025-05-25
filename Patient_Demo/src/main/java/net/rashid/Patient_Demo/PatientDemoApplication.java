package net.rashid.Patient_Demo;

import net.rashid.Patient_Demo.entities.*;
import net.rashid.Patient_Demo.repositories.ConsultationRepository;
import net.rashid.Patient_Demo.repositories.MedecinRepository;
import net.rashid.Patient_Demo.repositories.PatientRepository;
import net.rashid.Patient_Demo.repositories.RendezVousRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class PatientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PatientDemoApplication.class, args);
	}

	@Bean
	CommandLineRunner start(PatientRepository patientRepository,
							MedecinRepository medecinRepository ,
							RendezVousRepository rendezVousRepository,
							ConsultationRepository consultationRepository){
		return args -> {
			Stream.of("Aymane","Hasnae")
					.forEach(name->{
								Medecin m = new Medecin();
								m.setNom(name);
								m.setEmail(name+"@gmail.com");
								m.setSpecialite(Math.random()>0.5 ? "Cardio" : "Dentiste");

								medecinRepository.save(m);
							}
					);

			Stream.of("Rashid","Said" , "Najat")
					.forEach(name->{
								Patient p = new Patient();
								p.setNom(name);
								p.setDateNaissance(new Date());
								p.setMalade(false);
								patientRepository.save(p);
							}
							);

			Patient p = patientRepository.findById(1L).orElse(null);
			Patient p2 = patientRepository.findByNom("Rashid");
			System.out.println("la recherche par id :");
			System.out.println(p.toString());
			System.out.println("la recherche par nom :");
			System.out.println(p2.toString());


			Medecin m = medecinRepository.findByNom("Hasnae");
			RendezVous rendezVous = new RendezVous();
			rendezVous.setPatient(p2);
			rendezVous.setMedecin(m);
			rendezVous.setDate(new Date());
			rendezVous.setStatus(StatusRDV.PENDING);
			rendezVousRepository.save(rendezVous);

			RendezVous rendezVous1 = rendezVousRepository.findById(1L).orElse(null);
			Consultation consultation = new Consultation();
			consultation.setDateConsultation(new Date());
			consultation.setRendezVous(rendezVous1);
			consultation.setRapport("Rapport de la consultation ...");
			consultationRepository.save(consultation);

		};
    }
}
