package com.tanto.roadover.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class WebCrack {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column
    private Double area;

    @Column
    private Boolean hasDirt;

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
}
