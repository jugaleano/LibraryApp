package com.usa.libraryapp.repository.crudrepository;

import com.usa.libraryapp.model.Message;
import org.springframework.data.repository.CrudRepository;

public interface MessageCrudRepository extends CrudRepository<Message, Integer> {
}
