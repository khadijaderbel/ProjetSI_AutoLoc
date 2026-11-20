package tn.esprit.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet.domain.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement,Long> {
}
