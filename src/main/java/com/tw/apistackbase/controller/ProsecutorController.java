package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Prosecutor;
import com.tw.apistackbase.repository.ProsecutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProsecutorController {

    @Autowired
    private ProsecutorRepository prosecutorRepository;

    @GetMapping("/criminalcases/{id}")
    public Optional<Prosecutor> findProsecutorById(@PathVariable String id){
        return prosecutorRepository.findById(id);
    }
}
