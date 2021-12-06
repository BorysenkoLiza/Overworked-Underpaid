package com.company.calender.calendarView;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
        Slot viewNow = new Slot(date,1,1);
        int in=0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("PREVIOUS DAY (input 0) >>> CURRENT DAY >>> NEXT DAY (input 1):");
        try {
            in = (int)br.read();
        } catch (IOException e) {
            System.out.println("Error reading from Input device");
        }
        switch(in){
            case 0: viewNow = PreviousDay(viewNow.getDate(),1,1);
                break;
            case 1: viewNow = NextDay(viewNow.getDate(),1,1);
                break;
            default: viewNow = DefaultView(1,1);
        }
        System.out.println("Daily view");
        System.out.println("DATE:"+viewNow.getDate());
        System.out.println("DAY OF THE WEEK:"+viewNow.getDayOfWeek());
        System.out.println("EVENTS:");
        for(int i=0; i<viewNow.getTodayEvents().size(); i++){
            viewNow.getTodayEvents().get(i).print();//print event
        }

    }
    @Override
    public void reset() {
        DefaultView(1,1);
    }
}
