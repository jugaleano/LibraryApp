package com.usa.libraryapp.repository;

import com.usa.libraryapp.model.Category;
import com.usa.libraryapp.repository.crudrepository.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CategoryRepository {

    @Autowired
    private CategoryCrudRepository categoryCrudRepository;

    public List<Category> getAll() {
        return (List<Category>) categoryCrudRepository.findAll();
    }

    public Optional<Category> getById(Integer id) {
        return categoryCrudRepository.findById(id);
    }

    public Category save(Category category) {
        return categoryCrudRepository.save(category);
    }

    public void delete(Category category) {
        categoryCrudRepository.delete(category);
    }
}

