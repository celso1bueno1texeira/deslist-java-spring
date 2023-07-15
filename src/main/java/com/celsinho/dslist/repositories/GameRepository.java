package com.celsinho.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.celsinho.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
