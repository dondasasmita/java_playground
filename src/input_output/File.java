package input_output;

public enum File {
    STUDENTS("src/files/subfiles/students.txt");

    public String path;

    File(String filepath) {
        this.path = filepath;
    }
}
