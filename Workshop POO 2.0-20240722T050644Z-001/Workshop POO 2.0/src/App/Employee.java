package App;

public class Employee extends Persona{
    private int id_Employee;
    public float salary;
    public String position;

    public Employee(String name, int age, int id_Employee, float salary, String position){
        super(name,age);
        this.id_Employee = id_Employee;
        this.salary = salary;
        this.position = position;
    }

    public int getId_Employee() {
        return id_Employee;
    }

    public float getSalary() {
        return salary;
    }

    public String getPosition() {
        return position;
    }
}
