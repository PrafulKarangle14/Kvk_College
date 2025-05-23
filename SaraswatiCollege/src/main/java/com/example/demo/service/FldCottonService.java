package com.example.demo.service;

import com.example.demo.entity.FldCotton;
import com.example.demo.entity.Pigeon;
import com.example.demo.repository.FldCottonRepository;
import com.example.demo.repository.PigeonRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FldCottonService {

    @Autowired
    private FldCottonRepository repository;
    
    @Autowired
    private PigeonRepository pigeonRepository;

    public String save(FldCotton cotton) {
    	
		
    	repository.save(cotton);
        return "dashcontain/fld";
    }

    public List<FldCotton> getAllCotton() {
        return repository.findAll();
    }

    public Optional<FldCotton> getCottonById(Long id) {
        return repository.findById(id);
    }

    public void deleteCottonById(Long id) {
        repository.deleteById(id);
    }
}
