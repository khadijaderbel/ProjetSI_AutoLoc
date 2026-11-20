package tn.esprit.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet.domain.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {

}
