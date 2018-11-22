package com.marta.sandbox.rest.controllers;

import com.marta.sandbox.rest.entity.Cat;
import com.marta.sandbox.rest.exceptions.EntityNotFoundException;
import com.marta.sandbox.rest.repository.CatRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CatController {

    private final CatRepository repository;

    CatController(CatRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/cats")
    List<Cat> all() {
        return repository.findAll();
    }

    @PostMapping(value = "/cats")
    Cat newCat(@RequestBody Cat newCat) {
        return repository.save(newCat);
    }

    @GetMapping(value = "/cats/{id}")
    Cat one(@PathVariable Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new EntityNotFoundException("cat", id));
    }

    @PutMapping(value = "/cats/{id}")
    Cat replaceCat(@RequestBody Cat newCat, @PathVariable Long id) {
        return repository.findById(id)
                .map(cat -> {
                    cat.setName(newCat.getName());
                    return repository.save(cat);
                })
                .orElseGet(() -> {
                    newCat.setId(id);
                    return repository.save(newCat);
                });
    }

    @DeleteMapping(value = "/cats/{id}")
    void deleteCat(@PathVariable Long id) {
        repository.deleteById(id);
    }

}
