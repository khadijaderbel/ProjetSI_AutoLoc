package tn.esprit.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet.domain.Agence;

public interface AgenceRepository extends JpaRepository <Agence,Long> {
}
