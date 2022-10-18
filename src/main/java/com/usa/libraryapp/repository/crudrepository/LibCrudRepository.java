package com.usa.libraryapp.repository.crudrepository;

import com.usa.libraryapp.model.Lib;
import org.springframework.data.repository.CrudRepository;

public interface LibCrudRepository extends CrudRepository <Lib, Integer> {

}
