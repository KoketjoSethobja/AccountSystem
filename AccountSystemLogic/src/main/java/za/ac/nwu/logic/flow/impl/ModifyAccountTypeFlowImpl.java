package za.ac.nwu.logic.flow.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import za.ac.nwu.domain.dto.AccountTypeDto;
import za.ac.nwu.logic.flow.ModifyAccountTypeFlow;

import java.time.LocalDate;

@Transactional
@Component
public class ModifyAccountTypeFlowImpl implements ModifyAccountTypeFlow {

    //to be coded
    @Override
    public AccountTypeDto updateAccountType(String mnemonic, String newAccountTypeName, LocalDate newCreationDate) {
        return null;
    }

    //to be coded
    @Override
    public AccountTypeDto deleteAccountType(String mnemonic) {
        return null;
    }
}
