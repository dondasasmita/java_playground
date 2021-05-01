package input_output;

import java.io.BufferedReader;
import java.io.FileReader;

public class CSV_Practice {

    public static void main(String[] args) {

        String row;

        try  {
            BufferedReader reader = new BufferedReader(new FileReader("src/input_output/sample_files/test.csv"));
            while ((row = reader.readLine()) != null) {
                String[] data = row.split(",");
                for (String input : data) {
                    System.out.println(input);
                }
            }

            reader.close();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
