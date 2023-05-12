package com.alandev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alandev.dslist.entities.Game;
import com.alandev.dslist.entities.GameList;

public interface GameRepository extends JpaRepository<Game, Long>{

}
