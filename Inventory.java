package App;

import java.util.*;

public class Inventory {
    public Inventory(){
        Scanner scanner = new Scanner(System.in);
        var products= new ArrayList<SpecificProduct>();
        int idToAssignProducts = 0;
        boolean flag = true;
        while(flag){
            System.out.println("Menu: 1. Add product \n 2. Delete product \n 3. List product \n 4. Search by name \n 5.Exit");
            int menu = scanner.nextInt();
            switch (menu){
                case 1:
                    // Pedirle al usuario la info del producto.
                    System.out.println("Enter the product name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    System.out.println("Enter the price: ");
                    float price = scanner.nextFloat();
                    System.out.println("Enter the category: ");
                    scanner.nextLine();
                    String category = scanner.nextLine();
                    System.out.println("Enter the brand: ");
                    String brand = scanner.nextLine();
                    var specificProduct = new SpecificProduct(idToAssignProducts++, name, price, category, brand);
                    products.add(specificProduct);
                    System.out.println("Product successfully added!");
                    break;
                case 2:
                    System.out.println("Enter the name of the product you want to delete: ");
                    scanner.nextLine();
                    SpecificProduct productToDelete = null;
                    String productNameToDelete = scanner.nextLine();
                    for (var product: products){
                        if (product.getName().equals(productNameToDelete)) productToDelete = product;
                    }
                    if (productToDelete == null){
                        System.out.println("Product not found");
                        break;
                    }
                    products.remove(productToDelete);
                    System.out.println("Product successfully deleted");
                    break;
                case 3:
                    for (var product: products){
                        System.out.println(product);
                    }
                    break;
                case 4:
                    System.out.println("Enter the name of the product you're searching for: ");
                    scanner.nextLine();
                    SpecificProduct productToFind = null;
                    String nameProductToFind = scanner.nextLine();
                    for(var product: products) {
                        if (product.getName().equals(nameProductToFind)) productToFind = product;
                        if (productToFind == null) {
                            System.out.println("Product not found");
                            break;
                        }
                        System.out.println(productToFind);
                    }
                    break;
                case 5:
                    System.out.println("Leaving...");
                    return;
                default :
                    System.out.println("Please, enter a valid option");
                    break;

            }
        }
    }
}
