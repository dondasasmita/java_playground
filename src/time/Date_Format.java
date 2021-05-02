package time;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class Date_Format {

    public static void main(String[] args) {
        Instant currentTime = Instant.now();
        long epoch = currentTime.getEpochSecond();
        System.out.println(epoch);

        DateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println(sdf.format(epoch * 1000));

    }





}
