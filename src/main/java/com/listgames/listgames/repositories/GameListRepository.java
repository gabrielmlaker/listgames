package com.listgames.listgames.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.listgames.listgames.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
    
}
