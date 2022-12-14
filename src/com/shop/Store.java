package com.shop;

//Вот тебе еще задание:
//- Создать класс с названием Store, в котором будет одно поле - массив строк.
//- В массиме при создании добавить 5 строк: Apple, Milk, Chocolate, Eggs, Banana.
//- В этом класе создать один метод с названием isInStock, который как параметр принимает строку и возвращает boolean.
//- Этот метод будет проверять содержить ли массив строку, которая передана как аргумент метода isInStock

import java.util.Arrays;

public class Store {


    static String[] products = {"Apple", "Milk", "Chocolate", "Eggs", "Banana"};

    //static String a = "Banana";

    public static boolean isInStock(String str) {
        for (int i = 0; i < products.length; i++) {
            if (products[i].equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(products));
        if (isInStock("Milk")) {
            System.out.println("We find Milk");
        }
        if (isInStock("Banana")) {
            System.out.println("We find Banana");
        }
        if (isInStock("Mango")){
            System.out.println("We find Mango");
        }
    }
}

