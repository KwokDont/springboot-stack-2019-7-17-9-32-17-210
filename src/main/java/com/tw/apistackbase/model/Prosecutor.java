package com.tw.apistackbase.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Prosecutor {
    @Id
    @GenericGenerator(name = "jpa-uuid", strategy = "uuid")
    @GeneratedValue(generator = "jpa-uuid")
    private String id;

    @Column(nullable = false)
    private String prosecutorName;

    public Prosecutor() {
    }

    public Prosecutor(String id, String prosecutorName, String procuratorateId) {
        this.id = id;
        this.prosecutorName = prosecutorName;
        this.procuratorateId = procuratorateId;
    }

    @Transient
    private String procuratorateId;

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getProsecutorName() {
        return prosecutorName;
    }

    public void setProsecutorName(String prosecutorName) {
        this.prosecutorName = prosecutorName;
    }
}
