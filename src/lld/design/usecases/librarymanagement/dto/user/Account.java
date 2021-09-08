package lld.design.usecases.librarymanagement.dto.user;

public class Account {

    private final long accountId;
    private String password;

    public Account(long accountId, String password) {
        this.accountId = accountId;
        this.password = password;
    }

    public long getAccountId() {
        return accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
