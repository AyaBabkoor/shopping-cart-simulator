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



/**
 * This class represents a single product in the store.
 * It extends the ProductComponent class to provide the name and price for individual products.
 */
public class SingleProduct extends ProductComponent {
    
    /**
     * The name of the product.
     */
    private String name;
    
    /**
     * The price of the product.
     */
    private double price;

    /**
     * Constructor to initialize a single product with a name and price.
     * 
     * @param name The name of the product.
     * @param price The price of the product.
     */
    public SingleProduct(String name, double price) {
        this.name = name; // Set the name of the product
        this.price = price; // Set the price of the product
    }

    /**
     * Returns the name of the product.
     * 
     * @return The name of the product.
     */
    @Override
    public String getName() {
        return name; // Return the name of the product
    }

    /**
     * Returns the price of the product.
     * 
     * @return The price of the product.
     */
    @Override
    public double getPrice() {
        return price; // Return the price of the product
    }

    /**
     * Returns a string representation of the product, including its name and price.
     * 
     * @return A string in the format "Product Name - Price SAR".
     */
    @Override
    public String toString() {
        return name + " - " + price + " SAR"; // Return a formatted string representing the product
    }
}