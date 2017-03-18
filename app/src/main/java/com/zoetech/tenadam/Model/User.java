package com.zoetech.tenadam.Model;

/**
 * Created by Roger on 3/18/2017.
 */

public class User {

    private String email;
    private long gpsLatitude;
    private long gpsLongitude;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getGpsLatitude() {
        return gpsLatitude;
    }

    public void setGpsLatitude(long gpsLatitude) {
        this.gpsLatitude = gpsLatitude;
    }

    public long getGpsLongitude() {
        return gpsLongitude;
    }

    public void setGpsLongitude(long gpsLongitude) {
        this.gpsLongitude = gpsLongitude;
    }
}
