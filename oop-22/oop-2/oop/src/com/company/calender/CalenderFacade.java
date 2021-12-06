package com.company.calender;

import com.company.calender.eventCategory.Category;
import com.company.calender.eventCategory.CriteriaCategory;
import com.company.calender.calendarView.FacadeForView;
import com.company.calender.eventType.Event;
import com.company.calender.eventType.LongEvent;
import com.company.calender.eventType.Task;

import java.io.*;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;


public class CalenderFacade implements Serializable {
    private final CriteriaCategory category = new CriteriaCategory();
    String filename = "event.dat";

    public CalenderFacade() throws IOException {
    }

    public enum viewType{month,week,day}

    FileOutputStream outputStream = new FileOutputStream(filename);
    ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
    //ArrayList<Event> list = new ArrayList<>();
    public void createEvent() throws IOException {
        Scanner in = new Scanner(System.in);
        int var = in.nextInt();
        switch (var) {
            case (1) -> {
                Event event = new Event();
                event.add();
            }
            case (2) -> {
                LongEvent event1 = new LongEvent();
                event1.add();
            }
            case (3) -> {
                Task task = new Task();
                task.add();
            }
        }
    }

    public void selectEvent() throws IOException, ClassNotFoundException {
        FileInputStream fileInputStream = new FileInputStream(filename);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Event event = (Event) objectInputStream.readObject();
        event.search(event.getName());
        event.edit();
        event.deleteEvent();
    }

    public static void switchView(viewType type){
        FacadeForView facadeForView = new FacadeForView();
        switch (type) {
            case month -> facadeForView.displayMonth();
            case week -> facadeForView.displayWeek();
            case day -> facadeForView.displayDay();
        }
    }

    public void applyFilter(){
        String curCatName = ""; //выбор имени категории
        //category.eventCriteria(list, curCatName);
    }

    public void exit(){
        System.exit(1);
    }
}
