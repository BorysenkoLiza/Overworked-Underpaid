package com.company.calender.eventType;
import com.company.calender.eventCategory.Category;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.time.chrono.ChronoLocalDate;

public class Event {
    private String name;
    private LocalDate date;
    private Category category;
    private String description;
    private Notification notification;
    private ArrayList<Event> arrayList = new ArrayList<>();
    public Event(){
        this.notification = new Notification();//композиция
    }
    public Event(String curName, LocalDate curDate, Category curCategory, String curDescription) {
        name = curName;
        date = curDate;
        category = curCategory;//агрегация
        description = curDescription;
    }
    public String getName()
    {
        return name;
    }
    public LocalDate getDate()
    {
        return date;
    }
    public Category getCategory()
    {
        return this.category;
    }
    public String getDescription()
    {
        return description;
    }
    public String setName(String currentName) {
        this.name = currentName;
        return this.name;
    }
    public LocalDate setDate(LocalDate currentDate) {
        this.date = currentDate;
        return this.date;
    }
    public Category setCategory(Category currentCategory) {
        this.category = currentCategory;
        return this.category;
    }
    public String setDescription(String currentDesc) {
        this.description = currentDesc;
        return this.description;
    }
    public void add(Event a) {
        String categoryName = "";
        //ввод названия ивента, категории; даты и описания с клавиатуры
        this.category.choose(categoryName);
        //setDate(5);
        setName("");
        setDescription("");
        notification.setNotification();
        arrayList.add(a);
    }
    public void edit() {
        //вывод информации об ивенте
        //возможность изменить любое из представленных полей
    }
    public void delete(int index) {
        arrayList.remove(index);
    }
    public void deleteEvent(String currentName){
    }
    public Event search(String currentName) {
        Map<String, Event> eventMap = new HashMap<>();
        for(Event event: arrayList) {
            eventMap.put(event.getName(), event);
        }
        return eventMap.get(currentName);
    }
    public List<Event> dateSearch(LocalDate date) {
        List<Event> dateEvents = new ArrayList<>();
        for(Event event: arrayList) {
            if(event.date == date) {
                dateEvents.add(event);
            }
        }
        return  dateEvents;
    }
    public ArrayList<Event> getArrayList() {
        return arrayList;
    }
}

