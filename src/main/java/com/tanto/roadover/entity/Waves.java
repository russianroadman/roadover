package com.tanto.roadover.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
public class Waves {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column
    private Double difference;

    @Column
    private Double length;

    @Column
    private Double roadSiteLength;

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

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Double getRoadSiteLength() {
        return roadSiteLength;
    }

    public void setRoadSiteLength(Double roadSiteLength) {
        this.roadSiteLength = roadSiteLength;
    }
}
