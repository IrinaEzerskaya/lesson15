package com.company;

import java.util.ArrayList;
import java.util.List;

interface BasketInterface {

    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String product);

}

public class Basket implements BasketInterface {

    // Список товаров в корзине
    List<Product> basketItems = new ArrayList<Product>();

    // Внутренний метод поиска товара в списке по имени
    private Product getProductByName(String pname) {
        Product result = null;
        for (Product prod: this.basketItems) {
            if (prod.name.equals(pname)) {
                result = prod;
                break;
            }
        }
        return result;
    }

    // Добавить товар в корзину
    public void addProduct(String product, int quantity)
    {
        Product newItem = new Product(product, quantity);
        basketItems.add(newItem);
    }

    // Удалить товар из корзины
    public void removeProduct(String product)
    {
        Product prod = getProductByName(product);
        basketItems.remove(prod);
    }

    // Обновить кол-во товара
    public void updateProductQuantity(String product, int quantity)
    {
        Product prod = getProductByName(product);
        int index = basketItems.indexOf(prod);
        prod.quantity = quantity;
        basketItems.set(index, prod);
    }

    // Очистить корзину
    public void clear()
    {
        basketItems.clear();
    }

    // Получить список названий товаров
    public List<String> getProducts()
    {
        List<String> result = new ArrayList<>();

        for (Product prod: basketItems) {
            result.add(prod.name);
        }

        return result;
    }

    // Получить кол-во товара по названию
    public int getProductQuantity(String product)
    {
        Product prod = getProductByName(product);
        return prod.quantity;
    }
}
