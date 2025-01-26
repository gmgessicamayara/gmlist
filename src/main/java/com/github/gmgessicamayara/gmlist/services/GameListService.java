package com.github.gmgessicamayara.gmlist.services;

import com.github.gmgessicamayara.gmlist.dto.GameListDTO;
import com.github.gmgessicamayara.gmlist.entities.GameList;
import com.github.gmgessicamayara.gmlist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll(){
        List<GameList> result =  gameListRepository.findAll();
        return result.stream().map(item -> new GameListDTO(item)).toList();
    }

}
