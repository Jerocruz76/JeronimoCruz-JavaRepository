package App;
import java.util.ArrayList;
import java.util.Scanner;
public class CourseManagement {
    public CourseManagement(){
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        int studentId = 0;
        while(flag){
            System.out.println("menu: 1. Add courses \n 2. Subscribe a student \n 3. List students for course \n 4. Exit");
            int menu = scanner.nextInt();
            switch (menu){
                case 1:
                    System.out.println("Enter the course name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("Enter the course code: ");
                    int code = scanner.nextInt();
                    break;
                case 2:
                    System.out.println("Enter the student name: ");
                    scanner.nextLine();
                    String studentName = scanner.nextLine();
                    System.out.println("Enter the student email: ");
                    String email = scanner.nextLine();
                    var Student = new Student(studentId++, studentName, email);
                    Students_list.add(Student);
                    break;
                case 3:
                    System.out.println("Enter course name you're searching for: ");
                    scanner.nextLine();
                    Student studentsToFind = null;
                    String course = scanner.nextLine();
                    for(var courses : Students_list){
                        if (courses.getName().equals(course)) studentsToFind = courses;
                    }
                    if (studentsToFind == null){
                        System.out.println("This course doesn't exist");
                        break;
                    }
                    System.out.println(studentsToFind);
                    break;
                case 4:
                    System.out.println("Leaving... ");
                    return;
            }
        }
    }
}
