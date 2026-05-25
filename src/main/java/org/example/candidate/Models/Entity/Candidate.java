package org.example.candidate.Models.Entity;

import jakarta.persistence.*;

@Entity
@Table(name ="candidates")
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String fullName;

    private String email;

    private Integer age;

    private Integer yearsOfExperience;

    public Candidate() {
    }

    public Candidate(Integer id, String fullName, String email,
                     Integer age, Integer yearsOfExperience) {
        this.id = id;
        this.fullName = fullName;
        this.email = email;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getYearsOfExperience() {
        return yearsOfExperience;
    }

    public void setYearsOfExperience(Integer yearsOfExperience) {
        this.yearsOfExperience = yearsOfExperience;
    }
}
