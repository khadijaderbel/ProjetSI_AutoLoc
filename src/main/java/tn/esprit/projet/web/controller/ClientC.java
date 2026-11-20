package tn.esprit.projet.web.controller;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.projet.domain.Client;
import tn.esprit.projet.service.IClient;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Client")

public class ClientC {
    IClient clientService;

    @GetMapping("/retrieve_all_Clients")
    public List<Client> getclient(){
        return clientService.show();
    }

    @GetMapping("/retrieve-Client/{Client-id}")
    public Client retrieveClient(@PathVariable("Client-id") Long id){
        return clientService.getclientbyid(id);

    }

    @PostMapping("/add-Client")
    public Client addClient(@RequestBody Client c){
        return  clientService.addclient(c);
    }
    @PutMapping("/update-Client")
    public Client updateClient(@RequestBody Client c){
        return  clientService.updateclient(c);
    }
    @DeleteMapping("/remove-Client/{Client-id}")
    public void removeClient(@PathVariable("Client-id") Long id){
        Client c =clientService.getclientbyid(id);
        clientService.deleteclient(c);
    }


}
