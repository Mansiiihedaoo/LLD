package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Meeting {
    private String meetingId;
    private LocalDateTime startTime;
    private LocalDateTime endTime;
    private Room room;
    private User organizer;
    private List<User> participants;

    public Meeting(LocalDateTime startTime, LocalDateTime endTime, Room room, User organizer) {
        this.meetingId = UUID.randomUUID().toString();
        this.startTime = startTime;
        this.endTime = endTime;
        this.room = room;
        this.organizer = organizer;
        this.participants = new ArrayList<>();
    }

    public String getMeetingId() {
        return meetingId;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public Room getRoom() {
        return room;
    }

    public User getOrganizer() {
        return organizer;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void addParticipant(User participant) {
        participants.add(participant);
        Notification notification = new Notification("You've been added to a meeting", participant);
        participant.receiveNotification(notification);
    }

    public void removeParticipant(User participant) {
        participants.remove(participant);
        Notification notification = new Notification("You've been removed from a meeting", participant);
        participant.receiveNotification(notification);
    }

    public void notifyAllParticipants(String message) {
        for (User participant : participants) {
            Notification notification = new Notification(message, participant);
            participant.receiveNotification(notification);
        }
    }

}
