package com.tw.apistackbase;

import com.tw.apistackbase.model.CriminalCase;
import com.tw.apistackbase.repository.CriminalCaseRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;
import java.util.List;

@DataJpaTest
@ExtendWith(SpringExtension.class)
class CriminalCaseRepositoryTest {

    @Autowired
    private CriminalCaseRepository criminalCaseRepository;

    @Test
    public void should_return_case_when_find_case_by_id(){
        CriminalCase criminalCase = new CriminalCase();
        criminalCase.setCaseName("liunan");
        criminalCase.setIncidentTime(new Date().getTime());

        criminalCase = criminalCaseRepository.save(criminalCase);
        CriminalCase criminalCase1 = criminalCaseRepository.findById(criminalCase.getId()).get();

        Assertions.assertEquals("liunan",criminalCase1.getCaseName());
    }

    @Test
    public void should_return_case_list_desc_when_find_All_case(){
        CriminalCase criminalCase = new CriminalCase("liunan",new Date().getTime());
        CriminalCase criminalCase2 = new CriminalCase("liu",new Date().getTime()+200);
        CriminalCase criminalCase3 = new CriminalCase("fan",new Date().getTime()+300);

        criminalCaseRepository.save(criminalCase);
        criminalCaseRepository.save(criminalCase3);
        criminalCaseRepository.save(criminalCase2);
        List<CriminalCase> criminalCases = criminalCaseRepository.findAllByOrderByIncidentTimeDesc();
        CriminalCase cases = criminalCases.get(1);

        Assertions.assertEquals("liu",cases.getCaseName());
    }
    
}
