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

import static org.junit.Assert.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
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
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void create() {

        when(translator.create(any(AccountTypeDto.class))).thenReturn(new AccountTypeDto());
        AccountTypeDto result = flow.create(new AccountTypeDto());
        assertNotNull(result);
        verify(translator, atLeastOnce()).create(any(AccountTypeDto.class));
    }
}