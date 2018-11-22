package com.marta.sandbox.rest.repository;

import com.marta.sandbox.rest.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat, Long> {
}
