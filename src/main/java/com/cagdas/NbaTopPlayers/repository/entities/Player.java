package com.cagdas.NbaTopPlayers.repository.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Table(name="tblplayer")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Player {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    Long id;
    String name;
    String surname;
    String position;
    int jerseyno;

}
