
import models.*;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Mansi", "mansi@example.com");
        User user2 = new User("John Doe", "john@example.com");
        User user3 = new User("Jane Doe", "jane@example.com");

        RoomManager roomManager = RoomManager.getInstance();
        roomManager.addRoom(new Room(10));
        roomManager.addRoom(new Room(20));

        MeetingScheduler scheduler = new MeetingScheduler();

        List<User> participants = new ArrayList<>();
        participants.add(user2);
        participants.add(user3);

        LocalDateTime startTime = LocalDateTime.of(2024, 8, 15, 10, 0);
        LocalDateTime endTime = LocalDateTime.of(2024, 8, 15, 11, 0);

        Meeting meeting = scheduler.scheduleMeeting(startTime, endTime, 10, user1, participants);

        // Demonstrate canceling the meeting
        if (meeting != null) {
            scheduler.cancelMeeting(meeting);
        }
    }
}