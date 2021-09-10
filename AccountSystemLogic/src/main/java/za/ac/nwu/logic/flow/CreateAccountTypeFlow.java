package za.ac.nwu.logic.flow;

import za.ac.nwu.domain.dto.AccountTypeDto;

public interface CreateAccountTypeFlow {
    AccountTypeDto create(AccountTypeDto accountType);
}
