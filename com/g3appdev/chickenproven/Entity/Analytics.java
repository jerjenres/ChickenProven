package com.g3appdev.chickenproven.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;


@Entity
public class Analytics {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int AnalyticsID;

    
    private int ClassID;
    private String attendance_summary;
    private String Alerts;

    public Analytics() {
        super();
    }

    public Analytics(int analyticsID, int classID, String attendance_summary, String alerts) {
        AnalyticsID = analyticsID;
        ClassID = classID;
        this.attendance_summary = attendance_summary;
        Alerts = alerts;
    }

    public int getAnalyticsID() {
        return AnalyticsID;
    }

    public void setAnalyticsID(int analyticsID) {
        AnalyticsID = analyticsID;
    }

    public int getClassID() {
        return ClassID;
    }

    public void setClassID(int classID) {
        ClassID = classID;
    }

    public String getAttendanceSummary() {
        return attendance_summary;
    }

    public void setAttendanceSummary(String attendance_summary) {
        this.attendance_summary = attendance_summary;
    }

    public String getAlerts() {
        return Alerts;
    }

    public void setAlerts(String alerts) {
        Alerts = alerts;
    }
}
