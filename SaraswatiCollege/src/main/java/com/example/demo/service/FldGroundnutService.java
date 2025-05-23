package com.example.demo.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.FldGroundnut;
import com.example.demo.repository.FldGroundnutRepository;

@Service
public class FldGroundnutService {

    @Autowired
    private FldGroundnutRepository repository;

    public FldGroundnut save(FldGroundnut data) {
        return repository.save(data);
    }

    public Optional<FldGroundnut> getById(Long id) {
        return repository.findById(id);
    }

    public List<FldGroundnut> getAll() {
        return repository.findAll();
    }
}
