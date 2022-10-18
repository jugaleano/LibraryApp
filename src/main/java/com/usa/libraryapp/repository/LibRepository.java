package com.usa.libraryapp.repository;

import com.usa.libraryapp.model.Lib;
import com.usa.libraryapp.repository.crudrepository.LibCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class LibRepository {

    @Autowired
    private LibCrudRepository libCrudRepository;

    public List<Lib> getAll(){
        return (List<Lib>) libCrudRepository.findAll();
    }

    public Optional<Lib> getById(Integer id){
        return libCrudRepository.findById(id);
    }

    public Lib save(Lib lib){
        return libCrudRepository.save(lib);
    }

    public void delete (Lib lib){
        libCrudRepository.delete(lib);
    }

}
