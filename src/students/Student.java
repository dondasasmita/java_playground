package students;

public class Student {
    private String name;
    private String programmingLanguage;
    private int yearsOfExperience;

    public Student(String name, String programmingLanguage, int year){
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
