//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pto #16
        /*System.out.println("Enter your password");
        String pass = scanner.nextLine();
        Pattern special = Pattern.compile ("[?!¡@¿.,´)_-]");
        Pattern upperCase = Pattern.compile("[ABCDEFGHIJKLMNÑOPQRSTUVWXYZ]");
        Pattern lowerCase = Pattern.compile("[abcdefghijklmnñopqrstuvwxyz]");
        Matcher hasUpperCase = upperCase.matcher(pass);
        Matcher hasLowerCase = lowerCase.matcher(pass);
        Matcher hasSpecial = special.matcher(pass);
        if(!hasSpecial.find() || pass.length() < 8 || !hasUpperCase.find() || !hasLowerCase.find()){
            System.out.println("Your password isn't secure");
        }else{
            System.out.println("Your password is secure");
        }*/
        // Pto #17
        /*System.out.println("Enter any character");
        String character = scanner.nextLine();
        Pattern special = Pattern.compile ("[?!¡@¿.,´)_-]");
        Pattern consonant = Pattern.compile("[BCDFGHJKLMNÑPQRSTVWXYZbcdfghjklmnñpqrstvwxyz]");
        Pattern vocal = Pattern.compile("[AEIOUaeiou]");
        Matcher isSpecial = special.matcher(character);
        Matcher isConsonant = consonant.matcher(character);
        Matcher isVocal = vocal.matcher(character);
        if(isSpecial.find()){
            System.out.println("It's a special character");
        }else if(isConsonant.find()){
            System.out.println("It's a consonant");
        }else if(isVocal.find()){
            System.out.println("It's a vocal");
        }*/
        // Pto #18
        /*int rock = 0;
        int paper = 1;
        int scissors = 2;

        System.out.println("Choose an option: 0 for rock, 1 for paper and 2 for scissors");
        int start = scanner.nextInt();

        double machineSel = (Math.random() * 2);
        long result = Math.round(machineSel);
        System.out.println(result);

        if(start == result){
            System.out.println("It's a draw!");
        } else if(start == rock){
            if(result == scissors)
                System.out.println("You win!");
            if(result == paper)
                System.out.println("You lose");
        }else if(start == scissors){
            if(result == rock)
                System.out.println("You lose");
            if(result == paper)
                System.out.println("You win!");
        }else if(start == paper){
            if(result == rock)
                System.out.println("You win!");
            if(result == scissors)
                System.out.println("You lose");
        }*/
        //Pto #19
        /*System.out.println("Enter your birth year");
        int year = scanner.nextInt();
        System.out.println("Enter your birth month");
        scanner.nextLine();
        int month = scanner.nextInt();
        System.out.println("Enter your birth day");
        scanner.nextLine();
        int day = scanner.nextInt();

        int age = 2024 - year;
        System.out.println("You're "+age+" years old");
        if (age >= 18){
            System.out.println("You're an adult");
        }else{
            System.out.println("You're not an adult");
        }*/
        // Pto #20
        String letters = "abcdefghijklmnopqrstuvwxyz";
        System.out.println("Enter any message");
        String message = scanner.nextLine();
        char character;
        for(int i = 0; message.length(); i++){
            character = message.charAt(i);
        }
    }
}