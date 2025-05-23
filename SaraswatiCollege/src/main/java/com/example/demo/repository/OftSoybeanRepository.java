package com.example.demo.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.service.OftSoybean;

public interface OftSoybeanRepository extends JpaRepository<OftSoybean, Long> {
    List<OftSoybean> findByEmployeeId(Long employeeId);
}
