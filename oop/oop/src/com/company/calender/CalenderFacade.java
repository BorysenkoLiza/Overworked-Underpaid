package com.company.calender;

import com.company.calender.eventCategory.CriteriaCategory;
import com.company.calender.calendarView.FacadeForView;
import com.company.calender.eventType.Event;

import java.util.ArrayList;

public class CalenderFacade {
    private CriteriaCategory category = new CriteriaCategory();

    enum viewType{month,week,day};

    ArrayList<Event> list = new ArrayList<>();
    public void createEvent(){
        //выбор типа
        Event event = new Event();
        list.add(event);
    };
    public void selectEvent(){
        Event event = new Event();
        event.search(event.getName());
        event.edit();
        event.deleteEvent(event.getName());
    };
    public void switchView(viewType type){
        FacadeForView facadeForView = new FacadeForView();
        switch (type) {
            case month -> facadeForView.displayMonth();
            case week -> facadeForView.displayWeek();
            case day -> facadeForView.displayDay();
        }
    };
    public void applyFilter(){
        String curCatName = ""; //выбор имени категории
        category.eventCriteria(list, curCatName);
    };
    public void exit(){
        System.exit(1);
    };
}
