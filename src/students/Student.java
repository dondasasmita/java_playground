package students;

public class Student {
    private int id;
    private String name;
    private String programmingLanguage;
    private int yearsOfExperience;

    public Student(int id, String name, String programmingLanguage, int year){
        this.id = id;
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = year;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", yearsOfExperience=" + yearsOfExperience +
                '}';
    }
}
