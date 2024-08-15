package models;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Calendar {
    private String calendarId;
    private List<Meeting> meetings;

    public Calendar() {
        this.calendarId = UUID.randomUUID().toString();
        this.meetings = new ArrayList<>();
    }

    public void addMeeting(Meeting meeting) {
        meetings.add(meeting);
    }

    public void removeMeeting(Meeting meeting) {
        meetings.remove(meeting);
    }

    public boolean isAvailable(LocalDateTime startTime, LocalDateTime endTime) {
        for (Meeting meeting : meetings) {
            if (startTime.isBefore(meeting.getEndTime()) && endTime.isAfter(meeting.getStartTime())) {
                return false;
            }
        }
        return true;
    }
}
