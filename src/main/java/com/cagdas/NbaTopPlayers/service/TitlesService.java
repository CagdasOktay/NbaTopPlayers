package com.cagdas.NbaTopPlayers.service;


import com.cagdas.NbaTopPlayers.repository.ITitlesRepository;
import com.cagdas.NbaTopPlayers.repository.entities.Titles;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor

public class TitlesService {

        private final ITitlesRepository titlesRepository;

        public Titles save(Titles titles){
            return titlesRepository.save(titles);
        }

        public Titles update(Titles titles){
            return titlesRepository.save(titles);
        }

        public void delete(Titles titles){
            titlesRepository.delete(titles);
        }

        public List<Titles> findAll(){
            return titlesRepository.findAll();
        }

    }

