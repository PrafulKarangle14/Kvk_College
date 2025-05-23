package com.example.demo.service;

import com.example.demo.entity.FldSoyabean;
import com.example.demo.repository.FldSoyabeanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FldSoyabeanService {

    @Autowired
    private FldSoyabeanRepository fldSoyabeanRepository;

    public String  saveSoyabean(FldSoyabean soyabean) {
        fldSoyabeanRepository.save(soyabean);
        return "dashcontain/FLD";
    }

    public List<FldSoyabean> getAllSoyabeanData() {
        return fldSoyabeanRepository.findAll();
    }
}
