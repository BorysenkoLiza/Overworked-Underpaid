package com.company.calender.calendarView;

import com.company.calender.eventType.Event;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;

public class Slot {
    private LocalDate date;
    private int width;
    private int length;
    private DayOfWeek dayOfWeek;
    private ArrayList<Event> todayEvents;

    public Slot(LocalDate d, int w, int l){
        date=d;
        width=w;
        length=l;
        dayOfWeek=date.getDayOfWeek();
        setTodayEvents();//to add array of events for this date
    }
    public void setTodayEvents(){
        //extract events for the date from all events (use the method in com.calendar.Event (Liza's))
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

}
