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
 * This class represents a product bundle, which is a collection of multiple product components.
 * It extends the ProductComponent class to allow adding, removing, and calculating the total price of the bundle.
 */
public class ProductBundle extends ProductComponent {
    
    /**
     * The name of the product bundle.
     */
    private String name;

    /**
     * A list of components (products) included in the bundle.
     */
    private List<ProductComponent> components = new ArrayList<>();

    /**
     * Constructor to initialize the product bundle with a name.
     * 
     * @param name The name of the product bundle.
     */
    public ProductBundle(String name) {
        this.name = name; // Set the bundle name
    }

    /**
     * Sets the name of the product bundle.
     * 
     * @param name The new name of the bundle.
     */
    public void setName(String name) {
        this.name = name; // Update the name of the bundle
    }

    /**
     * Adds a product component to the bundle.
     * 
     * @param component The product component to be added.
     */
    @Override
    public void add(ProductComponent component) {
        components.add(component); // Add the component to the list of bundle components
    }

    /**
     * Removes a product component from the bundle.
     * 
     * @param component The product component to be removed.
     */
    @Override
    public void remove(ProductComponent component) {
        components.remove(component); // Remove the component from the list of bundle components
    }

    /**
     * Returns the name of the product bundle.
     * 
     * @return The name of the product bundle.
     */
    @Override
    public String getName() {
        return name; // Return the name of the bundle
    }

    /**
     * Calculates the total price of the product bundle by summing the prices of all included components.
     * 
     * @return The total price of the product bundle.
     */
    @Override
    public double getPrice() {
        return components.stream().mapToDouble(ProductComponent::getPrice).sum(); // Sum the prices of all components
    }

    /**
     * Returns a string representation of the product bundle, including its name and total price.
     * 
     * @return A string representation of the product bundle.
     */
    @Override
    public String toString() {
        return name + " - " + getPrice() + " SAR"; // Return the bundle name and total price as a formatted string
    }
}