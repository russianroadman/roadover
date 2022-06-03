package com.tanto.roadover.entity;

import com.tanto.roadover.enums.DirtType;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Dirt {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column
    private DirtType dirtType;


}
