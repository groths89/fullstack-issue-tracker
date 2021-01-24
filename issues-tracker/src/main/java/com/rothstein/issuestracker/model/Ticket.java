package com.rothstein.issuestracker.model;


import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Ticket {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    public String subjectTitle;
    public String bodyDescription;
    public String createdBy;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
    public Date createdDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "MM-dd-yyyy")
    public Date dueDate;
    public boolean isCompleted;

    public Long getId() {
        return id;
    }

    public Ticket setId(Long id) {
        this.id = id;
        return this;
    }

    public String getSubjectTitle() {
        return subjectTitle;
    }

    public Ticket setSubjectTitle(String subjectTitle) {
        this.subjectTitle = subjectTitle;
        return this;
    }

    public String getBodyDescription() {
        return bodyDescription;
    }

    public Ticket setBodyDescription(String bodyDescription) {
        this.bodyDescription = bodyDescription;
        return this;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public Ticket setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
        return this;
    }

    public Date getDateCreated() {
        return createdDate;
    }

    public Ticket setDateCreated(Date dateCreated) {
        this.createdDate = dateCreated;
        return this;
    }

    public Date getDateDue() {
        return dueDate;
    }

    public Ticket setDateDue(Date dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public boolean isCompleted() {
        return isCompleted;
    }

    public Ticket setCompleted(boolean completed) {
        isCompleted = completed;
        return this;
    }
}
