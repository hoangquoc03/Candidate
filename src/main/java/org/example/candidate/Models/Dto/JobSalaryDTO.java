package org.example.candidate.Models.Dto;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

public class JobSalaryDTO {

    @NotBlank(message = "Tiêu đề không được để trống")
    private String title;

    @Min(value = 0, message = "Lương tối thiểu phải >= 0")
    private Integer salaryMin;

    @Min(value = 0, message = "Lương tối đa phải >= 0")
    private Integer salaryMax;

    public JobSalaryDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getSalaryMin() {
        return salaryMin;
    }

    public void setSalaryMin(Integer salaryMin) {
        this.salaryMin = salaryMin;
    }

    public Integer getSalaryMax() {
        return salaryMax;
    }

    public void setSalaryMax(Integer salaryMax) {
        this.salaryMax = salaryMax;
    }
}