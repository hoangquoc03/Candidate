package org.example.candidate.Controllers;

import jakarta.validation.Valid;
import org.example.candidate.Models.Dto.ApiResponse;
import org.example.candidate.Models.Dto.JobCreateDTO;
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
}