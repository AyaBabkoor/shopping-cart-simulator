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
 * This is an abstract class that represents a generic product component.
 * It provides common methods for accessing product details and managing product components.
 * The methods are designed to be overridden by concrete product classes or bundles.
 */
public abstract class ProductComponent {

    /**
     * Returns the name of the product component.
     * This method is expected to be overridden by subclasses that represent specific products or bundles.
     * 
     * @return The name of the product component.
     * @throws UnsupportedOperationException If the method is not implemented by the subclass.
     */
    public String getName() {
        throw new UnsupportedOperationException(); // Throws an exception if not overridden
    }

    /**
     * Returns the price of the product component.
     * This method is expected to be overridden by subclasses that represent specific products or bundles.
     * 
     * @return The price of the product component.
     * @throws UnsupportedOperationException If the method is not implemented by the subclass.
     */
    public double getPrice() {
        throw new UnsupportedOperationException(); // Throws an exception if not overridden
    }

    /**
     * Adds a product component to this component.
     * This method is typically used in composite structures like product bundles.
     * 
     * @param component The product component to be added.
     * @throws UnsupportedOperationException If the method is not implemented by the subclass.
     */
    public void add(ProductComponent component) {
        throw new UnsupportedOperationException(); // Throws an exception if not overridden
    }

    /**
     * Removes a product component from this component.
     * This method is typically used in composite structures like product bundles.
     * 
     * @param component The product component to be removed.
     * @throws UnsupportedOperationException If the method is not implemented by the subclass.
     */
    public void remove(ProductComponent component) {
        throw new UnsupportedOperationException(); // Throws an exception if not overridden
    }
}