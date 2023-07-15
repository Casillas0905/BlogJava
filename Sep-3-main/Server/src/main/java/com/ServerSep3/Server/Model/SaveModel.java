package com.ServerSep3.Server.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "save")
public class SaveModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;
    @ManyToOne
    @JoinColumn(name = "postSave")
    private PostModel postSave;

    public SaveModel() {
    }

    public SaveModel(int id, UserModel user, PostModel postSave) {
        this.id = id;
        this.user = user;
        this.postSave = postSave;
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

    public PostModel getPostSave() {
        return postSave;
    }

    public void setPostSave(PostModel postSave) {
        this.postSave = postSave;
    }
}
