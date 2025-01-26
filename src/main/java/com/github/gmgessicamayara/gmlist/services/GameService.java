package com.github.gmgessicamayara.gmlist.services;

import com.github.gmgessicamayara.gmlist.dto.GameDTO;
import com.github.gmgessicamayara.gmlist.dto.GameMinDTO;
import com.github.gmgessicamayara.gmlist.entities.Game;
import com.github.gmgessicamayara.gmlist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result =  gameRepository.findAll();
        return result.stream().map(item -> new GameMinDTO(item)).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result =  gameRepository.findById(id).get();
        return new GameDTO(result);
    }

}
