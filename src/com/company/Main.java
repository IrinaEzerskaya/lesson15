package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        Basket myShopBasket = new Basket();

        myShopBasket.addProduct("item 1", 100);
        myShopBasket.addProduct("item 2", 200);
        myShopBasket.addProduct("item 3", 300);

        List<String> items = myShopBasket.getProducts();
        System.out.println("Товары в корзине");
        System.out.println(items);

        System.out.println("Кол-во товара item 2 до обновления");
        System.out.println(myShopBasket.getProductQuantity("item 2"));

        myShopBasket.updateProductQuantity("item 2", 250);

        System.out.println("Кол-во товара item 2 после обновления");
        System.out.println(myShopBasket.getProductQuantity("item 2"));

        myShopBasket.removeProduct("item 2");
        System.out.println("Удалили item 2");
        System.out.println(myShopBasket.getProducts());

        System.out.println("Кол-во товаров после очистки корзины");
        myShopBasket.clear();
        System.out.println(myShopBasket.getProducts());
    }
}
