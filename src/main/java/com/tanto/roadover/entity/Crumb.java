package com.tanto.roadover.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Crumb {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column
    private Double depth;

    /**
     * Процент площади от всего участка дороги
     * */
    @Column
    private Double areaPercentage;


}
