package com.company.calender.calendarView;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class WeekView implements View {
    private int year;
    private Month month;
    private LocalDate monday;
    private Slot[] slots; // think about this

    public WeekView(LocalDate curDay, int w, int l){
        while (curDay.getDayOfWeek()!=DayOfWeek.MONDAY){  //maybe add option to begin with SUNDAY later
            curDay.minusDays(1);
        }
        monday = curDay;
        month=curDay.getMonth();
        year=curDay.getYear();
        for(int i=0; i<7; i++){
            slots[i]=new Slot(curDay,w,l);
            curDay=curDay.plusDays(1);
        }
    }

    private Slot[] DefaultView(int w, int l){
        WeekView thisWeek= new WeekView(LocalDate.now(), w, l);
        return thisWeek.slots;
    }

    private Slot[] NextWeek(LocalDate curDay, int w, int l){
        WeekView thisWeek= new WeekView(curDay.plusDays(7), w, l);
        return thisWeek.slots;
    }

    private Slot[] PreviousWeek(LocalDate curDay, int w, int l){
        WeekView thisWeek= new WeekView(curDay.minusDays(7), w, l);
        return thisWeek.slots;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Month getMonth() {
        return month;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public LocalDate getMonday() {
        return monday;
    }

    public void setMonday(LocalDate monday) {
        this.monday = monday;
    }

    public Slot[] getSlots() {
        return slots;
    }

    public void setSlots(Slot[] slots) {
        this.slots = slots;
    }

    @Override
    public void displayView() {
        System.out.println("Weekly com.calendar.view.View");
    }
    @Override
    public void reset() {
        DefaultView(1,1);
    }
}
