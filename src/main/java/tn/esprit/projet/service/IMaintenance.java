package tn.esprit.projet.service;

import tn.esprit.projet.domain.Maintenance;

import java.util.List;

public interface IMaintenance {
    public Maintenance addMaintenance(Maintenance m);
    public void deleteMaintenance(Maintenance m);
    public List<Maintenance> show();
    public Maintenance updateMaintenance(Maintenance m);
    public Maintenance getmaintenanceByid(Long id);
}
