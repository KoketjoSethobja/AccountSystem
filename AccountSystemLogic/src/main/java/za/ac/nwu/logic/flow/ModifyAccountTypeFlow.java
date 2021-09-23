package za.ac.nwu.logic.flow;

import org.springframework.stereotype.Component;
import za.ac.nwu.domain.dto.AccountTypeDto;

import java.time.LocalDate;

@Component
public interface ModifyAccountTypeFlow {

    AccountTypeDto updateAccountType(String mnemonic, String newAccountTypeName, LocalDate newCreationDate);

    AccountTypeDto deleteAccountType(String mnemonic);

}
