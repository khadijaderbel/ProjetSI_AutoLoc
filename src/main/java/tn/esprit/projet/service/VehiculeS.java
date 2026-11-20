package tn.esprit.projet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projet.domain.Equipement;
import tn.esprit.projet.domain.Vehicule;
import tn.esprit.projet.domain.Agence;
import tn.esprit.projet.repository.AgenceRepository;
import tn.esprit.projet.repository.EquipementRepository;
import tn.esprit.projet.repository.VehiculeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehiculeS implements IVehicule{
    public final VehiculeRepository vr;
    public final AgenceRepository ar;
    public final EquipementRepository er;

    @Override
    public Vehicule addVehicule(Vehicule v) {
        return vr.save(v);
    }

    @Override
    public void deleteVehicule(Vehicule v) {
        vr.delete(v);
    }

    @Override
    public List<Vehicule> show() {
        return vr.findAll();
    }

    @Override
    public Vehicule updateVehicule(Vehicule v) {
        return vr.save(v);
    }

    @Override
    public Vehicule getvehiculebyid(Long id) {
        return vr.findById(id).get();
    }
    @Override
    public Vehicule affecterVehicule(Long idVehicule, Long idAgence){

    Vehicule v = getvehiculebyid(idVehicule);
        Agence a = ar.findById(idAgence).get();
        v.setAgence(a);
        return vr.save(v);
    }
    @Override
    public Vehicule affecterEquipement(Long idVehicule, Long idEquipement){
        Vehicule v = getvehiculebyid(idVehicule);
        Equipement equipement=er.findById(idEquipement).get();
        v.getEquipement().add(equipement);
    return vr.save(v);
    }
    @Override
    public Vehicule desaffecterEquipement(Long idVehicule, Long idEquipement){
        Vehicule v= getvehiculebyid(idVehicule);
        Equipement equipement= er.findById(idEquipement).get();
        equipement.getVehicules().remove(v);
        return vr.save(v);

    }




}
