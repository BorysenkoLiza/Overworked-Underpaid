package com.company.calender.calendarView;
import com.company.calender.eventCategory.CriteriaCategory;
import com.company.calender.eventType.Event;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Slot {
    private LocalDate date;
    private int width;
    private int length;
    private DayOfWeek dayOfWeek;
    private List<Event> todayEvents;

    public Slot(LocalDate d, int w, int l){
        date=d;
        width=w;
        length=l;
        dayOfWeek=date.getDayOfWeek();
        todayEvents= CriteriaCategory.dateCriteria(Event.getArrayListEvent(),d);//to add array of events for this date
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

    public List<Event> getTodayEvents() {
        return todayEvents;
    }

    public void setTodayEvents(List<Event> todayEvents) {
        this.todayEvents = todayEvents;
    }
}
