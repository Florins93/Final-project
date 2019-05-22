package com.sci.finalproject.demo.model;

import org.springframework.data.repository.CrudRepository;

public interface ProfileRepository extends CrudRepository<User, Integer> {
}