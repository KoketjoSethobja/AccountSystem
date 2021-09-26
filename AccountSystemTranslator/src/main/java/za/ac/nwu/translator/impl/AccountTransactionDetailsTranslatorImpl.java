package za.ac.nwu.translator.impl;

import org.springframework.stereotype.Component;
import za.ac.nwu.domain.persistence.AccountTransactionDetails;
import za.ac.nwu.repo.persistence.AccountTransactionDetailsRepository;
import za.ac.nwu.translator.AccountTransactionDetailsTranslator;

@Component
public class AccountTransactionDetailsTranslatorImpl implements AccountTransactionDetailsTranslator {

    private AccountTransactionDetailsRepository repo;

    public AccountTransactionDetailsTranslatorImpl(AccountTransactionDetailsRepository accountTransactionDetails){
        this.repo = accountTransactionDetails;
    }

    @Override
    public AccountTransactionDetails save(AccountTransactionDetails accountTransactionDetails){
        try{
            return repo.save(accountTransactionDetails);
        } catch (Exception e) {
            throw new RuntimeException("Unable to save to the DB", e);
        }

    }
}
