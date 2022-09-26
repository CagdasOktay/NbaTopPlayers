package com.cagdas.NbaTopPlayers.service;


import com.cagdas.NbaTopPlayers.repository.IPlayerRepository;
import com.cagdas.NbaTopPlayers.repository.entities.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class PlayerService {

    private final IPlayerRepository playerRepository;

    public Player save (Player player){
        return playerRepository.save(player);
    }

    public Player update (Player player){
        return playerRepository.save(player);
    }

    public void delete (Player player){
         playerRepository.delete(player);
    }

    public List<Player> findAll(){
        return playerRepository.findAll();
    }


}
