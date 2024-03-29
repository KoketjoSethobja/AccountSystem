package za.ac.nwu.logic.flow.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.domain.dto.AccountTransactionDto;
import za.ac.nwu.domain.persistence.AccountTransaction;
import za.ac.nwu.logic.flow.FetchAccountTransactionFlow;
import za.ac.nwu.translator.AccountTransactionTranslator;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Component
public class FetchAccountTransactionFlowImpl implements FetchAccountTransactionFlow {

    private AccountTransactionTranslator translator;

    public FetchAccountTransactionFlowImpl(AccountTransactionTranslator translator){
        this.translator = translator;
    }

    @Override
    public List<AccountTransactionDto> getAllAccountTransactions() {
        List<AccountTransactionDto> accountTransactionDtos = new ArrayList<>();
        for(AccountTransaction accountTransaction : translator.getAllAccountTransactions()) {
            accountTransactionDtos.add(new AccountTransactionDto(accountTransaction));
        }
        return accountTransactionDtos;
    }

    @Override
    public AccountTransactionDto getAccountTransactionById(Long transactionId) {
        AccountTransaction accountTransaction = translator.getAccountTransactionByPk(transactionId);
        return null != accountTransaction ? new AccountTransactionDto(accountTransaction) : null;
    }

    @Override
    public AccountTransactionDto viewMilesForMember(Long memberId) {
        AccountTransaction accountTransaction = translator.viewMilesForMember(memberId);
        return null != accountTransaction ? new AccountTransactionDto(accountTransaction) : null;
    }
}
