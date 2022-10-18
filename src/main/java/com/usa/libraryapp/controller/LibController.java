package com.usa.libraryapp.controller;

import com.usa.libraryapp.model.Lib;
import com.usa.libraryapp.service.LibService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/Lib")
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class LibController {

    @Autowired
    private LibService libService;

    @GetMapping("/all")
    public List<Lib>getAll() {return libService.getAll();}
    @GetMapping("/{idLib}")
    public Optional<Lib> getById(@PathVariable("idLib")Integer id){ return libService.getById(id);}
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Lib save(@RequestBody Lib lib){
        return libService.save(lib);
    }
    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public Lib update (@RequestBody Lib lib){
        return libService.update(lib);
    }
    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete (@PathVariable("id")Integer id){
        return libService.delete(id);
    }
}
