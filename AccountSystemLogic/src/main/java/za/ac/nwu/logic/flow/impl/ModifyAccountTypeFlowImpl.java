package za.ac.nwu.logic.flow.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import za.ac.nwu.domain.dto.AccountTypeDto;
import za.ac.nwu.logic.flow.ModifyAccountTypeFlow;
import za.ac.nwu.translator.AccountTypeTranslator;

import java.time.LocalDate;

@Transactional
@Component
public class ModifyAccountTypeFlowImpl implements ModifyAccountTypeFlow {

    private final AccountTypeTranslator accountTypeTranslator;

    @Autowired
    public ModifyAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator){
        this.accountTypeTranslator = accountTypeTranslator;
    }

    //to be coded
    @Override
    public AccountTypeDto updateAccountType(String mnemonic, String newAccountTypeName, LocalDate newCreationDate) {
        return accountTypeTranslator.updateAccountType(mnemonic, newAccountTypeName, newCreationDate);
    }

    //to be coded
    @Override
    public AccountTypeDto deleteAccountType(String mnemonic) {
        return accountTypeTranslator.deleteAccountType(mnemonic);
    }
}
