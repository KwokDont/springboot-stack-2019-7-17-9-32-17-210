package com.tw.apistackbase.controller;

import com.tw.apistackbase.model.Procuratorate;
import com.tw.apistackbase.repository.ProcuratorateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class ProcuratorateController {

    @Autowired
    private ProcuratorateRepository procuratorateRepository;

    @GetMapping("/criminalcases/{id}")
    public Optional<Procuratorate> findCaseById(@PathVariable String id){
        return procuratorateRepository.findById(id);
    }
}
