package com.ServerSep3.Server.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "category")
public class CategoryModel {

    @Column
    private String category;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    public CategoryModel(String category, int id) {
        this.category = category;
        this.id = id;
    }

    public CategoryModel() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
