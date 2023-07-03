package com.ServerSep3.Server.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "match")
public class MatchModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private int userId1;
    @Column
    private String matchUser1;
    @Column
    private int userId2;
    @Column
    private String matchUser2;
    @Column
    private String match;

    public MatchModel(int id, int userId1, String matchUser1, int userId2, String matchUser2, String match) {
        this.id = id;
        this.userId1 = userId1;
        this.matchUser1 = matchUser1;
        this.userId2 = userId2;
        this.matchUser2 = matchUser2;
        this.match = match;
    }

    public MatchModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int Id) {
        this.id = Id;
    }

    public int getUserId1() {
        return userId1;
    }

    public void setUserId1(int userId1) {
        this.userId1 = userId1;
    }

    public String getMatchUser1() {
        return matchUser1;
    }

    public void setMatchUser1(String matchUser1) {
        this.matchUser1 = matchUser1;
    }

    public int getUserId2() {
        return userId2;
    }

    public void setUserId2(int userId2) {
        this.userId2 = userId2;
    }

    public String getMatchUser2() {
        return matchUser2;
    }

    public void setMatchUser2(String matchUser2) {
        this.matchUser2 = matchUser2;
    }

    public String getMatch() {
        return match;
    }

    public void setMatch(String match) {
        this.match = match;
    }
}
