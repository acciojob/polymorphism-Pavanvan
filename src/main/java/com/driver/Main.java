package com.driver;
public class Main {

    public static void main(String[] args) {
        Product p = new Product();

        int result1 = p.product(2, 3);
        System.out.println("Product of 2 and 3 is: " + result1);

        int result2 = p.product(2, 3, 4);
        System.out.println("Product of 2, 3, and 4 is: " + result2);

        double result3 = p.product(2.0, 3.0);
        System.out.println("Product of 2.0 and 3.0 is: " + result3);
    }
}

class Product {
    public int product(int x, int y) {
        return x * y;
    }

    public int product(int x, int y, int z) {
        return x * y * z;
    }

    public double product(double x, double y) {
        return x * y;
    }
}
