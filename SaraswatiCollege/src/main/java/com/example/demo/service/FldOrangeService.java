package com.example.demo.service;

import com.example.demo.entity.FldOrange;
import com.example.demo.repository.FldOrangeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FldOrangeService {

	@Autowired
	private FldOrangeRepository repository;

	public String save(FldOrange fldOrange) {
		 repository.save(fldOrange);
		return"dashcontain/fld";
	}

	public List<FldOrange> getAll() {
		return repository.findAll();
	}
}
