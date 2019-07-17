package com.tw.apistackbase.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "criminal_case")
public class CriminalCase {

    @Id
    @GeneratedValue
    private int id;
    private String caseName;
    private long incidentTime;

    public CriminalCase() {
    }

    public CriminalCase(int id, String caseName, long incidentTime) {
        this.id = id;
        this.caseName = caseName;
        this.incidentTime = incidentTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public long getIncidentTime() {
        return incidentTime;
    }

    public void setIncidentTime(long incidentTime) {
        this.incidentTime = incidentTime;
    }
}
