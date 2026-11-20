package tn.esprit.projet.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.domain.Maintenance;
import tn.esprit.projet.service.IMaintenance;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Maintenance")

public class MaintenanceC {
    IMaintenance maintenanceservice;

    @GetMapping("/retrieve_all_Maintenances")
    public List<Maintenance> getmaintenance(){
        return maintenanceservice.show();
    }

    @GetMapping("/retrieve-Maintenance/{Maintenance-id}")
    public Maintenance retrieveMaintenance(@PathVariable("Maintenance-id") Long id){
        return maintenanceservice.getmaintenanceByid(id);

    }

    @PostMapping("/add-Maintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance m){
        return  maintenanceservice.addMaintenance(m);
    }
    @PutMapping("/update-Maintenance")
    public Maintenance updateMaintenance(@RequestBody Maintenance m){
        return  maintenanceservice.updateMaintenance(m);
    }
    @DeleteMapping("/remove-Maintenance/{Maintenance}")
    public void removeMaintenance(@PathVariable("Maintenance") Long id){
        Maintenance m = maintenanceservice.getmaintenanceByid(id);
        maintenanceservice.deleteMaintenance(m);
    }



}
