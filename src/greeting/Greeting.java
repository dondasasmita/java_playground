package greeting;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Create a method that will take in time in HH:mm format as String and return the correct greeting
 */

public class Greeting {

    public static void main(String[] args) {

        LocalTime timeObj = LocalTime.now();
        DateTimeFormatter time = DateTimeFormatter.ofPattern("HH:mm");
        String currentTime = timeObj.format(time);

        System.out.println(greet(currentTime));
        System.out.println(greet("18:20"));
        System.out.println(greet("04:00"));
        System.out.println(greet("14:00"));

    }


    public static String greet(String currentTime) {

        String [] greetings = {"good morning", "good afternoon", "good evening"};

        String [] time = currentTime.split(":");
        String hourString = time[0];
        String minute = time[1];

        int hour = Integer.parseInt(hourString);

        if (hour >= 0 && hour < 12 ) {
            return greetings[0];
        } else if (hour > 12 && hour < 18) {
            return greetings[1];
        } else {
            return greetings[2];
        }

    }


}
