package com.tw.apistackbase;

import com.tw.apistackbase.model.CaseElement;
import com.tw.apistackbase.model.CriminalCase;
import com.tw.apistackbase.repository.CaseElementRepository;
import com.tw.apistackbase.repository.CriminalCaseRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;

@DataJpaTest
@ExtendWith(SpringExtension.class)
public class CaseElementRepositoryTest {

    @Autowired
    private CaseElementRepository caseElementRepository;

    @Autowired
    private CriminalCaseRepository criminalCaseRepository;

    @Test
    public void should_return_case_element_when_given_id(){
        CaseElement caseElement = new CaseElement("xingshi","susong");
        CaseElement caseElement1 = caseElementRepository.save(caseElement);

        CaseElement cases = caseElementRepository.findById(caseElement1.getId()).get();

        Assertions.assertEquals("xingshi",cases.getObjectiveComponent());
    }

    @Test
    public void should_return_case_with_element(){
        CaseElement caseElement = new CaseElement("xingshi","susong");
//        CaseElement caseElement1 = caseElementRepository.save(caseElement);
        CriminalCase criminalCase = new CriminalCase("liunan",new Date().getTime());
        criminalCase.setCaseElement(caseElement);
        CriminalCase criminalCase2 = criminalCaseRepository.save(criminalCase);
        CaseElement cases = caseElementRepository.findById(criminalCaseRepository.findById(criminalCase2.getId()).get().getCaseElement().getId()).get();

        Assertions.assertEquals("xingshi",cases.getObjectiveComponent());
    }

}
