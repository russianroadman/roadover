package com.tanto.roadover.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class FreezeLayer {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column
    private Double width;

    /**
     * Снежный накат - плотный
     * */
    @Column
    private Boolean dense;

    /**
     * % площади дефекта от общей площади покрытия
     * */
    @Column
    private Double percentage;

    @JoinColumn(nullable = false)
    @OneToOne
    private Report report;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public Boolean getDense() {
        return dense;
    }

    public void setDense(Boolean dense) {
        this.dense = dense;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }
}
