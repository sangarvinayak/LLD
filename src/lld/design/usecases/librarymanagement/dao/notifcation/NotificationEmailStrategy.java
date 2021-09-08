package lld.design.usecases.librarymanagement.dao.notifcation;

public class NotificationEmailStrategy implements NotificationManager {
    @Override
    public void notifyUser(String userId, String message) {
        System.out.println("Notifying user by email");
    }
}
