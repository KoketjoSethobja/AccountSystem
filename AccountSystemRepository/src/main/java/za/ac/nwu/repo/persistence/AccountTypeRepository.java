package za.ac.nwu.repo.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import za.ac.nwu.domain.dto.AccountTypeDto;
import za.ac.nwu.domain.persistence.AccountType;

@Repository
public interface AccountTypeRepository extends JpaRepository<AccountType, Long> {

    @Query(value = "SELECT" +
            " ACCOUNT_TYPE_ID," +
            " ACCOUNT_TYPE_NAME," +
            " CREATION_DATE," +
            " MNEMONIC" +
            " FROM " +
            " KOKETJO.DEMO_ACCOUNT_TYPE" +
            " WHERE MNEMONIC = :mnemonic ", nativeQuery = true)
    AccountType getAccountTypeByMnemonicNativeQuery(String mnemonic);

    @Query(value = "SELECT" +
            " at" +
            " FROM" +
            " AccountType at" +
            " WHERE at.mnemonic = :mnemonic")
    AccountType getAccountTypeByMnemonic(String mnemonic);

    @Query(value = "SELECT new za.ac.nwu.domain.dto.AccountTypeDto( " +
            "at.mnemonic," +
            " at.accountTypeName," +
            " at.creationDate )" +
            " FROM" +
            " AccountType at " +
            " WHERE at.mnemonic = :mnemonic")
    AccountTypeDto getAccountTypeDtoByMnemonic(String mnemonic);

    @Query(value = "SELECT "+
            "at "+
            "FROM "+
            "AccountType at "+
            "WHERE at.mnemonic = :mnemonic")
    AccountType getAccountTypeDbEntityByMnemonic(String mnemonic);

/*    @Query(value = "DELETE FROM "+
            "AccountType at "+
            "WHERE at.mnemonic = :mnemonic")
    AccountTypeDto deleteAccountType(String mnemonic);

    @Query(value = "UPDATE AccountType at "+
            "SET at.accountTypeName = :newAccountTypeName, " +
            "at.creationDate = :newCreationDate " +
            "WHERE at.mnemonic = :mnemonic")
    AccountTypeDto updateAccountType(String mnemonic, String newAccountTypeName, LocalDate newCreationDate);*/
    /*@Query(value = "DELETE FROM " +
            "KOKETJO.DEMO_ACCOUNT_TYPE " +
            "WHERE MNEMONIC = :mnemonic", nativeQuery = true)
    AccountTypeDto deleteAccountType(String mnemonic);*/

    /*@Query(value = "UPDATE KOKETJO.DEMO_ACCOUNT_TYPE "+
            "SET "+
            "ACCOUNT_TYPE_NAME = :newAccountTypeName, "+
            "CREATION_DATE = :newCreationDate " +
            "WHERE "+
            "MNEMONIC = :mnemonic", nativeQuery = true)
    AccountTypeDto updateAccountType(String mnemonic, String newAccountTypeName, LocalDate newCreationDate);*/
}
