package com.tw.apistackbase.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "case_element")
public class CaseElement {
    @Id
    @GenericGenerator(name = "jpa-uuid", strategy = "uuid")
    @GeneratedValue(generator = "jpa-uuid")
    private String id;

    @Column(nullable = false)
    private String objectiveComponent;

    @Column(nullable = false)
    private String subjectiveComponent;

    public CaseElement() {
    }

    public CaseElement(String objectiveComponent, String subjectiveComponent) {
        this.objectiveComponent = objectiveComponent;
        this.subjectiveComponent = subjectiveComponent;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObjectiveComponent() {
        return objectiveComponent;
    }

    public void setObjectiveComponent(String objectiveComponent) {
        this.objectiveComponent = objectiveComponent;
    }

    public String getSubjectiveComponent() {
        return subjectiveComponent;
    }

    public void setSubjectiveComponent(String subjectiveComponent) {
        this.subjectiveComponent = subjectiveComponent;
    }
}
