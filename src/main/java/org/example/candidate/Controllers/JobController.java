package org.example.candidate.Controllers;

import jakarta.validation.Valid;
import org.example.candidate.Models.Dto.ApiResponse;
import org.example.candidate.Models.Dto.JobCreateDTO;
import org.example.candidate.Models.Dto.JobSalaryDTO;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    @PostMapping
    public ApiResponse<JobCreateDTO> createJob(
            @Valid @RequestBody JobCreateDTO dto
    ) {

        return new ApiResponse<>(
                "SUCCESS",
                "Create job successfully",
                dto
        );
    }
    @PostMapping("/salary")
    public ApiResponse<JobSalaryDTO> createJob(
            @Valid @RequestBody JobSalaryDTO dto
    ) {

        // MANUAL VALIDATION
        if (dto.getSalaryMin() > dto.getSalaryMax()) {

            throw new IllegalArgumentException(
                    "Lương tối thiểu không được lớn hơn lương tối đa"
            );
        }

        return new ApiResponse<>(
                "SUCCESS",
                "Create job successfully",
                dto
        );
    }
}