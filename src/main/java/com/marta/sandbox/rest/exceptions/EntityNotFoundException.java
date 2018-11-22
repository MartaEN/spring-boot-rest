package com.marta.sandbox.rest.exceptions;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String entityClassName, Long id) {
        super(String.format("Could not find %s with id %d", entityClassName, id));
    }
}
