package com.iacarvalho.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.iacarvalho.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
