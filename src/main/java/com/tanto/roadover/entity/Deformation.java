package com.tanto.roadover.entity;

import javax.persistence.*;
import java.util.UUID;

/**
 * Пластические деформации (сдвиги, наплывы, гребенка)Z
 * */
@Entity
public class Deformation {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column
    private Double height;

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

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
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
