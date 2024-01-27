package org.example.hw;

public interface VendingMachine {
    /**
     * Внесение продуктов в торговый автомат
     */
    void initProduct();

    /**
     * Получение продукта из торгового автомата
     *
     * @return строку
     */
    String getProduct();
}
