package com.tanto.roadover.entity;

import javax.persistence.*;
import java.util.UUID;

/**
 * Износ поверхности покрытия
 * */
@Entity
public class Wear {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column
    private Double value;

    @JoinColumn(nullable = false)
    @OneToOne
    private Report report;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Report getReport() {
        return report;
    }

    public void setReport(Report report) {
        this.report = report;
    }
}
