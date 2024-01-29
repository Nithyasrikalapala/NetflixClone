package com.example.NetflixClone.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.*;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.security.PrivateKey;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @NotNull
    @NotBlank
    @Size(min=5,max=20,message="full name should be in between 5-20 characters")
    private String FullName;
    @NotNull
    @NotBlank
    @Size(message = "Enter a valid email")
    private String Email;
    @Min(value = 18)
    @Max(value = 70,message ="age should be greater than 18")
    private int age;
    @NotNull
    @NotBlank
    @Size(min = 5,max = 20,message = "password should be in between 5-20 characters ")
    @Pattern(regexp = "^(?=(.[a-z]){1,})(?=(.[A-Z]){1,})(?=(.[0-9]){1,})(?=(.[!@#$%^&*()\\-__+.]){1,}).{1,}$")
    private String password;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
