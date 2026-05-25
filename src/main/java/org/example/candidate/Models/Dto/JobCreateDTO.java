package org.example.candidate.Models.Dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class JobCreateDTO {

    @NotBlank(message = "Tiêu đề không được để trống")
    private String title;

    @Valid
    @NotNull(message = "Thông tin công ty không được null")
    private CompanyDTO company;

    public JobCreateDTO() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public CompanyDTO getCompany() {
        return company;
    }

    public void setCompany(CompanyDTO company) {
        this.company = company;
    }
}