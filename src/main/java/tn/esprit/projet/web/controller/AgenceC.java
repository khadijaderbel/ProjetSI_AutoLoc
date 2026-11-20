package tn.esprit.projet.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.domain.Agence;
import tn.esprit.projet.service.IAgence;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")

public class AgenceC {
    IAgence agenceService;

    @GetMapping("/retrieve_all_agences")
    public List<Agence> getagence(){
        return agenceService.show();
    }

    @GetMapping("/retrieve-agence/{agence-id}")
    public Agence retrieveAgence(@PathVariable("agence-id") Long id){
        return agenceService.getagencebyid(id);
    }

    @PostMapping("/add-agence")
    public Agence addAgence(@RequestBody Agence a){
        return  agenceService.addagence(a);
    }
    @PutMapping("/update-agence")
    public Agence updateAgence(@RequestBody Agence a){
        return  agenceService.updateagence(a);
    }
    @DeleteMapping("/remove-agence/{id}")
    public void removeAgence(@PathVariable("id") Long id){
        Agence a = agenceService.getagencebyid(id);
        agenceService.deleteagence(a);
    }


}
