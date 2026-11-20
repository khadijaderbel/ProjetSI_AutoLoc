package tn.esprit.projet.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.domain.Employe;
import tn.esprit.projet.service.IEmploye;
import tn.esprit.projet.web.dto.EmployeDto;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Employe")

public class EmployeC {
    IEmploye employeservice;

    @GetMapping("/retrieve_all_Employes")
    public List<EmployeDto> getEmploye(){
        return employeservice.show();
    }
    @GetMapping("/retrieve-Employe/{Employe-id}")
    public EmployeDto retrieveEmploye(@PathVariable("Employe-id") Long id){
        return employeservice.getemployebyid(id);
    }
    @PostMapping("/add-Employe")
    public EmployeDto addEmploye(@RequestBody EmployeDto dto){
        return employeservice.addemploye(dto);
    }
    @PutMapping("/update-Employe")
    public EmployeDto updateEmploye(@RequestBody EmployeDto dto){
        return employeservice.updateemploye(dto);
    }
    @DeleteMapping("/remove-Employe/{Employe-id}")
    public void removeEmploye(@PathVariable("Employe-id") Long id){
        employeservice.deleteemploye(id);
    }
    @PutMapping("/desactiver/{Employe-id}")
    public Employe desEmploye(@PathVariable("Employe-id") Long idEmploye){
        return employeservice.desaffectSserEmploye(idEmploye);
    }
    @PutMapping("/ajouter/{Employe-id}/{Agence-id}")
    public Employe affectEmploye(@PathVariable("Employe-id") Long idEmploye,
                              @PathVariable("Agence-id") Long idAgence) {
        return employeservice.affecterEmploye(idEmploye,idAgence);

    }


    @PutMapping("/muter/{Employe-id}/{Agence-id}")
    public Employe muterEmploye(@PathVariable("Employe-id") Long idEmploye,
                                @PathVariable("Agence-id") Long idAgence) {
        return employeservice.muterEmploye(idEmploye, idAgence);
    }




    }
