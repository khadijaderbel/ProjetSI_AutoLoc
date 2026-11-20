package tn.esprit.projet.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.domain.Equipement;
import tn.esprit.projet.service.IEquipement;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Equipement")

public class EquipementC {
    IEquipement equipementservice;

    @GetMapping("/retrieve_all_Equipements")
    public List<Equipement> getequipement(){
        return equipementservice.show();
    }

    @GetMapping("/retrieve-Equipement/{Equipement-id}")
    public Equipement retrieveEquipement(@PathVariable("Equipement-id") Long id){
        return equipementservice.getequipementbyid(id);

    }

    @PostMapping("/add-Equipement")
    public Equipement addEquipement(@RequestBody Equipement e){
        return  equipementservice.addequipement(e);
    }
    @PutMapping("/update-Equipement")
    public Equipement updateEquipement(@RequestBody Equipement e){
        return equipementservice.updateequipement(e);
    }
    @DeleteMapping("/remove-Equipement/{Equipement}")
    public void removeEquipement(@PathVariable("Equipement") Long id){
        Equipement e = equipementservice.getequipementbyid(id);
        equipementservice.deleteequipement(e);
    }


}
