package com.github.gmgessicamayara.gmlist.controllers;

import com.github.gmgessicamayara.gmlist.dto.GameDTO;
import com.github.gmgessicamayara.gmlist.dto.GameListDTO;
import com.github.gmgessicamayara.gmlist.dto.GameMinDTO;
import com.github.gmgessicamayara.gmlist.services.GameListService;
import com.github.gmgessicamayara.gmlist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll(){
        return gameListService.findAll();
    }


}
