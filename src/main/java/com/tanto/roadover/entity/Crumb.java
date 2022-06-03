package com.tanto.roadover.entity;

import javax.persistence.*;
import java.util.UUID;

/**
 * Выкрашивание
 * */
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

    @JoinColumn(nullable = false)
    @OneToOne
    private Report report;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
    }

    public Double getAreaPercentage() {
        return areaPercentage;
    }

    public void setAreaPercentage(Double areaPercentage) {
        this.areaPercentage = areaPercentage;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }
}
