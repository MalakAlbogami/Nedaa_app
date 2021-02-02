package com.m.nedaaapplication;

import io.realm.RealmObject;

/**
 * Created by malak on 26/03/18.
 */

public class report  extends RealmObject {


    private String Report_ID;
    private String Phone_N;
    private String latitude;
    private String longitude;
    private Boolean type_proplem;
    private String admain_name;

    public String getReport_ID() {
        return Report_ID;
    }

    public void setReport_ID(String report_ID) {
        Report_ID = report_ID;
    }

    public String getPhone_N() {
        return Phone_N;
    }

    public void setPhone_N(String phone_N) {
        Phone_N = phone_N;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public Boolean getType_proplem() {
        return type_proplem;
    }

    public void setType_proplem(Boolean type_proplem) {
        this.type_proplem = type_proplem;
    }

    public String getAdmain_name() {
        return admain_name;
    }

    public void setAdmain_name(String admain_name) {
        this.admain_name = admain_name;
    }

    @Override
    public String toString() {
        return "report{" +
                "Report_ID='" + Report_ID + '\'' +
                ", Phone_N='" + Phone_N + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", type_proplem=" + type_proplem +
                ", admain_name='" + admain_name + '\'' +
                '}';
    }
}
