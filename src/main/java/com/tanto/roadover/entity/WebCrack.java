package com.tanto.roadover.entity;

import javax.persistence.*;
import java.util.UUID;

/**
 * Сетка трещин
 * */
@Entity
public class WebCrack {

    @Id
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

    public Boolean getHasDirt() {
        return hasDirt;
    }

    public void setHasDirt(Boolean hasDirt) {
        this.hasDirt = hasDirt;
    }

    public Double getCrackWidth() {
        return crackWidth;
    }

    public void setCrackWidth(Double crackWidth) {
        this.crackWidth = crackWidth;
    }
}
