package com.company.calender.calendarView;

import java.time.LocalDate;
import java.time.Month;

public class MonthView implements View {
    private int year;
    private Month month;
    private int days;
    private Slot[] slots;

    public MonthView(LocalDate curDay, int w, int l){  // w l: grid size
        year=curDay.getYear();
        month=curDay.getMonth();
        days=curDay.lengthOfMonth();
        LocalDate currentDay=LocalDate.of(year,month,1);
        for (int i=0; i<days; i++){
            slots[i]=new Slot(currentDay,w,l);
            currentDay=currentDay.plusDays(1);
        }
    }

    private Slot[] DefaultView(int w, int l){
        MonthView thisMonth = new MonthView(LocalDate.now(),w,l);
        return thisMonth.slots;
    }

    private Slot[] NextMonth(LocalDate curDay, int w, int l){
        MonthView thisMonth = new MonthView(curDay.plusMonths(1),w,l);
        return thisMonth.slots;
    }

    private Slot[] PreviousMonth(LocalDate curDay, int w, int l){
        MonthView thisMonth = new MonthView(curDay.minusMonths(1),w,l);
        return thisMonth.slots;
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

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public Slot[] getSlots() {
        return slots;
    }

    public void setSlots(Slot[] slots) {
        this.slots = slots;
    }

    @Override
    public void displayView() {
        System.out.println("Monthly View");
    }
    @Override
    public void reset() {
        DefaultView(1,1);
    }
}
