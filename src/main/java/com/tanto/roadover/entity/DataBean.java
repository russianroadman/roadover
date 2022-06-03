package com.tanto.roadover.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "bean")
public class DataBean implements Serializable {

    @Id
    @Column(nullable = false)
    private UUID id;

    @Column(nullable = false, unique = true)
    private String name;

    @OneToMany
    @JoinTable(
        name = "nested_beans",
        joinColumns = @JoinColumn(name = "nested_bean_id"),
        inverseJoinColumns = @JoinColumn(name = "parent_bean_id")
    )
    Set<DataBean> dataBeans;

    public DataBean(){}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<DataBean> getDataBeans() {
        return dataBeans;
    }

    public void setDataBeans(Set<DataBean> dataBeans) {
        this.dataBeans = dataBeans;
    }

}
