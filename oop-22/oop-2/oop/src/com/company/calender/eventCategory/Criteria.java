package com.company.calender.eventCategory;

import com.company.calender.eventType.Event;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface Criteria {
    public List<Event> typeCriteria(ArrayList<Event> eventList, String categoryName);

    public static List<Event> dateCriteria(ArrayList<Event> eventList, LocalDate curDate) {
        return null;
    }
}

