package com.company.calender.eventType;

import com.company.calender.eventCategory.Category;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Task extends Event implements Serializable {
    private final ArrayList<Task> arrayList1 = new ArrayList<>();
    private LocalTime endTime;
    public Task(String curName, LocalDate curDate, Category curCategory, String curDescription, LocalTime curET) {
        super(curName, curDate, curCategory, curDescription);
        this.endTime = curET;
    }
    public Task() {
        super();
    }
    public void setEndTime () {
        Scanner in = new Scanner(System.in);
        int min = in.nextInt(),
                hour = in.nextInt();
        //  in.close();
        this.endTime = LocalTime.of(hour, min);
    }
    public void add() {
        //setEndTime();
        arrayList1.add(this);
    }
    public void edit(int index, Task changed){
        arrayList1.set(index, changed);
    }
    public LocalTime getEndTime() {return this.endTime;}
    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }
    @Override
    public void print() {
        super.print();
        System.out.println(this.endTime); //поменяла на лн
    }
    public ArrayList getArrayList1(){
        return arrayList1;
    }
}
