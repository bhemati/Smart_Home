package com.example.sr12.model;

import java.util.TimeZone;

public class maintaining {
    int id;
    boolean state;
    TimeZone time;
    serviceID service_id;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public TimeZone getTime() {
        return time;
    }

    public void setTime(TimeZone time) {
        this.time = time;
    }

    public serviceID getService_id() {
        return service_id;
    }

    public void setService_id(serviceID service_id) {
        this.service_id = service_id;
    }
}
