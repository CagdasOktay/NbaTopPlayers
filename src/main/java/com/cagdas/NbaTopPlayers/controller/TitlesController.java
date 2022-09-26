package com.cagdas.NbaTopPlayers.controller;

import com.cagdas.NbaTopPlayers.repository.entities.Titles;
import com.cagdas.NbaTopPlayers.service.TitlesService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/titles")
@RequiredArgsConstructor

public class TitlesController {

    private final TitlesService titlesService;
    @GetMapping("/save")
    public String saveTitles(String conferanceleadership,String playoffleadership,String mvp,int allstar){
        Titles titles = Titles.builder()
                .conferanceleadership(conferanceleadership)
                .playoffleadership(playoffleadership)
                .mvp(mvp)
                .allstar(allstar)
                .build();
        titlesService.save(titles);
        return "New title added!";

    }
    @GetMapping("/findall")
    public ResponseEntity<List<Titles>>findAll(){
        return ResponseEntity.ok(titlesService.findAll());
    }
}
