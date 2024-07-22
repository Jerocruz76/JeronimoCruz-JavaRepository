package App;

public class TemporalEmployee extends Employee{
    public int time;
    public TemporalEmployee(String name, int age, int id_employee, float salary, String position, int time){
        super(name, age, id_employee, salary, position);
        this.time = time;
    }

    @Override
    public String toString() {
        return  "name: " + name +
                ", age: " + age +
                ", salary: " + salary +
                ", position: " + position +
                ", Contract: " + time;
    }
}
