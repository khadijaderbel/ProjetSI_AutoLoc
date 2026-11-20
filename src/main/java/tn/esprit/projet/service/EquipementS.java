package tn.esprit.projet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projet.domain.Equipement;
import tn.esprit.projet.repository.EquipementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EquipementS implements IEquipement{
    public final EquipementRepository er;

    @Override
    public Equipement addequipement(Equipement eq) {
        return er.save(eq);
    }

    @Override
    public void deleteequipement(Equipement eq) {
        er.delete(eq);
    }

    @Override
    public List<Equipement> show() {
        return er.findAll();
    }

    @Override
    public Equipement updateequipement(Equipement eq) {
        return er.save(eq);
    }

    @Override
    public Equipement getequipementbyid(Long id) {
        return er.findById(id).get();
    }
}
