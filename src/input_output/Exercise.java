package input_output;


import students.Student;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Exercise {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();

        try {

            BufferedReader in = new BufferedReader(new FileReader("src/files/students.txt"));

            String str;

            while ((str = in.readLine()) != null) {

                String[] studentInfo = str.split(",");

                String name = studentInfo[0];
                String language = studentInfo[1];
                int experience  = Integer.parseInt(studentInfo[2]);

                Student student = new Student(name, language, experience);
                students.add(student);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // DO something with your objects
        for(Student student : students) {
            System.out.println(student.toString());
        }

    }
}
