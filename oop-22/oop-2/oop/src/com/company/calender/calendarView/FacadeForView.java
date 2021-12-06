package com.company.calender.calendarView;

import java.time.LocalDate;

public class FacadeForView {
    private View monthly;
    private View weekly;
    private View daily;

    public FacadeForView(){
        this.monthly=new MonthView(LocalDate.now(), 1, 1); //for now: when switching views the calendar resets to today automatically
        this.weekly=new WeekView(LocalDate.now(), 1, 1);
        this.daily=new DayView(LocalDate.now(), 1,1);
    }
    public void displayMonth(){
        monthly.displayView();
    }
    public void displayWeek(){
        weekly.displayView();
    }
    public void displayDay(){
        daily.displayView();
    }
    public void resetMonth(){
        monthly.reset();
    }
    public void resetWeek(){
        weekly.reset();
    }
    public void resetDay(){
        daily.reset();
    }
}
