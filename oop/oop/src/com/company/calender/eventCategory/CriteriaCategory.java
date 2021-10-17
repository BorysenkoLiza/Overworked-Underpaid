package com.company.calender.eventCategory;

import com.company.calender.eventType.Event;

import java.util.ArrayList;
import java.util.List;

public class CriteriaCategory implements Criteria { //multiple choice(??)
    @Override
    public List<Event> eventCriteria(ArrayList<Event> eventList, String categoryName) {
        List<Event> chosenEvents = new ArrayList<>();
        for(Event event: eventList) {
            if(event.getCategory().categoryName.equals(categoryName)) {
                chosenEvents.add(event);
            }
        }
        return chosenEvents;
    }

}
