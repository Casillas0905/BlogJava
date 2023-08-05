package com.ServerSep3.Server.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "posts")
public class PostModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private UserModel user;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private CategoryModel category;
    @Column
    private String title;
    @Column
    private String description;
    @Column
    private String imageUrl;
    @ManyToOne
    @JoinColumn(name = "location_id")
    private LocationModel location;

    public PostModel() {
    }

    public PostModel(Long id, UserModel user, CategoryModel category, String title, String description, String imageUrl, LocationModel location) {
        this.id = id;
        this.user = user;
        this.category = category;
        this.title = title;
        this.description = description;
        this.imageUrl = imageUrl;
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public UserModel getUser() {
        return user;
    }

    public void setUser(UserModel user) {
        this.user = user;
    }

    public CategoryModel getCategory() {
        return category;
    }

    public void setCategory(CategoryModel category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public LocationModel getLocation() {
        return location;
    }

    public void setLocation(LocationModel location) {
        this.location = location;
    }
}
