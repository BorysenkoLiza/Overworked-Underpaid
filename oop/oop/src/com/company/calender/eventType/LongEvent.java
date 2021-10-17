package com.company.calender.eventType;
import com.company.calender.eventCategory.Category;

import java.time.LocalDate;

public class LongEvent extends Event{
    private TimeSet timeSet;
    private String location;
    public LongEvent(String currentName, LocalDate currentDate, Category currentCategory, String currentDescription, String curLocation) {
        super(currentName, currentDate, currentCategory, currentDescription);
        this.timeSet = new TimeSet();
        this.location = curLocation;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public void add(Event a) {
        super.add(a);
    }

    public void edit() {
        super.edit();
    }

    public void delete(int index) {
        super.delete(index);
    }
}
