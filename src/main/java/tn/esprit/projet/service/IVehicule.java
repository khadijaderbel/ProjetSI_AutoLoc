package tn.esprit.projet.service;

import tn.esprit.projet.domain.Vehicule;

import java.util.List;

public interface IVehicule {
    public Vehicule addVehicule(Vehicule v);
    public void deleteVehicule(Vehicule v);
    public List<Vehicule> show();
    public Vehicule updateVehicule(Vehicule v);
    public Vehicule getvehiculebyid(Long id);
    public Vehicule affecterVehicule(Long idVehicule, Long idAgence);
    public Vehicule affecterEquipement(Long idVehicule, Long idEquipement);
    public Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement);


    }
