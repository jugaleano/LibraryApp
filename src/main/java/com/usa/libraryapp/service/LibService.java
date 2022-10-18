package com.usa.libraryapp.service;

import com.usa.libraryapp.model.Lib;
import com.usa.libraryapp.repository.LibRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LibService {

    @Autowired
    private LibRepository libRepository;

    public List<Lib> getAll(){
        return libRepository.getAll();
    }
    public Optional<Lib> getById(Integer id){
        return libRepository.getById(id);
    }
    public Lib save (Lib lib){
        if (lib.getId()==null){
            return libRepository.save(lib);
        }else{
            Optional<Lib> optional=libRepository.getById(lib.getId());
            if(optional.isEmpty()){
                return libRepository.save(lib);
            }else{
                return lib;
            }
        }
    }
    public Lib update (Lib lib){
        if (lib.getId()!=null){
            Optional<Lib> optional=libRepository.getById(lib.getId());
            if(!optional.isEmpty()){
                if(lib.getName()!=null){
                    optional.get().setName(lib.getName());
                }
                if(lib.getTarget()!=null){
                    optional.get().setTarget(lib.getTarget());
                }
                if(lib.getCapacity()!=null){
                    optional.get().setCapacity(lib.getCapacity());
                }
                if(lib.getDescription()!=null){
                    optional.get().setDescription(lib.getDescription());
                }
                libRepository.save(optional.get());
                return optional.get();
            }else{
                return lib;
            }
        }else{
            return lib;
        }
    }
    public boolean delete(Integer id){
         Boolean aBoolean=getById(id).map(lib -> {
            libRepository.delete(lib);
            return true;
                }).orElse(false);
         return aBoolean;
    }
}




































