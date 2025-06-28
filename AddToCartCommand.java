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


import java.util.List;

/**
 * This class represents a command to add a product to the shopping cart.
 * It implements the Command interface to support execute and undo operations.
 */
public class AddToCartCommand implements Command {
    
    /**
     * The product to be added to the cart.
     */
    private ProductComponent product;
    
    /**
     * The cart list where the product will be added or removed.
     */
    private List<ProductComponent> cart;

    /**
     * Constructor that initializes the command with the product and the cart.
     * Stores references for later use in execute and undo methods.
     *
     * @param product The product to be added to the cart.
     * @param cart The shopping cart where the product will be added or removed.
     */
    public AddToCartCommand(ProductComponent product, List<ProductComponent> cart) {
        this.product = product;
        this.cart = cart; // store the cart reference to operate on it
    }

    /**
     * Executes the command by adding the product to the cart.
     */
    @Override
    public void execute() {
        cart.add(product);
    }

    /**
     * Undoes the command by removing the product from the cart.
     */
    @Override
    public void undo() {
        cart.remove(product);
    }
}