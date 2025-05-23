package com.example.demo.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Chickpea;
import com.example.demo.repository.ChickpeaRepository;

@Service
public class ChickpeaService {

    @Autowired
    private ChickpeaRepository repository;

    public List<Chickpea> getAll() {
        return repository.findAll();
    }

    public Optional<Chickpea> getById(Long id) {
        return repository.findById(id);
    }
    
    public String  save(Chickpea chickpea) {
        repository.save(chickpea);
        return"dashcontain/fld";
    }
}
