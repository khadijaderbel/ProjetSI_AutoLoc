package tn.esprit.projet.service;

import tn.esprit.projet.domain.Client;

import java.util.List;

public interface IClient {
    public Client addclient(Client c);
    public void deleteclient(Client c);
    public List<Client> show();
    public Client updateclient(Client c);
    public Client getclientbyid(Long id);

}
