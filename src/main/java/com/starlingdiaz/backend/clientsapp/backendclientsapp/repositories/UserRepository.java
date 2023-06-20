package com.starlingdiaz.backend.clientsapp.backendclientsapp.repositories;

import com.starlingdiaz.backend.clientsapp.backendclientsapp.models.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {


}
