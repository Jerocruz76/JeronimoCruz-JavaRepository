package App;

public class Student {
    public int id;
    public String studentName;
    public String email;

    public Student(int id, String studentName, String email){
        this.id = id;
        this.studentName = studentName;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return studentName;
    }

    public String getEmail() {
        return email;
    }
}
