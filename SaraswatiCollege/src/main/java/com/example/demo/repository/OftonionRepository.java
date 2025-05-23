package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Oftonion;

public interface OftonionRepository extends JpaRepository<Oftonion, Long> {
    Optional<Oftonion> findByName(String name);
}