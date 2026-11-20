package tn.esprit.projet.service;

import tn.esprit.projet.domain.Employe;
import tn.esprit.projet.web.dto.EmployeDto;

import java.util.List;

public interface IEmploye {
    public EmployeDto addemploye(EmployeDto e);
    public void deleteemploye(Long id);
    public List<EmployeDto> show();
    public EmployeDto updateemploye(EmployeDto e);
    public EmployeDto getemployebyid(Long id);
    public Employe desaffectSserEmploye(Long idEmploye);
    public Employe affecterEmploye(Long idEmploye, Long idAgence);
    public Employe muterEmploye(Long idEmploye, Long idAgence) ;

    }
