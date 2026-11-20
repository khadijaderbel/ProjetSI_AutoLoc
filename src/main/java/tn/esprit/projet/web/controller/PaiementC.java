package tn.esprit.projet.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.domain.Paiement;
import tn.esprit.projet.service.IPaiement;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Paiement")

public class PaiementC {
    IPaiement paiementservice;

    @GetMapping("/retrieve_all_Paiements")
    public List<Paiement> getpaiement(){
        return paiementservice.show();
    }

    @GetMapping("/retrieve-Paiement/{Paiement-id}")
    public Paiement retrievePaiement(@PathVariable("Paiement-id") Long id){
        return paiementservice.getpaiementbyid(id);

    }

    @PostMapping("/add-Paiement")
    public Paiement addPaiement(@RequestBody Paiement p){
        return  paiementservice.addPaiement(p);
    }
    @PutMapping("/update-Paiement")
    public Paiement updatePaiement(@RequestBody Paiement p){
        return  paiementservice.updatePaiement(p);
    }
    @DeleteMapping("/remove-Paiement/{Paiement}")
    public void removePaiement(@PathVariable("Paiement") Long id){

        Paiement p = paiementservice.getpaiementbyid(id);

        paiementservice.deletePaiement(p);
    }


}
