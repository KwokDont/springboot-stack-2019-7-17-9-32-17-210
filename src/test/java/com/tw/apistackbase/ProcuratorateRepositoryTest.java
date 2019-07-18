package com.tw.apistackbase;

import com.tw.apistackbase.model.CriminalCase;
import com.tw.apistackbase.model.Procuratorate;
import com.tw.apistackbase.repository.CriminalCaseRepository;
import com.tw.apistackbase.repository.ProcuratorateRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Date;

@DataJpaTest
@ExtendWith(SpringExtension.class)
public class ProcuratorateRepositoryTest {

    @Autowired
    private ProcuratorateRepository procuratorateRepository;

    @Autowired
    private CriminalCaseRepository criminalCaseRepository;

    @Test
    public void should_return_case_when_find_case_by_id(){
        Procuratorate procuratorate = new Procuratorate();
        procuratorate.setProcuratorateName("liunan");

        Procuratorate procuratorate2 = procuratorateRepository.save(procuratorate);
        Procuratorate procuratorate1 = procuratorateRepository.findById(procuratorate2.getId()).get();

        Assertions.assertEquals("liunan",procuratorate1.getProcuratorateName());
    }

    @Test
    public void should_return_case_with_procuratorate_when_find_cases(){
        Procuratorate procuratorate = new Procuratorate();
        procuratorate.setProcuratorateName("liunan");
        CriminalCase criminalCase = new CriminalCase("liunan",new Date().getTime());
        criminalCase.setProcuratorate(procuratorate);

        CriminalCase criminalCases = criminalCaseRepository.save(criminalCase);
        Procuratorate procuratorate1 = procuratorateRepository.findById(criminalCases.getProcuratorate().getId()).get();

        Assertions.assertEquals("liunan",procuratorate1.getProcuratorateName());
    }
}
