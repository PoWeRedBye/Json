package com.example.maxim_ozarovskiy.json;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

/**
 * Created by Maxim_Ozarovskiy on 07.04.2017.
 */

public class Model extends MainActivity {

    public String name;
    public String surName;
    public String date;
    public Boolean isPushEnabled;
    public Boolean isSeenForOthers;
    public ArrayList friends;

    public Model(String name, String surName, String date, Boolean isPushEnabled, Boolean isSeenForOthers, ArrayList friends) throws JSONException {
        super();
        this.name = name;
        this.surName = surName;
        this.date = date;
        this.isPushEnabled = isPushEnabled;
        this.isSeenForOthers = isSeenForOthers;
        this.friends = friends;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setPushEnabled(Boolean pushEnabled) {
        isPushEnabled = pushEnabled;
    }

    public void setSeenForOthers(Boolean seenForOthers) {
        isSeenForOthers = seenForOthers;
    }

    public void setFriends(ArrayList friends) {
        this.friends = friends;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getDate() {
        return date;
    }

    public Boolean getPushEnabled() {
        return isPushEnabled;
    }

    public Boolean getSeenForOthers() {
        return isSeenForOthers;
    }

    public ArrayList getFriends() {
        return friends;
    }




}
