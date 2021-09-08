package lld.design.usecases.librarymanagement.dao;

public interface AccountManager {

    void createAccount(long accountId, String password);

    Boolean validatePassword(long accountId, String password);

    void updatePassword(long accountId, String password);

    void deleteAccount(long accountId);

}
