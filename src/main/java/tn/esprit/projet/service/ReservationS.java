package tn.esprit.projet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projet.domain.Reservation;
import tn.esprit.projet.repository.ReservationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReservationS implements IReservation {
    public final ReservationRepository rr;

    @Override
    public Reservation addReservation(Reservation r) {
        return rr.save(r);
    }

    @Override
    public void deleteReservation(Reservation r) {
        rr.delete(r);
    }

    @Override
    public List<Reservation> show() {
        return rr.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation r) {
        return rr.save(r);
    }

    @Override
    public Reservation getreservationbyid(Long id) {
        return rr.findById(id).get();
    }
}
