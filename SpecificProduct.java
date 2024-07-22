package App;

class SpecificProduct extends Product {

    public String category;
    public String brand;

    public SpecificProduct(int id, String name, float price, String category, String brand){
        super(id, name, price);
        this.category = category;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return  '{'+
                "id: " + this.getId() +
                ", product: " + this.getName() +
                ", price: " + this.getPrice() +
                ", category: '" + this.category + '\'' +
                ", brand: '" + this.brand + '\'' +
                '}';
    }
}
