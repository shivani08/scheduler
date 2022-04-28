package com.ual.document.Domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "REMINDER")
public class Reminder implements Serializable {

    private String ID;
    private String NAME;
    private String DESCRIPTION;
    private Date DATETIME;
    private String STATUS;



    @Id
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getDESCRIPTION() {
        return DESCRIPTION;
    }

    public void setDESCRIPTION(String DESCRIPTION) {
        this.DESCRIPTION = DESCRIPTION;
    }

    public Date getDATETIME() {
        return DATETIME;
    }
    public void setDATETIME(Date DATETIME) {
        this.DATETIME = DATETIME;
    }

    public String getSTATUS() {
        return STATUS;
    }

    public void setSTATUS(String STATUS) {
        this.STATUS = STATUS;
    }

    public Reminder(String ID, String NAME, String DESCRIPTION, Date DATETIME, String STATUS) {
        super();
        this.ID = ID;
        this.NAME = NAME;
        this.DESCRIPTION = DESCRIPTION;
        this.DATETIME = DATETIME;
        this.STATUS = STATUS;
    }

    public Reminder() {

    }

    @Override
    public String toString() {
        return "Reminder{" +
                "ID='" + ID + '\'' +
                ", NAME='" + NAME + '\'' +
                ", DESCRIPTION='" + DESCRIPTION + '\'' +
                ", DATETIME='" + DATETIME + '\'' +
                ", STATUS='" + STATUS + '\'' +
                '}';
    }


}
