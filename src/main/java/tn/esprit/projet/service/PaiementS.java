package tn.esprit.projet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projet.domain.Paiement;
import tn.esprit.projet.repository.PaiementRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaiementS implements IPaiement{
    public final PaiementRepository pr;
    @Override
    public Paiement addPaiement(Paiement p) {
        return pr.save(p);
    }

    @Override
    public void deletePaiement(Paiement p) {
        pr.delete(p);
    }

    @Override
    public List<Paiement> show() {
        return pr.findAll();
    }

    @Override
    public Paiement updatePaiement(Paiement p) {
        return pr.save(p);
    }

    @Override
    public Paiement getpaiementbyid(Long id) {
        return pr.findById(id).get();
    }
}
