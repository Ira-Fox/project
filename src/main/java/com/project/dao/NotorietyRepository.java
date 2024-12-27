package com.project.dao;

import com.project.domain.Notoriety;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NotorietyRepository extends JpaRepository<Notoriety, Integer> {
}
