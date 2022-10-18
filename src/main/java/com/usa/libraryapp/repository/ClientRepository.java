package com.usa.libraryapp.repository;

import com.usa.libraryapp.model.Client;
import com.usa.libraryapp.repository.crudrepository.ClientCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ClientRepository {
    @Autowired
    private ClientCrudRepository clientCrudRepository;

    public List<Client> getAll() {
        return (List<Client>) clientCrudRepository.findAll();
    }

    public Optional<Client> getById(Integer idClient) {
        return clientCrudRepository.findById(idClient);
    }

    public Client save(Client client) {
        return clientCrudRepository.save(client);
    }

    public void delete(Client client) {
        clientCrudRepository.delete(client);
    }
}
