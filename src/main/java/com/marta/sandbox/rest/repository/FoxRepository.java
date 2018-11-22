package com.marta.sandbox.rest.repository;

import com.marta.sandbox.rest.entity.Fox;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@RepositoryRestResource(collectionResourceRel = "foxes", path = "foxes")
public interface FoxRepository extends PagingAndSortingRepository<Fox, Long> {
}
