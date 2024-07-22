package App;

public class PermanentEmployee extends Employee{
    public PermanentEmployee(String name, int age, int id_employee, float salary, String position){
        super(name, age, id_employee, salary, position);
    }

    @Override
    public String toString() {
        return "name: " + name +
                ", age: " + age +
                ", salary: " + salary +
                ", position: " + position;
    }
}
