package com.tw.apistackbase.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Prosecutor {
    @Id
    @GenericGenerator(name = "jpa-uuid", strategy = "uuid")
    @GeneratedValue(generator = "jpa-uuid")
    private String prosecutorId;

    @Column(nullable = false)
    private String prosecutorName;

    @Transient
    @Column(name = "Procuratorate_id")
    private String procuratorateId;

    public String getProsecutorId() {
        return prosecutorId;
    }

    public void setProsecutorId(String prosecutorId) {
        this.prosecutorId = prosecutorId;
    }

    public String getProsecutorName() {
        return prosecutorName;
    }

    public void setProsecutorName(String prosecutorName) {
        this.prosecutorName = prosecutorName;
    }
}
