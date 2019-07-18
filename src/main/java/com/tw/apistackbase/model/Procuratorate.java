package com.tw.apistackbase.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Procuratorate {
    @Id
    @GenericGenerator(name = "jpa-uuid", strategy = "uuid")
    @GeneratedValue(generator = "jpa-uuid")
    private String id;

    @Column(nullable = false, unique = true)
    private String procuratorateName;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "Procuratorate_id",referencedColumnName = "id")
    private List<Prosecutor> prosecutors;

    public Procuratorate() {
    }

    public void setProsecutors(Prosecutor prosecutor){
        prosecutors = new ArrayList<>();
        prosecutors.add(prosecutor);
    }

    public Procuratorate(String procuratorateName) {
        this.procuratorateName = procuratorateName;
    }

    public String getId() { return id; }

    public void setId(String id) { this.id = id; }

    public String getProcuratorateName() {
        return procuratorateName;
    }

    public void setProcuratorateName(String procuratorateName) {
        this.procuratorateName = procuratorateName;
    }

    public List<Prosecutor> getProsecutors() {
        return prosecutors;
    }

    public void setProsecutors(List<Prosecutor> prosecutors) {
        this.prosecutors = prosecutors;
    }
}
