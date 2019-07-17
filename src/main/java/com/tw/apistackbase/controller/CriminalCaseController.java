package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.CriminalCase;
import com.tw.apistackbase.repository.CriminalCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CriminalCaseController {

    @Autowired
    private CriminalCaseRepository criminalCaseRepository;

    @GetMapping("/criminalcases/{id}")
    public Optional<CriminalCase> findCaseById(@PathVariable int id){
        return criminalCaseRepository.findById(id);
    }

    @GetMapping("/criminalcases")
    public List<CriminalCase> findAllCase(){
        return criminalCaseRepository.findAllByOrderByIncidentTimeDesc();
    }

    @GetMapping("/criminalcases/{name}")
    public List<CriminalCase> findCasesByName(@PathVariable String name){
        return criminalCaseRepository.findAllByCaseName(name);
    }

    @DeleteMapping("/criminalcases/{id}")
    public void deleteCasesById(@PathVariable int id){
        criminalCaseRepository.deleteById(id);
    }
}
