package App;

import java.util.ArrayList;

public class Course {
    public int code;
    public String name;
    public ArrayList<Student> studentArrayList;
    public Course(int code, String name, ArrayList<Student> studentArrayList){
        this.code = code;
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getStudentArrayList() {
        return studentArrayList;
    }
}
