package com.company.calendar;

public class CalendarConverter {

    final static int MONDAY = 1;
    final static int TUESDAY = 2;
    final static int WEDNESDAY = 3;
    final static int THURSDAY = 4;
    final static int FRIDAY = 5;
    final static int SATURDAY = 6;
    final static int SUNDAY = 7;

    static String convertDayToString(int dayNumber) {
        String day;
        switch (dayNumber) {
            case 1:
                day = "poniedziałek";
                break;
            case 2:
                day = "wtorek";
                break;
            case 3:
                day = "środa";
                break;
            case 4:
                day = "czwartek";
                break;
            case 5:
                day = "piątek";
                break;
            case 6:
                day = "sobota";
                break;
            case 7:
                day = "niedziela";
                break;
            default:
                day = "nie wiadomo";
        }
        return dayNumber + " dzień tygodnia to " + day;
    }

}
