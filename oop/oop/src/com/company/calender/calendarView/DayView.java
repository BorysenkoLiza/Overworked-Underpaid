package com.company.calender.calendarView;

import java.time.LocalDate;
import java.time.Month;

public class DayView implements View {
    private int year;
    private Month month;
    private LocalDate date;
    private Slot slot;

    public DayView(LocalDate curDay, int w, int l){
        date = curDay;
        month=curDay.getMonth();
        year=curDay.getYear();
        slot=new Slot(curDay,w,l);
    }

/*    private void fillSlot(LocalDate curDay, int w, int l){
        slot=new com.calendar.view.Slot(curDay,w,l);
    }*/

    private Slot NextDay(LocalDate curDay, int w, int l){
        DayView thisDay = new DayView(curDay.plusDays(1),w,l);
        return thisDay.slot;
    }

    private Slot PreviousDay(LocalDate curDay, int w, int l){
        DayView thisDay = new DayView(curDay.minusDays(1),w,l);
        return thisDay.slot;
    }

    public Slot DefaultView(int w, int l){
        DayView thisDay = new DayView(LocalDate.now(), w, l);
        return thisDay.slot;
    }

    @Override
    public void displayView() {
        System.out.println("Daily view");
    }
    @Override
    public void reset() {
        DefaultView(1,1);
    }
}
