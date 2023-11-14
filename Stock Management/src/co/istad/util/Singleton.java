package co.istad.util;

import co.istad.controller.MenuController;
import co.istad.controller.ProductController;
import co.istad.dao.ProductDao;
import co.istad.dao.ProductDaoImpl;
import co.istad.database.ProductDatabase;
import co.istad.service.ProductService;
import co.istad.service.ProductServiceImpl;
import co.istad.view.MenuView;

import java.util.Scanner;

public class Singleton {

    // 1. Create static reference type
    private static Scanner scanner;
    private static MenuView menuView;
    private static MenuController menuController;
    private static ProductController productController;
    private static ProductServiceImpl productServiceImpl;
    private static ProductDatabase productDatabase;
    private static ProductDaoImpl productDaoImpl;

    // 2. Create get instance of scanner
    public static Scanner scanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
        }
        return scanner;
    }

    // 3.
    public static MenuController menuController() {
        if (menuController == null) {
            menuController = new MenuController();
        }
        return menuController;
    }

    public static ProductController productController() {
        if (productController == null) {
            productController = new ProductController();
        }
        return productController;
    }

    public static ProductServiceImpl productServiceImpl() {
        if (productServiceImpl == null) {
            productServiceImpl = new ProductServiceImpl();
        }
        return productServiceImpl;
    }

    public static ProductDatabase productDatabase() {
        if (productDatabase == null) {
            productDatabase = new ProductDatabase();
        }
        return productDatabase;
    }

    public static ProductDaoImpl productDaoImpl() {
        if (productDaoImpl == null) {
            productDaoImpl = new ProductDaoImpl();
        }
        return productDaoImpl;
    }
}
