package com.github.gmgessicamayara.gmlist.repositories;

import com.github.gmgessicamayara.gmlist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
