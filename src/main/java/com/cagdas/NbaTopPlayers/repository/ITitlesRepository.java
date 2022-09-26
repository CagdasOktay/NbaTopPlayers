package com.cagdas.NbaTopPlayers.repository;


import com.cagdas.NbaTopPlayers.repository.entities.Titles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITitlesRepository extends JpaRepository<Titles,Long> {

}
