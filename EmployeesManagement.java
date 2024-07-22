package App;
import java.util.*;
public class EmployeesManagement {
    public EmployeesManagement(){
        Scanner scanner = new Scanner(System.in);
        var PerEmployees = new ArrayList<PermanentEmployee>();
        var TemEmployees = new ArrayList<TemporalEmployee>();
        boolean flag = true;
        while(flag){
            System.out.println("menu: \n 1. Add employee \n 2. Delete employee \n 3. Show employees \n 4. Exit");
            int menu = scanner.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Enter 1 for a temporal employee or 2 for a permanent employee: ");
                    scanner.nextLine();
                    int option = scanner.nextInt();
                    if(option == 1){
                        System.out.println("Enter name: ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("Enter age: ");
                        int age = scanner.nextInt();
                        System.out.println("Enter id: ");
                        scanner.nextLine();
                        int id_employee = scanner.nextInt();
                        System.out.println("Enter salary: ");
                        scanner.nextLine();
                        float salary = scanner.nextFloat();
                        System.out.println("Enter position: ");
                        scanner.nextLine();
                        String position = scanner.nextLine();
                        System.out.println("Enter the contract period in months: ");
                        scanner.nextLine();
                        int time = scanner.nextInt();
                        var TemporalEmployee = new TemporalEmployee(name, age, id_employee, salary, position, time);
                        TemEmployees.add(TemporalEmployee);
                    } else if (option == 2) {
                        System.out.println("Enter name: ");
                        scanner.nextLine();
                        String name = scanner.nextLine();
                        System.out.println("Enter age: ");
                        int age = scanner.nextInt();
                        System.out.println("Enter id: ");
                        scanner.nextLine();
                        int id_employee = scanner.nextInt();
                        System.out.println("Enter salary: ");
                        scanner.nextLine();
                        float salary = scanner.nextFloat();
                        System.out.println("Enter position: ");
                        scanner.nextLine();
                        String position = scanner.nextLine();
                        var PermanentEmployee = new PermanentEmployee(name,age, id_employee, salary, position);
                        PerEmployees.add(PermanentEmployee);
                    }
                    break;
                case 2:
                    System.out.println("Enter the id of the employee you want to delete: ");
                    scanner.nextLine();
                    PermanentEmployee PermanentEmployeeToDelete = null;
                    TemporalEmployee TemporalEmployeeToDelete = null;
                    int employeeToDelete = scanner.nextInt();
                    for (var employee: TemEmployees){
                        if (employee.getId_Employee() == employeeToDelete) TemporalEmployeeToDelete = employee;
                        if (TemporalEmployeeToDelete == null){
                            System.out.println("Invalid credential");
                            break;
                        }
                        TemEmployees.remove(TemporalEmployeeToDelete);
                        System.out.println("Employee successfully deleted");
                    }
                    for (var employee: PerEmployees){
                        if (employee.getId_Employee() == employeeToDelete) PermanentEmployeeToDelete = employee;
                        if (PermanentEmployeeToDelete == null){
                            System.out.println("Invalid credential");
                            break;
                        }
                        PerEmployees.remove(PermanentEmployeeToDelete);
                        System.out.println("Employee successfully deleted");
                    }
                    break;
                case 3:
                    for (var employee : TemEmployees){
                        System.out.println("Temporal employees: \n" + employee);
                    }
                    for (var employee : PerEmployees){
                        System.out.println("Permanent employees: \n" + employee);
                    }
                    break;
                case 4:
                    System.out.println("Leaving...");
                    return;
                default:
                    System.out.println("Please, enter a valid option");
                    break;
            }
        }
    }
}
