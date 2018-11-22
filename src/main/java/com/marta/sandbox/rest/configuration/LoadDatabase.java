package com.marta.sandbox.rest.configuration;

import com.marta.sandbox.rest.entity.Cat;
import com.marta.sandbox.rest.entity.Dog;
import com.marta.sandbox.rest.entity.Fox;
import com.marta.sandbox.rest.repository.DogRepository;
import com.marta.sandbox.rest.repository.FoxRepository;
import com.marta.sandbox.rest.repository.CatRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(CatRepository catRepository, DogRepository dogRepository, FoxRepository foxRepository) {
        return args -> {
            log.info(String.format("Preloading %s", catRepository.save(new Cat("Barsik"))));
            log.info(String.format("Preloading %s", catRepository.save(new Cat("Murzik"))));
            log.info(String.format("Preloading %s", dogRepository.save(new Dog("Barbos"))));
            log.info(String.format("Preloading %s", dogRepository.save(new Dog("Sharik"))));
            log.info(String.format("Preloading %s", foxRepository.save(new Fox("Alice"))));
            log.info(String.format("Preloading %s", foxRepository.save(new Fox("Bob"))));
        };
    }
}
