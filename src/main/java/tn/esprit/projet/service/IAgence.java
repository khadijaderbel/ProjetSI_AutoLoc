package tn.esprit.projet.service;

import tn.esprit.projet.domain.Agence;

import java.util.List;

public interface IAgence {
    public Agence addagence(Agence a);
    public void deleteagence(Agence a);
    public List<Agence> show();
    public Agence updateagence(Agence a);
    public Agence getagencebyid(Long id);

}
