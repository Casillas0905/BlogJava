package com.ServerSep3.Server.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "followsUser")
public class FollowUserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "userfollowed")
    private UserModel userFollowed;
    @ManyToOne
    @JoinColumn(name = "userFollowing")
    private UserModel userFollowing;

    public FollowUserModel(int id, UserModel userFollowed, UserModel userFollowing) {
        this.id = id;
        this.userFollowed = userFollowed;
        this.userFollowing = userFollowing;
    }

    public FollowUserModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserModel getUserFollowed() {
        return userFollowed;
    }

    public void setUserFollowed(UserModel userFollowed) {
        this.userFollowed = userFollowed;
    }

    public UserModel getUserFollowing() {
        return userFollowing;
    }

    public void setUserFollowing(UserModel userFollowing) {
        this.userFollowing = userFollowing;
    }
}
