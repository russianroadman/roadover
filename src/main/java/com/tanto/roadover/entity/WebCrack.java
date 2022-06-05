package com.tanto.roadover.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.UUID;

/**
 * Сетка трещин
 * */
@Entity
public class WebCrack extends Defect {

    @Id
    @GeneratedValue
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column
    private Double area;

    @Column
    private Double crackWidth;

    @Column
    private Boolean hasDirt;

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

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getCrackWidth() {
        return crackWidth;
    }

    public void setCrackWidth(Double crackWidth) {
        this.crackWidth = crackWidth;
    }

    public Boolean getHasDirt() {
        return hasDirt;
    }

    public void setHasDirt(Boolean hasDirt) {
        this.hasDirt = hasDirt;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }
}
