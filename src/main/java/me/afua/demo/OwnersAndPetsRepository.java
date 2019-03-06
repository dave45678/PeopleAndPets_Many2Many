package me.afua.demo;

import org.springframework.data.repository.CrudRepository;

public interface OwnersAndPetsRepository
        extends CrudRepository<OwnersAndPets,Long> {
}
