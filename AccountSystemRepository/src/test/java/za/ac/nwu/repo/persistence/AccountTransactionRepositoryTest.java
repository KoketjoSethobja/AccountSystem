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
import za.ac.nwu.repo.config.RepositoryTestConfig;

import static org.junit.Assert.*;


@RunWith(SpringRunner.class)
@DataJpaTest
@ContextConfiguration(classes = {RepositoryTestConfig.class})
@EnableAutoConfiguration
@ComponentScan(basePackages = "{za.ac.nwu.repo}")
public class AccountTransactionRepositoryTest {

    @Autowired
    AccountTransactionRepository accountTransactionRepository;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void addMilesToMilesAccount() {
        try {
            Integer currency = accountTransactionRepository.addMilesToMilesAccount(300L, 1000001L);
            assertNotNull(currency);
        }catch(Exception e) {
            throw new RuntimeException("Error: ", e);
        }
    }

    @Test
    public void subtractMilesFromMilesAccount() {
        try {
            Integer currency = accountTransactionRepository.subtractMilesFromMilesAccount(300L, 1000001L);
            assertNotNull(currency);
        }catch(Exception e) {
            throw new RuntimeException("Error: ", e);
        }
    }
}