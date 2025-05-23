package com.example.demo.service;

import com.example.demo.entity.FldGarlic;
import com.example.demo.repository.FldGarlicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FldGarlicService {

    @Autowired
    private FldGarlicRepository repository;

    public List<FldGarlic> getAll() {
        return repository.findAll();
    }

    public FldGarlic save(FldGarlic garlic) {
        return repository.save(garlic);
    }
}
