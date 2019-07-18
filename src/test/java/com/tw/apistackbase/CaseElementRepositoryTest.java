package com.tw.apistackbase;

import com.tw.apistackbase.model.CaseElement;
import com.tw.apistackbase.repository.CaseElementRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@DataJpaTest
@ExtendWith(SpringExtension.class)
public class CaseElementRepositoryTest {

    @Autowired
    private CaseElementRepository caseElementRepository;

    @Test
    public void should_return_case_element_when_given_id(){
        CaseElement caseElement = new CaseElement("xingshi","susong");
        CaseElement caseElement1 = caseElementRepository.save(caseElement);

        CaseElement cases = caseElementRepository.findById(caseElement1.getCaseElementId()).get();

        Assertions.assertEquals("xingshi",cases.getObjectiveComponent());
    }

}
