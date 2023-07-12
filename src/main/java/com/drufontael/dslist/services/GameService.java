package com.drufontael.dslist.services;

import com.drufontael.dslist.dto.GameDTO;
import com.drufontael.dslist.dto.GameMinDTO;
import com.drufontael.dslist.entities.Game;
import com.drufontael.dslist.projections.GameMinProjection;
import com.drufontael.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {
    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result=gameRepository.findById(id).get();
        return new GameDTO(result);
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<Game> result=gameRepository.findAll();
        List<GameMinDTO> dto=result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listId){
        List<GameMinProjection> result=gameRepository.searchByList(listId);
        List<GameMinDTO> dto=result.stream().map(x -> new GameMinDTO(x)).toList();
        return dto;
    }
}
