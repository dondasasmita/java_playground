package data_structure;

public class Student implements Item {

    public int id;
    public String name;

    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}
