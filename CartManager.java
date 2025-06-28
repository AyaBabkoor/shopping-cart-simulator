/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.shopping;


/**
 * Name, ID:-
 * Samar Asiri, 444000717
 * Rema Al-Ghamdi, 444001279
 * Aya Babkoor, 444002180
 * Raghad Al-Subhi, 444003965
 * 
 * Groub: 1
 */

import java.util.ArrayList;
import java.util.List;

/**
 * This class is responsible for managing the shopping cart.
 * It follows the Singleton pattern to ensure only one instance of the cart exists.
 */
public class CartManager {
    
    /**
     * The singleton instance of CartManager.
     */
    private static CartManager instance;
    
    /**
     * The list that stores the products added to the cart.
     */
    private List<ProductComponent> cart = new ArrayList<>();

    /**
     * Private constructor to prevent direct instantiation of CartManager.
     * It ensures that the class follows the Singleton pattern.
     */
    private CartManager() {}

    /**
     * Returns the single instance of CartManager.
     * If the instance doesn't exist yet, it creates a new one.
     *
     * @return The singleton instance of CartManager.
     */
    public static CartManager getInstance() {
        if (instance == null) {
            instance = new CartManager(); // Creates a new instance if none exists
        }
        return instance;
    }

    /**
     * Adds a product to the shopping cart.
     *
     * @param product The product to be added to the cart.
     */
    public void addToCart(ProductComponent product) {
        cart.add(product); // Adds the product to the cart list
    }

    /**
     * Returns the list of products in the cart.
     *
     * @return The list of products currently in the cart.
     */
    public List<ProductComponent> getCart() {
        return cart; // Returns the cart list
    }

    /**
     * Calculates the total price of all products in the cart.
     *
     * @return The total price of the products in the cart.
     */
    public double getTotal() {
        return cart.stream().mapToDouble(ProductComponent::getPrice).sum(); // Sums the price of all products in the cart
    }

    /**
     * Clears all items from the cart.
     */
    public void clearCart() {
        cart.clear(); // Clears all products from the cart
    }
}