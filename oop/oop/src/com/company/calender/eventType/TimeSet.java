package com.company.calender.eventType;
import java.time.LocalDateTime;

public class TimeSet {
    boolean isTimeSet;
    LocalDateTime startTime;
    LocalDateTime endTime;
    public LocalDateTime getStartTime() {
        return startTime;
    }
    public LocalDateTime getEndTime() {
        return endTime;
    }
    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    public void setTimeSet() {
        //выбор и установка даты
        startTime = LocalDateTime.of(2020, 1, 3, 12, 0, 0);
        endTime = LocalDateTime.of(2020, 1, 3, 12, 0, 0);
    }
}
