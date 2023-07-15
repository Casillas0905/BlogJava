package com.ServerSep3.Server.Model;

public class SearchParameters {
    private String title;
    private String location;
    private String category;
    private int userId;

    public SearchParameters(String title, String location, String category, int userId) {
        this.title = title;
        this.location = location;
        this.category = category;
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
