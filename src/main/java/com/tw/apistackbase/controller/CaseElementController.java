package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.CaseElement;
import com.tw.apistackbase.repository.CaseElementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CaseElementController {

    @Autowired
    private CaseElementRepository caseElementRepository;

    @GetMapping("/criminalcases/{id}")
    public Optional<CaseElement> findCaseById(@PathVariable String id){
        return caseElementRepository.findById(id);
    }
}
