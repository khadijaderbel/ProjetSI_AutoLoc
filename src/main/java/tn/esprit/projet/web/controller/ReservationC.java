package tn.esprit.projet.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.domain.Reservation;
import tn.esprit.projet.service.IReservation;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Reservation")

public class ReservationC {
    IReservation reservationservice;

    @GetMapping("/retrieve_all_Reservations")
    public List<Reservation> getreservation(){
        return reservationservice.show();
    }

    @GetMapping("/retrieve-Reservation/{Reservation-id}")
    public Reservation retrieveReservation(@PathVariable("Reservation-id") Long id){
        return reservationservice.getreservationbyid(id);

    }

    @PostMapping("/add-Reservation")
    public Reservation addReservation(@RequestBody Reservation r){
        return  reservationservice.addReservation(r);
    }
    @PutMapping("/update-Reservation")
    public Reservation updateReservation(@RequestBody Reservation r){
        return  reservationservice.updateReservation(r);
    }
    @DeleteMapping("/remove-Reservation/{Reservation}")
    public void removeReservation(@PathVariable("Reservation") Long id){
        Reservation r = reservationservice.getreservationbyid(id);

        reservationservice.deleteReservation(r);
    }


}
