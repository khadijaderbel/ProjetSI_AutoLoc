package tn.esprit.projet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projet.domain.Employe;
import tn.esprit.projet.domain.Agence;
import tn.esprit.projet.repository.AgenceRepository;
import tn.esprit.projet.repository.EmployeRepository;
import tn.esprit.projet.web.Mapper.EmployeMapper;
import tn.esprit.projet.web.dto.EmployeDto;

import javax.swing.border.EmptyBorder;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeS implements IEmploye{
    private final EmployeRepository er;
    public final AgenceRepository ar;
    private final EmployeMapper mapper;


    @Override
    public EmployeDto addemploye(EmployeDto dto) {
        Employe e = mapper.toEntity(dto);
        return mapper.toDto(er.save(e));
    }

    @Override
    public void deleteemploye(Long id) {

        er.deleteById(id);
    }

    @Override
    public List<EmployeDto> show() {
        List<Employe> e=er.findAll();
        return e.stream()
                .map(mapper::toDto)
                .toList();
    }

    @Override
    public EmployeDto updateemploye(EmployeDto dto) {
        Employe e = mapper.toEntity(dto);
        return mapper.toDto(er.save(e));
    }

    @Override
    public EmployeDto getemployebyid(Long id) {
        Employe e=er.findById(id).orElseThrow(null);
        return mapper.toDto(e);
    }
    @Override
    public Employe desaffectSserEmploye(Long idEmploye){
        Employe e = er.findById(idEmploye).get();
        e.setAgence(null);
        return   er.save(e);
    }
@Override
    public Employe affecterEmploye(Long idEmploye, Long idAgence){
        Employe e = er.findById(idEmploye).get();
        Agence a = ar.findById(idAgence).get();
        e.setAgence(a);
        return er.save(e);
    }


    @Override

    public Employe muterEmploye(Long idEmploye, Long idAgence) {
        desaffectSserEmploye(idEmploye);
        return affecterEmploye(idEmploye, idAgence);
    }
}




