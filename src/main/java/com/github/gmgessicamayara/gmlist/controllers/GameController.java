package com.github.gmgessicamayara.gmlist.controllers;

import com.github.gmgessicamayara.gmlist.dto.GameDTO;
import com.github.gmgessicamayara.gmlist.dto.GameMinDTO;
import com.github.gmgessicamayara.gmlist.entities.Game;
import com.github.gmgessicamayara.gmlist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
        return gameService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        return gameService.findById(id);
    }


}
