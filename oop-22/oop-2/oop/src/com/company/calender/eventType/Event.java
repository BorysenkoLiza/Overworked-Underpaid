package com.company.calender.eventType;
import com.company.calender.eventCategory.Category;

import java.io.*;
import java.time.LocalDate;
import java.util.*;
import java.time.chrono.ChronoLocalDate;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Event implements Serializable  {
   // @Serial
    private static final long serialVersionUID = 1L;
    private String name;
    private transient LocalDate date;
    private transient Category category;
    private String description;
    private transient Notification notification;
    private static final ArrayList<Event> arrayList = new ArrayList<>();
    String filename = "event.dat";
    public Event(){
        this.notification = new Notification();//композиция
        this.category = new Category("");
    }
    public Event(String curName, LocalDate curDate, Category curCategory, String curDescription) {
        name = curName;
        date = curDate;
        //category = curCategory;//агрегация
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
    public void enterData(){
        Scanner in = new Scanner(System.in);
        Scanner in1 = new Scanner(System.in);
        this.name = in.nextLine();
        int year = in.nextInt(),
                month = in.nextInt(),
                day = in.nextInt();
        this.date = LocalDate.of(year, month, day);
        this.getCategory().categoryName = in.nextLine();
        this.description = in1.nextLine();
        this.category.choose(this.category.categoryName);
        //ввод названия ивента, категории; даты и описания с клавиатуры
        notification.setNotification();
        in.close();
        in1.close();
    }
    public void add() throws IOException {
        FileOutputStream outputStream = new FileOutputStream(filename);
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        enterData();
        objectOutputStream.writeObject(this);
        arrayList.add(this);
        objectOutputStream.close();
    }
    public void edit() throws IOException, ClassNotFoundException {
        enterData();
    }
    public void deleteEvent(){
        arrayList.remove(this);
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
    public void print() {
        System.out.print(this.name);
        System.out.print(this.date);
        System.out.print(this.category.categoryName);
        System.out.print(this.description);
        if(notification.getIsNotification()){
            //галочка есть
        }
        else {
            //галочки нет
        }

    }
    public static ArrayList<Event> getArrayList() {
        return arrayList;
    }
}

