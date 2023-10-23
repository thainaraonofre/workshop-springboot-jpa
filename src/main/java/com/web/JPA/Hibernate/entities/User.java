package com.web.JPA.Hibernate.entities;

import java.util.Objects;

public class User {

    private Long id;
    private String name;
    private String email;
    private String phone;
    private String passoword;

    public User (){
    }

    public User(Long id, String name, String email, String phone, String passoword) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.passoword = passoword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassoword() {
        return passoword;
    }

    public void setPassoword(String passoword) {
        this.passoword = passoword;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User user)) return false;
        return Objects.equals(getId(), user.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }



}
