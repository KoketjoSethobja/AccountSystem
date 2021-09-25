package za.ac.nwu.translator;

import za.ac.nwu.domain.dto.AccountTypeDto;
import za.ac.nwu.domain.persistence.AccountType;

import java.time.LocalDate;
import java.util.List;

public interface AccountTypeTranslator {

    List<AccountTypeDto> getAllAccountTypes();

    AccountTypeDto create(AccountTypeDto accountType);

    AccountTypeDto save(AccountType accountType);

    AccountTypeDto getAccountTypesByMnemonicNativeQuery(String mnemonic);

    AccountTypeDto getAccountTypeByMnemonic(String mnemonic);

    AccountTypeDto getAccountTypeDtoByMnemonic(String mnemonic);

    AccountTypeDto updateAccountType(String mnemonic, String newAccountTypeName, LocalDate newCreationDate);

    AccountTypeDto deleteAccountType(String mnemonic);

    void someMethod();



/*    AccountType getAccountTypeDbEntityByMnemonic(String mnemonic);

    void delete(AccountType accountType);*/
}
