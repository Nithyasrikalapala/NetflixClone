package com.example.NetflixClone.repositories;

import com.example.NetflixClone.Models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long> {
}
