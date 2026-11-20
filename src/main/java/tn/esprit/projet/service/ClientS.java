package tn.esprit.projet.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.projet.domain.Client;
import tn.esprit.projet.repository.ClientRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientS implements IClient {
    private final ClientRepository ac;
    @Override
    public Client addclient(Client c) {
        return ac.save(c);
    }

    @Override
    public void deleteclient(Client c) {
         ac.delete(c);

    }

    @Override
    public List<Client> show() {
        return ac.findAll();
    }

    @Override
    public Client updateclient(Client c) {
        return ac.save(c);
    }

    @Override
    public Client getclientbyid(Long id) {
        return ac.findById(id).get();
    }
}
