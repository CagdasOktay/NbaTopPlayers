package com.cagdas.NbaTopPlayers.repository;


import com.cagdas.NbaTopPlayers.repository.entities.Statistics;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStatisticsRepository extends JpaRepository<Statistics,Long> {

}
