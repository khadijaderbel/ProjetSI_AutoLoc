package tn.esprit.projet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projet.domain.Agence;
import tn.esprit.projet.repository.AgenceRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AgenceS implements IAgence{
    private final AgenceRepository ar;

    @Override
    public Agence addagence(Agence a) {
        return ar.save(a);
    }

    @Override
    public List<Agence> show() {
        return ar.findAll();
    }

    @Override
    public Agence updateagence(Agence a) {
        return ar.save(a);
    }

    @Override
    public Agence getagencebyid(Long id) {
        return ar.findById(id).get();
    }

    @Override
    public void deleteagence(Agence a) {
         ar.delete(a);

    }



}
