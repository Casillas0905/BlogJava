package com.ServerSep3.Server.Model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "users")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String firstname;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private String lastName;
    @Column
    private Date birthday;

    @Column
    private boolean administrator;


    public UserModel() {
    }

    public UserModel(int id, String firstname, String password, String email, String lastName, Date birthday, boolean administrator) {
        this.id = id;
        this.firstname = firstname;
        this.password = password;
        this.email = email;
        this.lastName = lastName;
        this.birthday = birthday;
        this.administrator = administrator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public boolean isAdministrator() {
        return administrator;
    }

    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;
    }
}
