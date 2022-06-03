package com.tanto.roadover.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class RoadWorkFailure {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column
    private Double height;

    @Column
    private Double roadSiteLength;

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

    public Double getRoadSiteLength() {
        return roadSiteLength;
    }

    public void setRoadSiteLength(Double roadSiteLength) {
        this.roadSiteLength = roadSiteLength;
    }
}
