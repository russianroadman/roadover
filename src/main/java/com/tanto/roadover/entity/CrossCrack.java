package com.tanto.roadover.entity;

import javax.persistence.*;
import java.util.UUID;

/**
 * Поперечные трещины
 * */
@Entity
public class CrossCrack {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column
    private Double width;

    @Column
    private Double length;

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

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }
}
