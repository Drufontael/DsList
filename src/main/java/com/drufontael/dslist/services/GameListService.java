package com.drufontael.dslist.services;

import com.drufontael.dslist.dto.GameListDTO;
import com.drufontael.dslist.entities.GameList;
import com.drufontael.dslist.repositories.GameListRepository;
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
        List<GameList> result=gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}