package com.example.demo.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repository.OftSoybeanRepository;

@Service
public class OftSoybeanService {

    @Autowired
    private OftSoybeanRepository repo;

    public String save(OftSoybean soybean) {
    	repo.save(soybean);
       return "dashcontain/oft"; 
    		   
    }

    public List<OftSoybean> getByEmployeeId(Long employeeId) {
        return repo.findByEmployeeId(employeeId);
    }

    public List<OftSoybean> getAll() {
        return repo.findAll();
    }
}
