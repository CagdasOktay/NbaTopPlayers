package com.cagdas.NbaTopPlayers.controller;


import com.cagdas.NbaTopPlayers.repository.entities.Player;
import com.cagdas.NbaTopPlayers.service.PlayerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/player")
@RequiredArgsConstructor

public class PlayerController {

    private final PlayerService playerService;

    @GetMapping("/save")

    public String savePlayer(String name,String surname, String position, int jerseyno){

        Player player = Player.builder()
                .name(name)
                .surname(surname)
                .position(position)
                .build();
        playerService.save(player);
        return "Player registired!";
    }

    @GetMapping("/findall")

    public ResponseEntity<List<Player>>findAll(){
        return ResponseEntity.ok(playerService.findAll());

    }

}
