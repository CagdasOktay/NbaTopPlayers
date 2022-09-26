package com.cagdas.NbaTopPlayers.repository.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Table(name="tblstatistics")
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder

public class Statistics {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)

    Long id;
    Double averagescore;
    int totalscore;
    int assist;
}
