package com.tanto.roadover.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.tanto.roadover.enums.DirtType;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Dirt extends Defect {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column
    private DirtType dirtType;

    @JoinColumn(nullable = false)
    @OneToOne
    @JsonIgnore
    private Report report;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public DirtType getDirtType() {
        return dirtType;
    }

    public void setDirtType(DirtType dirtType) {
        this.dirtType = dirtType;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }
}
