package com.example.demo.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Oftonion;
import com.example.demo.repository.OftonionRepository;

@Service
public class OftonionService {

    @Autowired
    private OftonionRepository repo;

    public String saveOftonion(Oftonion o) {
        repo.save(o);
        return"dashcontain/OFT";
    }

    public List<Oftonion> getAll() {
        return repo.findAll();
    }

    public Optional<Oftonion> getByName(String name) {
        return repo.findByName(name);
    }
}
