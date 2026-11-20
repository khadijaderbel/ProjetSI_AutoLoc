package tn.esprit.projet.service;

import tn.esprit.projet.domain.Reservation;

import java.util.List;

public interface IReservation {
    public Reservation addReservation(Reservation r);
    public void deleteReservation(Reservation r);
    public List<Reservation> show();
    public Reservation updateReservation(Reservation r);
    public Reservation getreservationbyid(Long id);
}
