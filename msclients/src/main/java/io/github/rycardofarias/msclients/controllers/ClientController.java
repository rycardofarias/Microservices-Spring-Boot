package io.github.rycardofarias.msclients.controllers;

import io.github.rycardofarias.msclients.entities.Client;
import io.github.rycardofarias.msclients.representation.ClientSaveRequest;
import io.github.rycardofarias.msclients.services.ClientServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("api/clients/v1")
public class ClientController {

    @Autowired
    private ClientServices clientService;

    @GetMapping
    public String status(){
        return "ok";
    }

    @PostMapping
    public ResponseEntity save(@RequestBody ClientSaveRequest request){
        var client = request.toModel();
        clientService.save(client);
        URI headerLocation = ServletUriComponentsBuilder
                .fromCurrentRequest()
                .query("cpf={cpf}")
                .buildAndExpand(client.getCpf())
                .toUri();

        return ResponseEntity.created(headerLocation).build();
    }

    @GetMapping(params = "cpf")
    public ResponseEntity<Optional<Client>> getByCpf(String cpf){
        var client = clientService.getByCPF(cpf);
        if(client.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(client);
    }
}
