package com.company.calender.eventType;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Notification {
    private boolean isNotification;
    private LocalDate date;
    private LocalDateTime time;
    public LocalDate getDate() {
        return this.date;
    }
    public LocalDateTime getTime() {
        return this.time;
    }
    public void setDate(LocalDate curDate){
        this.date = curDate;
    }
    public void setTime(LocalDateTime curTime){
        this.time = curTime;
    }
    public void setNotification(){
        if(isNotification) {
            // notification will be set
        }
    }
}
