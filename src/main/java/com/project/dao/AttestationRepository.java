package com.project.dao;

import com.project.domain.Attestation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AttestationRepository extends JpaRepository<Attestation, Integer> {
}
