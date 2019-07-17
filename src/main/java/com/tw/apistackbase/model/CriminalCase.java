package com.tw.apistackbase.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "criminal_case")
public class CriminalCase {

    @Id
    @GenericGenerator(name = "jpa-uuid", strategy = "uuid")
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String caseName;

    @Column(nullable = false)
    private long incidentTime;

    @OneToOne(cascade = CascadeType.ALL)
    private CaseElement caseElement;

    @ManyToOne(cascade = CascadeType.ALL)
    private Procuratorate procuratorate;

    public CriminalCase() {
    }

    public CriminalCase(String caseName, long incidentTime) {
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

    public CaseElement getCaseElement() { return caseElement; }

    public void setCaseElement(CaseElement caseElement) { this.caseElement = caseElement; }

    public Procuratorate getProcuratorate() { return procuratorate; }

    public void setProcuratorate(Procuratorate procuratorate) { this.procuratorate = procuratorate; }
}
