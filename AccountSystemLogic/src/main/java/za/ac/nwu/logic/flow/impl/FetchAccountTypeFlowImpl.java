package za.ac.nwu.logic.flow.impl;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import za.ac.nwu.domain.dto.AccountTypeDto;
import za.ac.nwu.logic.flow.FetchAccountTypeFlow;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class FetchAccountTypeFlowImpl implements FetchAccountTypeFlow {

//    private final AccountTypeTranslator accountTypeTranslator;

    @Override
    public List<AccountTypeDto> getAllAccountTypes(){
        List<AccountTypeDto> accountTypeDtos = new ArrayList<>();
        accountTypeDtos.add(new AccountTypeDto("MILES", "Miles", LocalDate.now()));
        return accountTypeDtos;
    }
//    @Autowired
//    public FetchAccountTypeFlowImpl(AccountTypeTranslator accountTypeTranslator){
//        this.accountTypeTranslator = accountTypeTranslator;
//    }
//
//    @Override
//    public List<AccountTypeDto> getAllAccountTypes() {
//        return accountTypeTranslator.getAllAccountTypes();
//    }
}
