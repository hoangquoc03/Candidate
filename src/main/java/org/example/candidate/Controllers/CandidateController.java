package org.example.candidate.Controllers;

import jakarta.validation.Valid;
import org.example.candidate.Models.Dto.ApiResponse;
import org.example.candidate.Models.Dto.CandidateCreateDTO;
import org.example.candidate.Models.Entity.Candidate;
import org.example.candidate.Repositories.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/candidates")
public class CandidateController {

    @Autowired
    private CandidateRepository candidateRepository;

    @PostMapping
    public ApiResponse<Candidate> create(
            @Valid @RequestBody CandidateCreateDTO dto) {

        Candidate candidate = new Candidate();

        candidate.setFullName(dto.getFullName());
        candidate.setEmail(dto.getEmail());
        candidate.setAge(dto.getAge());
        candidate.setYearsOfExperience(dto.getYearsOfExperience());

        Candidate saved = candidateRepository.save(candidate);

        return new ApiResponse<>(
                "SUCCESS",
                "Create candidate successfully",
                saved
        );
    }
}