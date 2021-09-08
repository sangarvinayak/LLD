package lld.design.usecases.librarymanagement.dao;

import lld.design.usecases.librarymanagement.dto.user.User;

public interface UserManager {

    void addUserDetails(User user);

    User fetchUserDetails(String accountId);

    User searchUserByContactNumber(long contactNumber);

    void updateUserDetails(User user);

    void removeUserDetails(String accountId);
}
