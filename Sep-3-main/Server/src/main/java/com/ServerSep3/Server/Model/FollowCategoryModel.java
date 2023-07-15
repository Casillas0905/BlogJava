package com.ServerSep3.Server.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "followsCategory")
public class FollowCategoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel userFollowed;
    @ManyToOne
    @JoinColumn(name = "post_Id")
    private PostModel postFollowing;

    public FollowCategoryModel() {
    }

    public FollowCategoryModel(int id, UserModel userFollowed, PostModel userFollowing) {
        this.id = id;
        this.userFollowed = userFollowed;
        this.postFollowing = userFollowing;
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

    public PostModel getPostFollowing() {
        return postFollowing;
    }

    public void setPostFollowing(PostModel postFollowing) {
        this.postFollowing = postFollowing;
    }
}
