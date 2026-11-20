package tn.esprit.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet.domain.Equipement;

public interface EquipementRepository extends JpaRepository<Equipement,Long> {
}
