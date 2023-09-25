package io.github.rycardofarias.msclients.services;

import io.github.rycardofarias.msclients.entities.Client;
import io.github.rycardofarias.msclients.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientServices {

    @Autowired
    private ClientRepository clientRepository;

    public Client save(Client client){
        return clientRepository.save(client);
    }

    public Optional<Client> getByCPF(String cpf){
        return clientRepository.findByCpf(cpf);
    }
}
