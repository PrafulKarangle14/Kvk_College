package com.example.demo.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Pigeon;
import com.example.demo.repository.PigeonRepository;

@Service
public class PigeonService {

    @Autowired
    private PigeonRepository pigeonRepository;

    // Save or update a Pigeon record
    public String  savePigeon(Pigeon pigeon) {
        pigeonRepository.save(pigeon);
        return "dashcontain/fld";
    }

    // Retrieve all Pigeon records
    public List<Pigeon> getAllPigeons() {
        return pigeonRepository.findAll();
    }

    // Retrieve a specific Pigeon by ID
    public Optional<Pigeon> getPigeonById(Long id) {
        return pigeonRepository.findById(id);
    }

    // Delete a Pigeon record by ID
    public void deletePigeon(Long id) {
        pigeonRepository.deleteById(id);
    }
}
