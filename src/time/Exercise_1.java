package time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;

/**
 * Given an epoch time in GMT +0 convert it into 2 different time zone and print out
 * eg : Singapore Timezone is GMT + 8 and California Timezone is GMT -7
 * the results as dd/MM/yyyy HH:mm:ss
 */

public class Exercise_1 {

    private static final int SG_TIME = 8;
    private static final int CALI_TIME = -7;

    public static void main(String[] args) {

        Instant currentTime = Instant.now();
        long epoch = currentTime.getEpochSecond(); // eg: GMT +0, coming from elsewhere

        long singaporeEpochTime = offSetHours(epoch,SG_TIME);
        long californiaEpochTime = offSetHours(epoch, CALI_TIME);

        String singaporeFormatDate = formatDate(singaporeEpochTime);
        String californiaFormatDate = formatDate(californiaEpochTime);


        System.out.println("Singapore Time : " + singaporeFormatDate);
        System.out.println("California Time : " + californiaFormatDate);

    }


    public static long offSetHours(long epochSeconds, int hours) {
        int numOfSecondsPerHour = 3600;

        long adjustedTime = epochSeconds + (hours * numOfSecondsPerHour);

        return adjustedTime;

    }

    public static String formatDate(long epoch) {

        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        return sdf.format(epoch * 1000);
    }


}
