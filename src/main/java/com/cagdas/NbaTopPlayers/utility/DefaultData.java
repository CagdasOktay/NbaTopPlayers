package com.cagdas.NbaTopPlayers.utility;

import com.cagdas.NbaTopPlayers.repository.IPlayerRepository;
import com.cagdas.NbaTopPlayers.repository.entities.Player;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@RequiredArgsConstructor
@Component

public class DefaultData {

    private final IPlayerRepository playerRepository;
    @PostConstruct
    private void create() {
        Player player = Player.builder()
                .name("Michael")
                .surname("Jordan")
                .position("SF-SG")
                .jerseyno(23)
                .build();
        Player player1 = Player.builder()
                .name("Kobe")
                .surname("Bryant")
                .position("SF-SG")
                .jerseyno(24)
                .build();
        Player player2 = Player.builder()
                .name("Allen")
                .surname("Iverson")
                .position("PG-SG")
                .jerseyno(3)
                .build();
        playerRepository.saveAll(Arrays.asList(player, player1, player2));


    }
}
