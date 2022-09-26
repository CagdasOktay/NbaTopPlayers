package com.cagdas.NbaTopPlayers.service;


import com.cagdas.NbaTopPlayers.repository.IStatisticsRepository;
import com.cagdas.NbaTopPlayers.repository.entities.Statistics;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class StatisticsService {

    private final IStatisticsRepository statisticsRepository;

    public Statistics save(Statistics statistics){
        return statisticsRepository.save(statistics);
    }

    public Statistics update(Statistics statistics){
        return statisticsRepository.save(statistics);
    }

    public void delete(Statistics statistics){
        statisticsRepository.delete(statistics);
    }

    public List<Statistics> findAll(){
        return statisticsRepository.findAll();
    }

}
