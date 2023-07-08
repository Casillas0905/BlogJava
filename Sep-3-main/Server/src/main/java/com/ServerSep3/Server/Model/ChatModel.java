package com.ServerSep3.Server.Model;

import jakarta.persistence.*;


public class ChatModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int userId1;
    @Column
    private int userId2;

    public ChatModel(int id, int userId1, int userId2) {
        this.id = id;
        this.userId1 = userId1;
        this.userId2 = userId2;
    }

    public ChatModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId1() {
        return userId1;
    }

    public void setUserId1(int userId1) {
        this.userId1 = userId1;
    }

    public int getUserId2() {
        return userId2;
    }

    public void setUserId2(int userId2) {
        this.userId2 = userId2;
    }
}
