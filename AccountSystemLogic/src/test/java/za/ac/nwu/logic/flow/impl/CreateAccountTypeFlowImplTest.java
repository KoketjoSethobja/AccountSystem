package za.ac.nwu.logic.flow.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import za.ac.nwu.domain.dto.AccountTypeDto;
import za.ac.nwu.translator.AccountTypeTranslator;

import static org.junit.Assert.fail;
import static org.mockito.Mockito.*;


@RunWith(MockitoJUnitRunner.class)
public class CreateAccountTypeFlowImplTest {

    @Mock
    private AccountTypeTranslator translator;

    @InjectMocks
    private CreateAccountTypeFlowImpl flow;

    //mocked the translator
    @Before
    public void setUp() throws Exception {
        newMethod();
    }

    @After
    public void tearDown() throws Exception {
        newMethod();
    }


    @Test
    public void create() {
        doThrow(new RuntimeException()).when(translator).someMethod();
        newMethod();
        verify(translator, times(1)).someMethod();
        verify(translator, never()).create(any(AccountTypeDto.class));

    }

    private void newMethod() {
        try {
            flow.create(new AccountTypeDto());
            fail("Should throw an exception");
        } catch (Exception e) {

        }
    }
}