package com.ServerSep3.Server.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "userInEvents")
public class UsersInEvents {
    @Column
    private int eventId;
    @Column
    private int userid;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    public UsersInEvents(int id, int eventId, int userid) {
        this.id = id;
        this.eventId = eventId;
        this.userid = userid;
    }

    public UsersInEvents() {

    }

    public int getEventId() {
        return eventId;
    }

    public void setEventId(int eventId) {
        this.eventId = eventId;
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
