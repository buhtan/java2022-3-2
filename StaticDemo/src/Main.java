public class Main {

    public static void main(String[] args) {

        ProductManager manager = new ProductManager();
        Product product = new Product();
        product.id = 10;
        product.name = "";
        product.price = 999.9;
        manager.add(product);

    }


}