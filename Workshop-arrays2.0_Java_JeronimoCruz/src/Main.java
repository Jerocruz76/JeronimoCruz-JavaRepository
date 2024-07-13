//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pto #1
        /*System.out.println("Enter a number");
        int num1 = scanner.nextInt();
        System.out.println("Enter another number");
        scanner.nextLine();
        int num2 = scanner.nextInt();
        System.out.println("Choose an option");
        scanner.nextLine();
        String[] menu = new String[5];
        menu[0] = "1. Add";
        menu[1] = "2. Substraction";
        menu[2] = "3. Multiplication";
        menu[3] = "4. Division";
        menu[4] = "5. Exit";
        int i = 0;
        while(i < 5){
            System.out.println(""+menu[i]);
            i++;
        }
        String option = scanner.nextLine();
        switch(option){
            case "1":
                System.out.println(num1+num2);
                break;
            case "2":
                System.out.println(num1-num2);
                break;
            case "3":
                System.out.println(num1*num2);
                break;
            case "4":
                System.out.println(num1/num2);
                break;
            case "5":
                System.out.println("Leaving...");
                break;
            default:
                System.out.println("Please, enter a valid option");
        }*/
        // Pto #2
        /*String[] products = new String [5];
        int[] prices = new int[5];
        products[0] = "1. Monitor";
        products[1] = "2. Keyboard";
        products[2] = "3. Mouse";
        products[3] = "4. Mousepad";
        products[4] = "5. Led lights";

        prices[0] = 150;
        prices[1] = 64;
        prices[2] = 50;
        prices[3] = 70;
        prices[4] = 25;

        System.out.println("There we have our products, and it's prices for each one: ");
        int i = 0;
        while(i < 5){
            System.out.println(""+ products[i]);
            i++;
        }
        int x = 0;
        while(x < 5){
            System.out.println(""+ prices[x]);
            x++;
        }
        boolean flag = true;
        while(flag){
            System.out.println("Enter 1 for buy a product or 2 for exit");
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    int productCount1 = 0;
                    int productCount2 = 0;
                    int productCount3 = 0;
                    int productCount4 = 0;
                    int productCount5 = 0;
                    double priceCount = 0;
                    boolean a = true;
                    while(a){
                        System.out.println("Enter the product or 6 to exit");
                        scanner.nextLine();
                        int input = scanner.nextInt();
                        switch(input){

                            case 1:
                                System.out.println("Enter the quantity you want");
                                scanner.nextLine();
                                int quantity = scanner.nextInt();
                                productCount1 += quantity;
                                int total = quantity * 150;
                                priceCount += total;
                                break;
                            case 2:
                                System.out.println("Enter the quantity you want");
                                scanner.nextLine();
                                int quantity2 = scanner.nextInt();
                                productCount2 += quantity2;
                                int total2 = quantity2 * 64;
                                priceCount += total2;
                                break;
                            case 3:
                                System.out.println("Enter the quantity you want");
                                scanner.nextLine();
                                int quantity3 = scanner.nextInt();
                                productCount3 += quantity3;
                                int total3 = quantity3 * 50;
                                priceCount += total3;
                                break;
                            case 4:
                                System.out.println("Enter the quantity you want");
                                scanner.nextLine();
                                int quantity4 = scanner.nextInt();
                                productCount4 += quantity4;
                                int total4 = quantity4 * 70;
                                priceCount += total4;
                                break;
                            case 5:
                                System.out.println("Enter the quantity you want");
                                scanner.nextLine();
                                int quantity5 = scanner.nextInt();
                                productCount5 += quantity5;
                                int total5 = quantity5 * 25;
                                priceCount += total5;
                                break;
                            case 6:
                                return;
                            default:
                                System.out.println("Enter a valid product");
                        }
                        System.out.println("Your total is " + priceCount);
                        // Pto #4
                        if(priceCount<200){
                            System.out.println("You don't have a discount");
                        } else if (priceCount >= 200) {
                            System.out.println("You have a discount of 10%");
                            double discount = 10 * priceCount / 100;
                            double total = priceCount - discount;
                            System.out.println("Your total is: " + total);
                        } if (priceCount >= 300) {
                            System.out.println("You have a discount of 15%");
                            double discount = 15 * priceCount / 100;
                            double total = priceCount - discount;
                            System.out.println("Your total is: " + total);
                        } if (priceCount >= 500){
                            System.out.println("You have a discount of 20%");
                            double discount = 20 * priceCount / 100;
                            double total = priceCount - discount;
                            System.out.println("Your total is: " + total);
                        } if (priceCount >= 1000) {
                            System.out.println("You have a discount of 25%");
                            double discount = 25 * priceCount / 100;
                            double total = priceCount - discount;
                            System.out.println("Your total is: " + total);
                        }
                    }
                case 2:
                    System.out.println("Leaving...");
                    return;
            }
        }*/
        // Pto #3

        /*System.out.println("How many grades do you have?");
        int gradesH = scanner.nextInt();
        if(gradesH > 8 ){
            System.out.println("Only can be 8 grades or less");
        }else{
            double[] grades = new double[gradesH];
            for(int i = 0; i< grades.length; i++){
                System.out.println("Enter a grade (1-100))");
                double grade = scanner.nextDouble();
                grades[i] = grade;
            }
            double totalGrade = 0;
            for(double var : grades){
                totalGrade += var;
            }
            double doubleGrade = totalGrade/gradesH;
            if(totalGrade < 608){
                double totalNecessary = (608-totalGrade)/gradesH;
                System.out.println("Your lefting prom is " + totalNecessary);
                System.out.println("You have a grade of " + doubleGrade);
            }
        }*/
        // Pto #6
        /*String[] names = {"Jaime","Jorge","Nicolas","Humberto","Mauricio"};
        Arrays.asList(names);
        System.out.println("Found Nicolas in the array");
        String inputName = scanner.nextLine();
        if (Arrays.asList(names).contains("Nicolas")){
            System.out.println("Name found in the array");
            System.out.println(Arrays.toString(names));
        }*/
        // Pto #7
        /*int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        for (int x=0; x < matrix.length; x++) {
            for (int y=0; y < matrix[x].length; y++) {
                matrix[y][x] = matrix[x][y];
                System.out.println(matrix[x][y]);
            }
        }
        for ( int y=1; y < matrix.length; y++ ) {
            for (int x = 0; x < y; x++) {
                if (matrix[x][y] != matrix[y][x]) {
                    System.out.println("Isn't symmetrical");
                }
            }
            System.out.println("It's symmetrical");
        }*/
        // Pto #8
        /*int coincidencesCounter5 = 0;
        int coincidencesCounter6 = 0;
        int coincidencesCounter8 = 0;
        int coincidencesCounter9 = 0;
        int[] numbers = {1,2,3,4,5,5,5,6,6,7,8,8,8,8,9,9};
        int[] coincidences = new int[4];
        int max;
        for (int i = 0; i < numbers.length; i++) {
            if(i == 5){
                coincidencesCounter5+=i;
                coincidences[0]=coincidencesCounter5;
            } else if (i == 6) {
                coincidencesCounter6+=i;
                coincidences[1]=coincidencesCounter6;
            } else if (i == 8) {
                coincidencesCounter8+=i;
                coincidences[2]=coincidencesCounter8;
            } else if (i == 9) {
                coincidencesCounter9+=i;
                coincidences[3]=coincidencesCounter9;
            }
        }
        for (int i = 0; i < 4; i++) {
            max = coincidences[0];

            if(coincidences[i] > max){
                max = coincidences[i];
                System.out.println(max);
            }
            else if (coincidences[i] < max){
                max = max;

            }
        }*/
        // Pto #10
        /*int [] array = {4,6,2,8,7};

        for (int i = 0; i < array.length/2; i++) {
            int j = array.length-i-1;
            int a = array[i];
            int b = array[j];
            array[i] = b;
            array[j] = a;
        }
        System.out.println(Arrays.toString(array));*/
        // Investigación 1
        // ArrayList: Es una estructura de almacenamiento de datos dinámica que crece o se hace más pequeña conforme se le van agregando o eliminando elementos.
        // Ejemplos de arrayList
        /*ArrayList<String> names = new ArrayList<String>();*/
        // Ejemplo de metodos de arrayList
        /*names.add("Jorge");*/
        // Para añadir elementos
        /*names.size();*/
        // Para imprimir el numero de elementos
        /*names.contains("Jorge");*/
        // Devuelve booleano en caso de encontrar una coincidencia
        /*names.get(0);*/
        // Comprueba si existe el elemento en el indice
        /*names.indexOf("Jorge");*/
        // Devuelve el índice del elemento
        // Investigación 2
        // Map: Es una interfaz en Java, que se utiliza para almacenar datos en forma de pares clave-valor
        // Ejemplos de mapas
        /*Map<String, String> products = new HashMap<String,String>();*/
        // Metodos de mapas
        /*products.put("Jarrón", "5000$");*/
        // Agregar clave y valor a el mapa
        /*products.containsKey("Jarrón");*/
        // Revisa si algún producto tiene la clave que se busca
        /*products.remove("Jarrón");*/
        // Elimina una clave del mapa
    }
}