package za.ac.nwu.logic.flow;

import za.ac.nwu.domain.dto.AccountTransactionDto;

import java.util.List;

public interface FetchAccountTransactionFlow {

    List<AccountTransactionDto> getAllAccountTransactions();

    AccountTransactionDto getAccountTransactionById(Long transactionId);

    AccountTransactionDto viewMilesForMember(Long memberId);
}
