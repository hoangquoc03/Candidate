package org.example.candidate.Models.Dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class CompanyDTO {

    @NotBlank(message = "Tên công ty không được để trống")
    private String name;

    @Size(
            min = 10,
            max = 13,
            message = "Mã số thuế phải từ 10-13 ký tự"
    )
    private String taxCode;

    public CompanyDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaxCode() {
        return taxCode;
    }

    public void setTaxCode(String taxCode) {
        this.taxCode = taxCode;
    }
}