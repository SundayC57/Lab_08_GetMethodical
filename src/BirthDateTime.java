import java.util.Scanner;
public class BirthDateTime {
    public static void main(String[] args) {
      Scanner pipe = new Scanner(System.in);
      /* gets month num */
        int month = SafeInput.getRangedInt(pipe, "Enter the month you were born in", 1, 12);
        int day = 0;
        int switchNum = 0;
        if(month == 1 || month == 3|| month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            switchNum = 1;
        }else if(month == 2){
            switchNum = 2;
        }else if(month == 4|| month == 6|| month == 9 || month == 11) {
            switchNum = 3;
        }


        /* convert month num to month name */
        String monthN = " ";
        if (month == 1) {
            monthN = "January";
        }else if (month == 2) {
            monthN = "February";
        }else if (month == 3) {
            monthN = "March";
        }else if (month == 4) {
            monthN = "April";
        }else if (month == 5) {
            monthN = "May";
        }else if (month == 6) {
            monthN = "June";
        }else if (month == 7) {
            monthN = "July";
        }else if (month == 8) {
            monthN = "August";
        }else if (month == 9) {
            monthN = "September";
        }else if (month == 10) {
            monthN = "October";
        }else if (month == 11) {
            monthN = "November";
        }else if (month == 12){
            monthN = "December";
        }
/* set day range and get day num */

        switch(switchNum) {
            case 1:
                 day = SafeInput.getRangedInt(pipe, "Enter the day you were born on", 1, 31);
                 break;

            case 2:
                day = SafeInput.getRangedInt(pipe, "Enter the day you were born on", 1, 29);
                break;
            case 3:
                day = SafeInput.getRangedInt(pipe, "Enter the day you were born on", 1, 30);
                break;
        }

        /* get hour and min nums */
        int hour = SafeInput.getRangedInt(pipe, "Enter the hour of that day you were born", 1, 24);
        int minute = SafeInput.getRangedInt(pipe, "Enter the minute of that hour you were born", 1, 59);

        /* display gathered info using day num to decied how which print to use */
        int dayN = 0;

        if (day == 1|| day == 21|| day == 31) {
            dayN = 1;
        }else if (day == 2 || day == 22) {
            dayN = 2;
        }else if (day == 3 || day == 23) {
            dayN =3;
        }else{
            dayN =4;
        }


        switch(dayN) {
            case 1:
                IO.println("You've entered that you were born in " + monthN + " on " + day + "st at " + hour + ":" + minute);
                break;
            case 2:
                IO.println("You've entered that you were born in " + monthN + " on " + day + "nd at " + hour + ":" + minute);
                break;
            case 3:
                IO.println("You've entered that you were born in " + monthN + " on " + day + "rd at " + hour + ":" + minute);
                break;
            case 4:
                IO.println("You've entered that you were born in " + monthN + " on " + day + "th at " + hour + ":" + minute);
        }

    }
}
