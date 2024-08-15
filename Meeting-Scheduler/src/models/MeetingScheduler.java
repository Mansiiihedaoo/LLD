package models;

import java.time.LocalDateTime;
import java.util.List;

public class MeetingScheduler {
    private RoomManager roomManager;

    public MeetingScheduler() {
        this.roomManager = RoomManager.getInstance();
    }

    public Meeting scheduleMeeting(LocalDateTime startTime, LocalDateTime endTime, int capacity, User organizer, List<User> participants) {
        Room availableRoom = roomManager.findAvailableRoom(capacity, startTime, endTime);

        if (availableRoom == null) {
            System.out.println("No available rooms for the requested time and capacity.");
            return null;
        }

        Meeting meeting = new Meeting(startTime, endTime, availableRoom, organizer);
        availableRoom.addBooking(meeting);
        organizer.getCalendar().addMeeting(meeting);

        for (User participant : participants) {
            if (participant.getCalendar().isAvailable(startTime, endTime)) {
                meeting.addParticipant(participant);
                participant.getCalendar().addMeeting(meeting);
            }
        }

        meeting.notifyAllParticipants("A new meeting has been scheduled.");
        return meeting;
    }

    public void cancelMeeting(Meeting meeting) {
        meeting.getRoom().removeBooking(meeting);
        meeting.getOrganizer().getCalendar().removeMeeting(meeting);

        for (User participant : meeting.getParticipants()) {
            participant.getCalendar().removeMeeting(meeting);
        }

        meeting.notifyAllParticipants("The meeting has been canceled.");
    }

    public void updateMeeting(Meeting meeting, LocalDateTime newStartTime, LocalDateTime newEndTime, int newCapacity) {
        cancelMeeting(meeting);
        scheduleMeeting(newStartTime, newEndTime, newCapacity, meeting.getOrganizer(), meeting.getParticipants());
    }



}
