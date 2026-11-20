package tn.esprit.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet.domain.Employe;

public interface EmployeRepository extends JpaRepository<Employe,Long> {
}
