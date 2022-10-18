package com.usa.libraryapp.repository.crudrepository;

import com.usa.libraryapp.model.Category;
import com.usa.libraryapp.model.Client;
import org.springframework.data.repository.CrudRepository;

public interface ClientCrudRepository extends CrudRepository<Client, Integer> {
}
