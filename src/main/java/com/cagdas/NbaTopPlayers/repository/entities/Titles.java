package com.cagdas.NbaTopPlayers.repository.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name="tbltitles")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Titles {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    Long id;
    Long playerid;
    Long statisticsid;
    String conferanceleadership;
    String playoffleadership;
    String mvp;
    int allstar;

}
