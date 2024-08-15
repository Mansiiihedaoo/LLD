package models;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.UUID;

public class Notification {
    private String notificationId;
    private String message;
    private User recipient;
    private LocalDateTime timestamp;

    public Notification(String message, User recipient) {
        this.notificationId = UUID.randomUUID().toString();
        this.message = message;
        this.recipient = recipient;
        this.timestamp = LocalDateTime.now();
    }

    public String getMessage() {
        return message;
    }

    public User getRecipient() {
        return recipient;
    }

}
