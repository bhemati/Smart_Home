package com.example.sr6.model;

public class dimness {
    int id;
    String UserPreference;
    int Device_id;
    int Layout_id;
    roles role;
    dimnessID dimness_ID;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserPreference() {
        return UserPreference;
    }

    public void setUserPreference(String userPreference) {
        UserPreference = userPreference;
    }

    public int getDevice_id() {
        return Device_id;
    }

    public void setDevice_id(int device_id) {
        Device_id = device_id;
    }

    public int getLayout_id() {
        return Layout_id;
    }

    public void setLayout_id(int layout_id) {
        Layout_id = layout_id;
    }

    public roles getRole() {
        return role;
    }

    public void setRole(roles role) {
        this.role = role;
    }

    public dimnessID getDimness_ID() {
        return dimness_ID;
    }

    public void setDimness_ID(dimnessID dimness_ID) {
        this.dimness_ID = dimness_ID;
    }
}
