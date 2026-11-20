package tn.esprit.projet.web.Mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import tn.esprit.projet.web.dto.EmployeDto;
import tn.esprit.projet.domain.Employe;

@Mapper(componentModel = "spring")
public interface EmployeMapper {
    @Mapping(target = "nom",source = "sujet")
    @Mapping(target = "prenom",source = "sujet1")
    EmployeDto toDto(Employe employe);
    Employe toEntity(EmployeDto employeDto);


}
