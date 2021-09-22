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

import java.time.LocalDate;

import static org.junit.Assert.*;
import static org.mockito.AdditionalAnswers.returnsFirstArg;
import static org.mockito.Mockito.*;


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
        when(translator.create(any(AccountTypeDto.class))).then(returnsFirstArg());
        AccountTypeDto result = flow.create(new AccountTypeDto());
        assertNotNull(result);
        assertEquals(LocalDate.now(), result.getCreationDate());
        verify(translator, times(1)).create(any(AccountTypeDto.class));
    }
}