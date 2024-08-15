package models;

import java.util.UUID;

public class User {
    private String userId;
    private String name;
    private String email;
    private Calendar calendar;

    public User(String name, String email) {
        this.userId = UUID.randomUUID().toString();
        this.name = name;
        this.email = email;
        this.calendar = new Calendar();
    }

    public String getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void receiveNotification(Notification notification) {
        // Here we can handle the logic to display or send notification to the user
        System.out.println("Notification for " + name + ": " + notification.getMessage());

    }

}
