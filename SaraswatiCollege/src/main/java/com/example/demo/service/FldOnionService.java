package com.example.demo.service;

import com.example.demo.entity.FldOnion;
import com.example.demo.repository.FldOnionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FldOnionService {

    @Autowired
    private FldOnionRepository repository;

    public String save(FldOnion fldOnion) {
       
    repository.save(fldOnion);
    return "dashcontain/fld";
    }

    public List<FldOnion> getAll() {
        return repository.findAll();
    }

    public Optional<FldOnion> getById(Long id) {
        return repository.findById(id);
    }
}
