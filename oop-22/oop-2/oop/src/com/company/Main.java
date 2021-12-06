package com.company;
import com.company.calender.CalenderFacade;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        CalenderFacade a = new CalenderFacade();
        a.createEvent();
        //CalenderFacade.switchView(CalenderFacade.viewType.day);
    }

}
