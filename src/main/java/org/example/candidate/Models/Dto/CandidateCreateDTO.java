package org.example.candidate.Models.Dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CandidateCreateDTO {
    @NotBlank(message = "Full name không được để trống")
    @Size(min =5,max = 50, message = "Full name phải từ 5 đến 50 ký tự ")
    private String fullName;
    @NotBlank(message = "Email không được để trống")
    @Email(message = "Email không đúng định dạng")
    private String email;

    @Min(value = 18,
            message = "Ứng viên phải từ 18 tuổi")
    private Integer age;

    @Min(value = 0,
            message = "Số năm kinh nghiệm phải >= 0")
    private Integer yearsOfExperience;

    public CandidateCreateDTO() {
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
