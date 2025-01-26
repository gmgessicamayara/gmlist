package com.github.gmgessicamayara.gmlist.services;

import com.github.gmgessicamayara.gmlist.dto.GameMinDTO;
import com.github.gmgessicamayara.gmlist.entities.Game;
import com.github.gmgessicamayara.gmlist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll(){

        List<Game> result =  gameRepository.findAll();
        return result.stream().map(item -> new GameMinDTO(item)).toList();
    }

}
