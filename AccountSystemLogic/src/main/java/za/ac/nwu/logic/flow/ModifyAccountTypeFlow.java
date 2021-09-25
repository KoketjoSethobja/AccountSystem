package za.ac.nwu.logic.flow;

import za.ac.nwu.domain.dto.AccountTypeDto;

import java.time.LocalDate;

public interface ModifyAccountTypeFlow {

    AccountTypeDto updateAccountType(String mnemonic, String newAccountTypeName, LocalDate newCreationDate);

    AccountTypeDto deleteAccountType(String mnemonic);

}
