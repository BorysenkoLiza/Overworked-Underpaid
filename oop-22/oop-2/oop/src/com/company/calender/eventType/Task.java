package com.company.calender.eventType;

import java.io.IOException;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

import com.company.calender.eventCategory.Category;

public class Task extends Event implements Serializable {
    private final ArrayList<Task> arrayList = new ArrayList<>();
    public Task(String curName, LocalDate curDate, Category curCategory, String curDescription, LocalTime curET) {
        super(curName, curDate, curCategory, curDescription);
        this.endTime = curET;
    }
    public Task() {
        super();
    }
    @Override
    public void add() {
        super.enterData();
        Scanner in = new Scanner(System.in);
        int min = in.nextInt(),
                hour = in.nextInt();
        this.endTime = LocalTime.of(hour, min);
        arrayList.add(this);
        in.close();
    }
    public void edit() throws IOException, ClassNotFoundException {
        super.edit();
        Scanner in = new Scanner(System.in);
        int min = in.nextInt(),
                hour = in.nextInt();
        this.endTime = LocalTime.of(hour, min);
        in.close();
    }
    private LocalTime endTime;
    public LocalTime getEndTime() {return this.endTime;}
    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
    @Override
    public void print() {
        super.print();
        System.out.print(this.endTime);
    }
}
