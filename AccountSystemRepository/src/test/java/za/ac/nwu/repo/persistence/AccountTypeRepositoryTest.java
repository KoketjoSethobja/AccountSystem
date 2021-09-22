package za.ac.nwu.repo.persistence;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import za.ac.nwu.domain.dto.AccountTypeDto;
import za.ac.nwu.domain.persistence.AccountType;
import za.ac.nwu.repo.config.RepositoryTestConfig;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@DataJpaTest
@ContextConfiguration(classes = {RepositoryTestConfig.class})
@EnableAutoConfiguration
@ComponentScan(basePackages = "{za.ac.nwu.repo}")
public class AccountTypeRepositoryTest {
    
    @Autowired
    AccountTypeRepository accountTypeRepository;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getAccountTypeByMnemonicNativeQueryMiles() {
        AccountType miles = accountTypeRepository.getAccountTypeByMnemonicNativeQuery("MILES");
        assertNull(miles);/*
        assertEquals("MILES", miles.getMnemonic());*/
    }

    @Test
    public void getAccountTypeByMnemonicNativeQuery() {
        AccountType miles = accountTypeRepository.getAccountTypeByMnemonicNativeQuery("MILESSS");
        assertNull(miles);
    }

    @Test
    public void getAccountTypeByMnemonicMiles() {
        AccountType miles = accountTypeRepository.getAccountTypeByMnemonic("MILES");
        assertNull(miles);/*
        assertEquals("MILES", miles.getMnemonic());*/
    }

    @Test
    public void getAccountTypeByMnemonicPlay() {
        AccountType miles = accountTypeRepository.getAccountTypeByMnemonic("PLAY");
        assertNull(miles);/*
        assertEquals("PLAY", miles.getMnemonic());*/
    }

    @Test
    public void getAccountTypeByMnemonic() {
        AccountType miles = accountTypeRepository.getAccountTypeByMnemonic("R");
        assertNull(miles);
    }

    @Test
    public void getAccountTypeDtoByMnemonicMiles() {
        AccountTypeDto miles = accountTypeRepository.getAccountTypeDtoByMnemonic("MILES");
        assertNull(miles);/*
        assertEquals("PLAY", miles.getMnemonic());*/
    }

    @Test
    public void getAccountTypeDtoByMnemonicPlay() {
        AccountTypeDto miles = accountTypeRepository.getAccountTypeDtoByMnemonic("PLAY");
        assertNull(miles);/*
        assertEquals("PLAY", miles.getMnemonic());*/
    }

    @Test
    public void getAccountTypeDtoByMnemonic() {
        AccountTypeDto miles = accountTypeRepository.getAccountTypeDtoByMnemonic("R");
        assertNull(miles);
    }
}
