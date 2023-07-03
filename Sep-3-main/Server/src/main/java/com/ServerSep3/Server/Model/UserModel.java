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
    private String username;
    @Column
    private String password;
    @Column
    private String email;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String birthday;
    @Column
    private String description;
    @Column
    private int number_of_matches;
    @Column
    private String note;
    @Column
    private String photo1;
    @Column
    private String photo2;
    @Column
    private String photo3;
    @Column
    private String photo4;
    @Column
    private String photo5;
    @Column
    private String gender;
    @Column
    private String preference;
    @Column
    private String horoscope;
    @Column
    private String occupation;
    @Column
    private String city;
    @Column
    private String education;
    @Column
    private boolean drink;

    @Column
    private boolean administrator;

    public UserModel() {
    }

    public UserModel(int id, String username, String password, String email, String firstName, String lastName, String birthday, String description, int number_of_matches, String note, String photo1, String photo2, String photo3, String photo4, String photo5, String gender, String preference, String horoscope, String occupation, String city, String education, boolean drink, boolean administrator) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.description = description;
        this.number_of_matches = number_of_matches;
        this.note = note;
        this.photo1 = photo1;
        this.photo2 = photo2;
        this.photo3 = photo3;
        this.photo4 = photo4;
        this.photo5 = photo5;
        this.gender = gender;
        this.preference = preference;
        this.horoscope = horoscope;
        this.occupation = occupation;
        this.city = city;
        this.education = education;
        this.drink = drink;
        this.administrator = administrator;
    }

    public UserModel(String firstName, String lastName, String birthday, String description) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.description = description;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumber_of_matches() {
        return number_of_matches;
    }

    public void setNumber_of_matches(int number_of_matches) {
        this.number_of_matches = number_of_matches;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public boolean isAdministrator() {
        return administrator;
    }

    public void setAdministrator(boolean administrator) {
        this.administrator = administrator;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhoto1() {
        return photo1;
    }

    public void setPhoto1(String photo1) {
        this.photo1 = photo1;
    }

    public String getPhoto2() {
        return photo2;
    }

    public void setPhoto2(String photo2) {
        this.photo2 = photo2;
    }

    public String getPhoto3() {
        return photo3;
    }

    public void setPhoto3(String photo3) {
        this.photo3 = photo3;
    }

    public String getPhoto4() {
        return photo4;
    }

    public void setPhoto4(String photo4) {
        this.photo4 = photo4;
    }

    public String getPhoto5() {
        return photo5;
    }

    public void setPhoto5(String photo5) {
        this.photo5 = photo5;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public String getHoroscope() {
        return horoscope;
    }

    public void setHoroscope(String horoscope) {
        this.horoscope = horoscope;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education;
    }

    public boolean isDrink() {
        return drink;
    }

    public void setDrink(boolean drink) {
        this.drink = drink;
    }
}
