package com.tanto.roadover.entity;

import javax.persistence.*;
import java.util.UUID;

@Entity
public class Pothole {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column
    private Double depth;

    @Column
    private Double area;

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

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }
}
