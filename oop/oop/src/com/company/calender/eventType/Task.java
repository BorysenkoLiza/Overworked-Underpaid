package com.company.calender.eventType;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.company.calender.eventCategory.Category;

public class Task extends Event{
    public Task(String curName, LocalDate curDate, Category curCategory, String curDescription, LocalDateTime curET) {
        super(curName, curDate, curCategory, curDescription);
        this.endTime = curET;
    }
    private LocalDateTime endTime;
    public LocalDateTime getEndTime() {return this.endTime;}
    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
}
