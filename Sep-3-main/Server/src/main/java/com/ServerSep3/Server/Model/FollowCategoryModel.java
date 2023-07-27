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
    private UserModel userFollowing;
    @ManyToOne
    @JoinColumn(name = "post_Id")
    private PostModel postFollowed;

    public FollowCategoryModel() {
    }

    public FollowCategoryModel(int id, UserModel userFollowing, PostModel postFollowed) {
        this.id = id;
        this.userFollowing = userFollowing;
        this.postFollowed = postFollowed;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserModel getUserFollowing() {
        return userFollowing;
    }

    public void setUserFollowing(UserModel userFollowing) {
        this.userFollowing = userFollowing;
    }

    public PostModel getPostFollowed() {
        return postFollowed;
    }

    public void setPostFollowed(PostModel postFollowed) {
        this.postFollowed = postFollowed;
    }
}
