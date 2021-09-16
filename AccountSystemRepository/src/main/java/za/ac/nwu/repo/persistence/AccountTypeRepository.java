package za.ac.nwu.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.domain.dto.AccountTypeDto;
import za.ac.nwu.domain.persistence.AccountType;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {

    //NATIVE query
    @Query(value = "SELECT" +
            "       ACCOUNT_TYPE_ID," +
            "       ACCOUNT_TYPE_NAME," +
            "       CREATION_DATE," +
            "       MNEMONIC" +
            "   FROM " +
            "       KOKETJO.DEMO_ACCOUNT_TYPE " +
            "   WHERE MNEMONIC = :mnemonic ", nativeQuery = true)
    AccountType getAccountTypesByMnemonicNativeQuery(String mnemonic);

    //HSQL(hibernate SQL)
    @Query(value = "SELECT" +
            "        at" +
            "   FROM " +
            "       AccountType at" +
            "   WHERE at.mnemonic = :mnemonic ")
    AccountType getAccountTypeByMnemonic(String mnemonic);

    //recommended
    @Query(value = "SELECT new za.ac.nwu.domain.dto.AccountTypeDto(" +
            "       at.mnemonic," +
            "       at.accountTypeName," +
            "       at.creationDate )" +
            "   FROM " +
            "       AccountType at " +
            "   WHERE at.mnemonic = :mnemonic ")
    AccountTypeDto getAccountTypeDtoByMnemonic(String mnemonic);
}
