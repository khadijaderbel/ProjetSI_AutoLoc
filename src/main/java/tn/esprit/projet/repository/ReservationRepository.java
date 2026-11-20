package tn.esprit.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.projet.domain.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
