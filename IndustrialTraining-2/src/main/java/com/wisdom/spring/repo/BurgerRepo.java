package com.wisdom.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wisdom.spring.model.Burgers;

public interface BurgerRepo extends JpaRepository<Burgers, Integer> {

}
