package com.company.calender.eventType;
import com.company.calender.eventCategory.Category;

import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class LongEvent extends Event implements Serializable {
    private TimeSet timeSet;
    private String location;
    private final ArrayList<LongEvent> arrayList = new ArrayList<>();
    public LongEvent() throws IOException {
        super();
        this.timeSet = new TimeSet();
    }
    public LongEvent(String currentName, LocalDate currentDate, Category currentCategory, String currentDescription, String curLocation) throws IOException {
        super(currentName, currentDate, currentCategory, currentDescription);
        this.location = curLocation;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    @Override
    public void add() throws IOException {
        super.enterData();
        Scanner in = new Scanner(System.in);
        this.location = in.nextLine();
        this.timeSet.setTimeSet();
        arrayList.add(this);
        in.close();
    }
    public void edit() throws IOException, ClassNotFoundException {
        super.edit();
        Scanner in = new Scanner(System.in);
        this.location = in.nextLine();
        this.timeSet.setTimeSet();
        in.close();
    }
    public void delete(){
        arrayList.remove(this);
    }

    @Override
    public void print() {
        super.print();
        System.out.print(location);
        this.timeSet.printTimeSet();
    }
}
