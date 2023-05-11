package com.listgames.listgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.listgames.listgames.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
    
    
}
