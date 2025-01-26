package com.github.gmgessicamayara.gmlist.repositories;

import com.github.gmgessicamayara.gmlist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
