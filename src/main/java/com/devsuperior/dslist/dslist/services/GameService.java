package com.devsuperior.dslist.dslist.services;

import java.util.List;

import com.devsuperior.dslist.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.dslist.entities.Game;
import com.devsuperior.dslist.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        List<GameMinDTO> dto = result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
