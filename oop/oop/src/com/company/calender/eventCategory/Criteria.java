package com.company.calender.eventCategory;

import com.company.calender.eventType.Event;

import java.util.ArrayList;
import java.util.List;

public interface Criteria {
    public List<Event> eventCriteria(ArrayList<Event> eventList, String categoryName);
}

