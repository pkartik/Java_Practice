package JavaPractice.StreamAPI;
import java.util.*;
import java.util.stream.Collectors;


class Product {
    int id;
    String name;
    float price;

    public Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }
}

class JavaStreamFilterExample{
public static void main(String[] args) {
    List<Product> productsList = new ArrayList<>();

    //Adding Products

    productsList.add(new Product(1, "HP Laptop", 25000f));
    productsList.add(new Product(2, "Dell Laptop", 30000f));
    productsList.add(new Product(3, "Lenovo Laptop", 28000f));
    productsList.add(new Product(4, "Sony Laptop", 28000f));
    productsList.add(new Product(5, "Apple Laptop", 90000f));

    //converting products list into set
    Set<Float> productPriceList = productsList.stream().filter(product->product.price<30000).map(product->product.price).collect(Collectors.toSet());
    System.out.println(productPriceList);



}

}