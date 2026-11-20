package tn.esprit.projet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projet.domain.Contrat;
import tn.esprit.projet.repository.ContratRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ContratS implements IContrat{
    public final ContratRepository cr;
    @Override
    public Contrat addcontrat(Contrat c) {
        return cr.save(c);
    }

    @Override
    public void deletecontrat(Contrat c) {
        cr.delete(c);
    }

    @Override
    public List<Contrat> show() {
        return cr.findAll();
    }

    @Override
    public Contrat updatecontrat(Contrat c) {
        return cr.save(c);
    }

    @Override
    public Contrat getcontratbyid(Long id) {
        return cr.findById(id).get();
    }
}
