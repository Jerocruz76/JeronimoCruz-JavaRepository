//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pto #1
        /*System.out.println("Write a number");
        int num1 = scanner.nextInt();
        System.out.println("Write another number");
        scanner.nextLine();
        int num2 = scanner.nextInt();
        int add = num1 + num2;
        int substraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        System.out.println("Here is your answers: addition = "+ add +" substraction = " + substraction+" multiplication = " + multiplication +" and division = "+division);*/
        // Pto #2
        /*System.out.println("Write your age");
        int age = scanner.nextInt();
        if(age < 18){
            System.out.println("You're not an adult");
        }else{
            System.out.println("You're an adult");
        }*/
        // Pto #3
        /*System.out.println("Write a distance in kilometers");
        int km = scanner.nextInt();
        double miles = km / 1.60934;
        System.out.println("In miles, that distance are equal to "+ miles +" miles");*/
        // Pto #4
        /*System.out.println("Enter your weight in kg");
        int weight = scanner.nextInt();
        System.out.println("Enter your height in meters");
        scanner.nextLine();
        float height = scanner.nextFloat();
        float IMC = weight / (height * height);
        System.out.println("Your IMC index is = " + IMC);*/
        // Pto #5
        /*System.out.print("Enter any integer number");
        int num = scanner.nextInt();
        if(num < 0){
            System.out.println("This number is negative");
        }else if(num == 0){
            System.out.println("This number is equal to 0");
        }else{
            System.out.println("This number is positive");
        }*/
        // Pto #6
        /*System.out.println("Enter any month from 1 to 12");
        int month = scanner.nextInt();
        switch(month){
            case 1:
                System.out.println("January has 31 days");
                break;
            case 2:
                System.out.println("February has 28 days");
                break;
            case 3:
                System.out.println("March has 31 days");
                break;
            case 4:
                System.out.println("April has 30 days");
                break;
            case 5:
                System.out.println("May has 31 days");
                break;
            case 6:
                System.out.println("June has 30 days");
                break;
            case 7:
                System.out.println("July has 31 days");
                break;
            case 8:
                System.out.println("August has 31 days");
                break;
            case 9:
                System.out.println("September has 30 days");
                break;
            case 10:
                System.out.println("October has 31 days");
                break;
            case 11:
                System.out.println("November has 30 days");
                break;
            case 12:
                System.out.println("December has 31 days");
                break;
            default:
                System.out.println("Please, enter a valid month");
        }*/
        // Pto #7
        /*System.out.println("Enter a number");
        int num1 = scanner.nextInt();
        System.out.println("Enter another number");
        scanner.nextLine();
        int num2 = scanner.nextInt();
        int add = num1 + num2;
        int substraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        System.out.println("Enter an option : 1. Addition, 2. Substraction, 3. Multiplication, 4. Division");
        scanner.nextLine();

        int optionMenu = scanner.nextInt();
        switch(optionMenu){
            case 1:
                System.out.print(num1 + " + " + num2 + " is equal to " + add);
                break;
            case 2:
                System.out.print(num1 + " - " + num2 + " is equal to " + substraction);
                break;
            case 3:
                System.out.print(num1 + " * " + num2 + " is equal to " + multiplication);
                break;
            case 4:
                System.out.print(num1 + " / " + num2 + " is equal to " + division);
                break;
            default:
                System.out.print("Please enter a valid option");
        }*/
        // Pto #8
        /*System.out.println("Enter your first mark");
        float mark1 = scanner.nextFloat();
        System.out.println("Enter your second mark");
        scanner.nextLine();
        float mark2 = scanner.nextFloat();
        System.out.println("Enter your third mark");
        scanner.nextLine();
        float mark3 = scanner.nextFloat();
        float average = (mark1 + mark2 + mark3) / 3;
        System.out.println("Your average is: "+ average);
        if(average < 6){
            System.out.println("You haven't passed :( Sorry");
        }else if(average >= 6){
            System.out.println("You have passed :D Congrats");
        }*/
        // Pto #9
        /*System.out.print("Enter any year");
        int year = scanner.nextInt();
        if(year % 4 == 0 && year % 100 != 0){
            System.out.println("This year is leap");
        } else if(year % 4 != 0){
            System.out.println("This year isn't leap");
        }*/
        // Pto #10
        /*System.out.print("Enter your bill amount: ");
        double amount = scanner.nextDouble();
        System.out.print("Enter your tip percentage: ");
        scanner.nextLine();
        double tipPercentage = scanner.nextDouble();
        double tipAmount = amount * tipPercentage / 100;
        System.out.println("Your tip amount is " + tipAmount);*/
        // Pto #11
        /*System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Enter another number: ");
        scanner.nextLine();
        int number2 = scanner.nextInt();
        System.out.println("Enter another number: ");
        scanner.nextLine();
        int number3 = scanner.nextInt();
        if (number > number2 && number2 > number3) {
            System.out.println(number3 + "," + number2 + "," + number);
        }else if (number > number3 && number3 > number2) {
            System.out.println(number2 + "," + number3 + "," + number);
        }else if (number2 > number && number > number3) {
            System.out.println(number3 + "," + number + "," + number2);
        }else if (number2 > number3 && number3 > number) {
            System.out.println(number + "," + number3 + "," + number3);
        }else if (number3 > number && number > number2) {
            System.out.println(number2 + "," + number + "," + number3);
        }else if (number3 > number2 && number2 > number) {
            System.out.println(number + "," + number2 + "," + number3);
        }*/
        // Pto #12
        /*System.out.println("Enter your birth month");
        int month = scanner.nextInt();
        System.out.println("Enter your birth day");
        scanner.nextLine();
        int day = scanner.nextInt();
        switch(month){
            case 1:
                if(day >= 1 && day <= 19){
                    System.out.println("Your zodiac is capricorn");
                }else if(day >= 20 && day <= 31){
                    System.out.println("Your zodiac is aquarius");
                }
                break;
            case 2:
                if(day >= 1 && day <= 18){
                    System.out.println("Your zodiac is aquarius");
                }else if(day >= 19 && day <= 28){
                    System.out.println("Your zodiac is pisces");
                }
                break;
            case 3:
                if(day >= 1 && day <= 20){
                    System.out.println("Your zodiac is pisces");
                }else if(day >= 20 && day <= 31){
                    System.out.println("Your zodiac is aries");
                }
                break;
            case 4:
                if(day >= 1 && day <= 19){
                    System.out.println("Your zodiac is aries");
                }else if(day >= 20 && day <= 30){
                    System.out.println("Your zodiac is taurus");
                }
                break;
            case 5:
                if(day >= 1 && day <= 20){
                    System.out.println("Your zodiac is taurus");
                }else if(day >= 21 && day <= 31){
                    System.out.println("Your zodiac is gemini");
                }
                break;
            case 6:
                if(day >= 1 && day <= 20){
                    System.out.println("Your zodiac is gemini");
                }else if(day >= 21 && day <= 30){
                    System.out.println("Your zodiac is cancer");
                }
                break;
            case 7:
                if(day >= 1 && day <= 22){
                    System.out.println("Your zodiac is cancer");
                }else if(day >= 23 && day <= 31){
                    System.out.println("Your zodiac is leo");
                }
                break;
            case 8:
                if(day >= 1 && day <= 22){
                    System.out.println("Your zodiac is leo");
                }else if(day >= 23 && day <= 31){
                    System.out.println("Your zodiac is virgo");
                }
                break;
            case 9:
                if(day >= 1 && day <= 22){
                    System.out.println("Your zodiac is virgo");
                }else if(day >= 23 && day <= 30){
                    System.out.println("Your zodiac is libra");
                }
                break;
            case 10:
                if(day >= 1 && day <= 22){
                    System.out.println("Your zodiac is libra");
                }else if(day >= 23 && day <= 31){
                    System.out.println("Your zodiac is scorpio");
                }
                break;
            case 11:
                if(day >= 1 && day <= 21){
                    System.out.println("Your zodiac is scorpio");
                }else if(day >= 22 && day <= 30){
                    System.out.println("Your zodiac is sagittarius");
                }
                break;
            case 12:
                if(day >= 1 && day <= 21){
                    System.out.println("Your zodiac is sagittarius");
                }else if(day >= 22 && day <= 31){
                    System.out.println("Your zodiac is capricorn");
                }
                break;
            default:
                System.out.println("Please, enter a valid month");
        }*/
        // Pto #13
        /*float fee = 3200;
        System.out.println("Enter your travel in kilometers");
        float distance = scanner.nextFloat();
        float pricePerKm = distance * 3250;
        System.out.print("The price of the travel is: " + pricePerKm + "$");*/
        // Pto #14
        /*System.out.println("Enter 1 for Celsius to Fahrenheit and 2 for Fahrenheit to Celsius ");
        int option = scanner.nextInt();
        switch(option){
            case 1:
                System.out.println("Enter the temperature in Celsius");
                scanner.nextLine();
                float celsius = scanner.nextFloat();
                float fahrenheit = celsius * 9 / 5 + 32;
                System.out.println(fahrenheit + "F°");
            case 2:
                System.out.println("Enter the temperature in Fahrenheit");
                scanner.nextLine();
                float fahrenheit2 = scanner.nextFloat();
                float celsius2 = (fahrenheit2 - 32) * 5 / 9;
                System.out.println(celsius2 + "C°");
        }*/
        // Pto #15
        /*System.out.println("Enter your mark from 0 to 100");
        int mark = scanner.nextInt();
        if (mark >= 0 && mark <= 59){
            System.out.println("You've got an F");
        } else if (mark >= 60 && mark <= 69) {
            System.out.println("You've got an D");
        } else if (mark >= 70 && mark <= 79) {
            System.out.println("You've got an C");
        } else if (mark >= 80 && mark <= 89) {
            System.out.println("You've got and B");
        } else if (mark >= 90 && mark <= 100) {
            System.out.println("You've got and A");
        }*/
    }
}