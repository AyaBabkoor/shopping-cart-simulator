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
 * This class represents a command to remove a product from the shopping cart.
 * It implements the Command interface to support execute and undo operations.
 */
public class RemoveFromCartCommand implements Command {

    /**
     * The product to be removed from the cart.
     */
    private ProductComponent product;

    /**
     * The cart from which the product will be removed.
     */
    private List<ProductComponent> cart;

    /**
     * Constructor to initialize the command with the product to remove and the cart to modify.
     * 
     * @param product The product to be removed from the cart.
     * @param cart The cart from which the product will be removed.
     */
    public RemoveFromCartCommand(ProductComponent product, List<ProductComponent> cart) {
        this.product = product;
        this.cart = cart; // Store the product and cart references
    }

    /**
     * Executes the command by removing the specified product from the cart.
     */
    @Override
    public void execute() {
        cart.remove(product); // Removes the product from the cart
    }

    /**
     * Undoes the command by adding the previously removed product back into the cart.
     */
    @Override
    public void undo() {
        cart.add(product); // Adds the product back to the cart
    }
}