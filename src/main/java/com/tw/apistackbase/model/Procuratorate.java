package com.tw.apistackbase.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Procuratorate {
    @Id
    @GenericGenerator(name = "jpa-uuid", strategy = "uuid")
    @GeneratedValue(generator = "jpa-uuid")
    private String procuratorateId;

    @Column(nullable = false, unique = true)
    private String procuratorateName;

    public Procuratorate() {
    }

    public Procuratorate(String procuratorateName) {
        this.procuratorateName = procuratorateName;
    }

    public String getProcuratorateId() {
        return procuratorateId;
    }

    public void setProcuratorateId(String procuratorateId) {
        this.procuratorateId = procuratorateId;
    }

    public String getProcuratorateName() {
        return procuratorateName;
    }

    public void setProcuratorateName(String procuratorateName) {
        this.procuratorateName = procuratorateName;
    }
}
