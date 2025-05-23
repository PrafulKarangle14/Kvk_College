package com.example.demo.service;

// FLDTurmericService.java

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.FLDTurmeric;
import com.example.demo.repository.FLDTurmericRepository;

@Service
public class FLDTurmericService {

    private final FLDTurmericRepository repository;

    public FLDTurmericService(FLDTurmericRepository repository) {
        this.repository = repository;
    }

    public List<FLDTurmeric> getAllData() {
        return repository.findAll();
    }

    public void saveData(FLDTurmeric fldTurmeric) {
        repository.save(fldTurmeric);
    }
}
