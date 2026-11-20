package tn.esprit.projet.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.domain.Contrat;
import tn.esprit.projet.service.IContrat;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Contrat")

public class ContratC {
    IContrat contratservice;

    @GetMapping("/retrieve_all_Contrats")
    public List<Contrat> getContrat(){
        return contratservice.show();
    }

    @GetMapping("/retrieve-Contrat/{Contrat-id}")
    public Contrat retrieveContrat(@PathVariable("Contrat-id") Long id){
        return contratservice.getcontratbyid(id);

    }

    @PostMapping("/add-Contrat")
    public Contrat addContrat(@RequestBody Contrat a){
        return contratservice.addcontrat(a);
    }
    @PutMapping("/update-Contrat")
    public Contrat updateContrat(@RequestBody Contrat c){
        return  contratservice.updatecontrat(c);
    }
    @DeleteMapping("/remove-Contrat/{Contrat-id}")
    public void removeContrat(@PathVariable("Contrat-id") Long id){
        Contrat c =contratservice.getcontratbyid(id);
        contratservice.deletecontrat(c);
    }



}
