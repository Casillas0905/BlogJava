package com.ServerSep3.Server.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "likes")
public class LikeModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "userliking")
    private UserModel userLiking;
    @ManyToOne
    @JoinColumn(name = "postLiked")
    private PostModel postLiked;

    public LikeModel() {
    }

    public LikeModel(int id, UserModel userLiking, PostModel postLiked) {
        this.id = id;
        this.userLiking = userLiking;
        this.postLiked = postLiked;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserModel getUserLiking() {
        return userLiking;
    }

    public void setUserLiking(UserModel userLiking) {
        this.userLiking = userLiking;
    }

    public PostModel getPostLiked() {
        return postLiked;
    }

    public void setPostLiked(PostModel postLiked) {
        this.postLiked = postLiked;
    }
}
