package com.cagdas.NbaTopPlayers.controller;

import com.cagdas.NbaTopPlayers.repository.entities.Statistics;
import com.cagdas.NbaTopPlayers.service.StatisticsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/statistics")
@RequiredArgsConstructor

public class StatisticsController {

    private final StatisticsService statisticsService;

    @GetMapping("/save")

    public String saveStatistics(Double averagescore,int totalscore,int assists ){

        Statistics statistics=Statistics.builder()
                .averagescore(averagescore)
                .totalscore(totalscore)
                .assist(assists)
                .build();
        statisticsService.save(statistics);
        return "Statistics registired!";

    }

    @GetMapping("/findall")
    public ResponseEntity<List<Statistics>>findAll(){
        return ResponseEntity.ok(statisticsService.findAll());
    }
}
