package lld.design.usecases.librarymanagement.dto.user;

public class User {
    private final long accountId;
    private String name;
    private String email;
    private long contactNumber;

    public User(long accountId, String name, String email, long contactNumber) {
        this.accountId = accountId;
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
    }

    public long getAccountId() {
        return accountId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(long contactNumber) {
        this.contactNumber = contactNumber;
    }

}
