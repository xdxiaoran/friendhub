package com.pojo;

public class Message {
    private Integer id;

    private Integer fromld;

    private Integer told;

    private String information;

    private String date;

    private String received;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getFromld() {
        return fromld;
    }

    public void setFromld(Integer fromld) {
        this.fromld = fromld;
    }

    public Integer getTold() {
        return told;
    }

    public void setTold(Integer told) {
        this.told = told;
    }

    public String getInformation() {
        return information;
    }

    public void setInformation(String information) {
        this.information = information == null ? null : information.trim();
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }

    public String getReceived() {
        return received;
    }

    public void setReceived(String received) {
        this.received = received == null ? null : received.trim();
    }
}