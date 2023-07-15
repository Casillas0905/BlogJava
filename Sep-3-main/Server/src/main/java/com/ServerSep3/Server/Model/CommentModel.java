package com.ServerSep3.Server.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "comments")
public class CommentModel {

    @Column
    private String message;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;
    @ManyToOne
    @JoinColumn(name = "post_Id")
    private PostModel post;
    public CommentModel(String message, int id, UserModel user, PostModel post) {
        this.message = message;
        this.id = id;
        this.user = user;
        this.post = post;
    }

    public CommentModel() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public PostModel getPost() {
        return post;
    }

    public void setPost(PostModel post) {
        this.post = post;
    }
}
