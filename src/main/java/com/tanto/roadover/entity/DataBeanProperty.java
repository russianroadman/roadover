package com.tanto.roadover.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Entity
@Table(name = "property", indexes = {
    @Index(name = "idx_databeanproperty_name", columnList = "name")
})
public class DataBeanProperty implements Serializable {

    @Id
    @Column(nullable = false)
    private UUID id;

    @ManyToOne
    @JoinColumn
    private DataBean object;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String value;

    public DataBeanProperty(){}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public DataBean getObject() {
        return object;
    }

    public void setObject(DataBean object) {
        this.object = object;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
