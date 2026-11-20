package tn.esprit.projet.service;

import tn.esprit.projet.domain.Equipement;

import java.util.List;

public interface IEquipement {
    public Equipement addequipement(Equipement eq);
    public void deleteequipement(Equipement eq);
    public List<Equipement> show();
    public Equipement updateequipement(Equipement eq);
    public Equipement getequipementbyid(Long id);
}
