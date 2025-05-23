package com.example.demo.repository;

import com.example.demo.entity.Pigeon;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PigeonRepository extends JpaRepository<Pigeon, Long> {
}
