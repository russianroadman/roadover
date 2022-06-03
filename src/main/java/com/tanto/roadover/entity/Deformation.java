package com.tanto.roadover.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Deformation {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column
    private Double height;

    @Column
    private Double length;


}
