package com.marta.sandbox.rest.repository;

import com.marta.sandbox.rest.entity.Dog;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "dogs", path = "dogs")
public interface DogRepository extends CrudRepository<Dog, Long> {
    List<Dog> findByName(@Param("name") String name);
}
