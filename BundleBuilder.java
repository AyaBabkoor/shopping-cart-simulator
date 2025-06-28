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
 * This class builds a product bundle by adding different types of products to it.
 * It provides methods to add specific products and reset the bundle.
 */
public class BundleBuilder {
    /**
     * The product bundle being built.
     */
    private ProductBundle bundle;

    /**
     * Resets the bundle and initializes a new one with the name "Custom Bundle".
     */
    public void reset() {
        bundle = new ProductBundle("Custom Bundle"); // Initialize a new bundle with the default name
    }

    /**
     * Adds a MacBook to the product bundle.
     */
    public void addMacbook() {
        bundle.add(new SingleProduct("MacBook Pro 14\"", 8499)); // Adds a MacBook Pro to the bundle
    }

    /**
     * Adds an iPhone to the product bundle.
     */
    public void addIphone() {
        bundle.add(new SingleProduct("iPhone 16 Pro", 5499)); // Adds an iPhone to the bundle
    }

    /**
     * Adds an iPad to the product bundle.
     */
    public void addIpad() {
        bundle.add(new SingleProduct("iPad Air", 2999)); // Adds an iPad to the bundle
    }

    /**
     * Adds AirPods to the product bundle.
     */
    public void addAirpods() {
        bundle.add(new SingleProduct("AirPods Pro", 999)); // Adds AirPods Pro to the bundle
    }

    /**
     * Adds a Magic Keyboard to the product bundle.
     */
    public void addKeyboard() {
        bundle.add(new SingleProduct("Magic Keyboard", 899)); // Adds a Magic Keyboard to the bundle
    }

    /**
     * Adds a Magic Mouse to the product bundle.
     */
    public void addMouse() {
        bundle.add(new SingleProduct("Magic Mouse", 499)); // Adds a Magic Mouse to the bundle
    }

    /**
     * Adds an Apple Pencil to the product bundle.
     */
    public void addPencil() {
        bundle.add(new SingleProduct("Apple Pencil", 499)); // Adds an Apple Pencil to the bundle
    }

    /**
     * Finalizes the bundle by setting its name and price.
     * 
     * @param name The name to be given to the bundle.
     * @return The fully constructed product bundle.
     */
    public ProductComponent build(String name) {
        bundle.setName(name + " - Total: " + bundle.getPrice() + " SAR"); // Set the final name and price for the bundle
        return bundle;
    }
}