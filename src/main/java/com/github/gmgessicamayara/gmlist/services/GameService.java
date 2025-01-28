package com.github.gmgessicamayara.gmlist.services;

import com.github.gmgessicamayara.gmlist.dto.GameDTO;
import com.github.gmgessicamayara.gmlist.dto.GameMinDTO;
import com.github.gmgessicamayara.gmlist.entities.Game;
import com.github.gmgessicamayara.gmlist.projections.GameMinProjection;
import com.github.gmgessicamayara.gmlist.repositories.GameRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result =  gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        return gameRepository.findById(id)
                .map(GameDTO::new)
                .orElseThrow(() -> new EntityNotFoundException("Game not found with id: " + id));
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> searchByList(Long id){
        List<GameMinProjection> result =  gameRepository.searchByList(id);
        return result.stream().map(GameMinDTO::new).toList();
    }
}
