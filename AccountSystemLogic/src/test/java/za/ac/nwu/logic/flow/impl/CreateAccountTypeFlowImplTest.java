package za.ac.nwu.logic.flow.impl;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import za.ac.nwu.translator.AccountTypeTranslator;


@RunWith(MockitoJUnitRunner.class)
public class CreateAccountTypeFlowImplTest {

    @Mock
    private AccountTypeTranslator translator;

    @InjectMocks
    private CreateAccountTypeFlowImpl flow;

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void create() {
        /*AccountTypeDto accountTypeDto = new AccountTypeDto();
        AccountTypeDto accountTypeDto2 = new AccountTypeDto("mnemonic2", "Name2", LocalDate.parse("2020-01-01"));
        when(translator.create(eq(accountTypeDto))).thenReturn(accountTypeDto2);
        AccountTypeDto result = flow.create(accountTypeDto);
        verify(translator, times(1)).create(eq(accountTypeDto));
        verify(translator, times(1)).create(eq(accountTypeDto2));*/
    }
}