package tn.esprit.projet.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.domain.Vehicule;
import tn.esprit.projet.service.IVehicule;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Vehicule")

public class VehiculeC {
    IVehicule vehiculeservice;

    @GetMapping("/retrieve_all_Vehicules")
    public List<Vehicule> getvehicule(){
        return vehiculeservice.show();
    }

    @GetMapping("/retrieve-Vehicule/{Vehicule-id}")
    public Vehicule retrieveVehicule(@PathVariable("Vehicule-id") Long id){
        return vehiculeservice.getvehiculebyid(id);

    }

    @PostMapping("/add-Vehicule")
    public Vehicule addVehicule(@RequestBody Vehicule v){
        return  vehiculeservice.addVehicule(v);
    }
    @PutMapping("/update-Vehicule")
    public Vehicule updateVehicule(@RequestBody Vehicule v){
        return  vehiculeservice.updateVehicule(v);
    }
    @DeleteMapping("/remove-Vehicule/{Vehicule}")
    public void removeVehicule(@PathVariable("Vehicule") Long id){
        Vehicule v = vehiculeservice.getvehiculebyid(id);

        vehiculeservice.deleteVehicule(v);
    }
    @PutMapping("/Affecter/{Vehicule-id}/{Agence-id}")
    public  Vehicule affectve(@PathVariable("Vehicule-id") Long idVehicule,
                              @PathVariable("Agence-id") Long idAgence) {
        return vehiculeservice.affecterVehicule(idVehicule,idAgence);


    }
    @PutMapping("/Affectereqve/{Vehicule-id}/{Equipement-id}")
    public Vehicule affecterEquipement(@PathVariable("Vehicule-id") Long idVehicule,@PathVariable("Equipement-id") Long idEquipement){
        return vehiculeservice.affecterEquipement(idVehicule,  idEquipement);
    }
    @PutMapping("/Desaffecte/{Vehicule-id}/{Equipement-id}")
    public Vehicule desaffecte(@PathVariable("Vehicule-id") Long idVehicule,
                              @PathVariable("Equipement-id") Long idEquipement) {
        return vehiculeservice.desaffecterEquipement(idVehicule,idEquipement);

    }




}
