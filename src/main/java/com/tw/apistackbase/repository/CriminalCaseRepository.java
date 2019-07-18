package com.tw.apistackbase.repository;

import com.tw.apistackbase.model.CriminalCase;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public interface CriminalCaseRepository extends JpaRepository<CriminalCase,Integer> {
    List<CriminalCase> findAllByOrderByIncidentTimeDesc();
    List<CriminalCase> findAllByCaseName(String caseName);
}
