package co.istad.view;

import co.istad.model.Product;

import java.util.List;

public class ProductView {
    public static void printProductList(List<Product> products) {
        System.out.println("Product List");
        products.forEach(product -> {
            System.out.println("-".repeat(20));
            System.out.println("ID : " + product.getId());
            System.out.println("NAME : " + product.getName());
            System.out.println("QTY : " + product.getQty());
            System.out.println("PRICE : " + product.getPrice());
            System.out.println("IMPORTED DATE : " + product.getImportDate());
            System.out.println("-".repeat(20));
        });
    }
}
