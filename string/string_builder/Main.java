package com.example;

public class Main {
    public static String buildProductList(String[][] products) {
        StringBuilder productList = new StringBuilder();
        productList.append("Product List:\n");

        // 1. Loop over each product row
        for (String[] product : products) {
            // 2. Extract name and price by index
            String name = product[0];
            String price = product[1];
            // 3. Append formatted line
            productList.append(name)
                       .append(" - $")
                       .append(price)
                       .append("\n");
        }

        // 4. Return the completed string
        return productList.toString();
    }

    public static void main(String[] args) {
        String[][] products = {
            {"Laptop", "999.99"},
            {"Phone", "499.49"},
            {"Tablet", "299.99"}
        };

        String result = buildProductList(products);
        System.out.println(result);
    }
}