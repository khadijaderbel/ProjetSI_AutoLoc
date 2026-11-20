package tn.esprit.projet.service;

import tn.esprit.projet.domain.Paiement;

import java.util.List;

public interface IPaiement {
    public Paiement addPaiement(Paiement p);
    public void deletePaiement(Paiement p);
    public List<Paiement> show();
    public Paiement updatePaiement(Paiement p);
    public Paiement getpaiementbyid(Long id);
}
