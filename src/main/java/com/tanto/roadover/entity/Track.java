package com.tanto.roadover.entity;

import javax.persistence.*;
import java.util.UUID;

/**
 * Колейность
 * */
@Entity
public class Track {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column
    private Double depth;

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

    public Double getDepth() {
        return depth;
    }

    public void setDepth(Double depth) {
        this.depth = depth;
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
