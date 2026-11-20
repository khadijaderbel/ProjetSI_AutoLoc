package tn.esprit.projet.service;

import tn.esprit.projet.domain.Contrat;

import java.util.List;

public interface IContrat {
    public Contrat addcontrat(Contrat c);
    public void deletecontrat(Contrat c);
    public List<Contrat> show();
    public Contrat updatecontrat(Contrat c);
    public Contrat getcontratbyid(Long id);
}
