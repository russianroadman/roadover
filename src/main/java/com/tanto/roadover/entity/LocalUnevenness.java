package com.tanto.roadover.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class LocalUnevenness {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column
    private Double difference;

    @Column
    private Double area;

    @Column
    private Double roadSiteArea;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Double getDifference() {
        return difference;
    }

    public void setDifference(Double difference) {
        this.difference = difference;
    }

    public Double getArea() {
        return area;
    }

    public void setArea(Double area) {
        this.area = area;
    }

    public Double getRoadSiteArea() {
        return roadSiteArea;
    }

    public void setRoadSiteArea(Double roadSiteArea) {
        this.roadSiteArea = roadSiteArea;
    }
}
