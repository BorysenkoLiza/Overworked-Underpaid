package com.company.calender.eventCategory;

import com.company.calender.eventType.Event;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CriteriaCategory implements Criteria { //multiple choice(??)
    @Override
    public List<Event> typeCriteria(ArrayList<Event> eventList, String categoryName) {
        List<Event> chosenEvents = new ArrayList<>();
        for(Event event: eventList) {
            if(event.getCategory().categoryName.equals(categoryName)) {
                chosenEvents.add(event);
            }
        }
        return chosenEvents;
    }

    public static List<Event> dateCriteria(ArrayList<Event> eventList, LocalDate curDate) {
     List<Event> dayEvents = new ArrayList<>();
     for (Event event : eventList) {
         if(event.getDate().equals(curDate)) {
             dayEvents.add(event);
         }
     }
     dayEvents.sort(Comparator.comparing(Event::getDate));
     return dayEvents;
    }

}
