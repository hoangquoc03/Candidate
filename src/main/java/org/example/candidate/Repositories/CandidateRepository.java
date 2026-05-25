package org.example.candidate.Repositories;


import org.example.candidate.Models.Entity.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidateRepository
        extends JpaRepository<Candidate, Integer> {
}