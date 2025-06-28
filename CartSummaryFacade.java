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
 * This class provides a simplified interface to generate a summary of the shopping cart.
 * It retrieves the cart contents and formats the details into a readable string.
 */
public class CartSummaryFacade {

    /**
     * Generates a summary of the products in the cart, including the total price.
     * 
     * @return A string containing the list of products and the total price.
     */
    public String generateSummary() {
        List<ProductComponent> cart = CartManager.getInstance().getCart(); // Get the list of products in the cart
        if (cart.isEmpty()) return "Your cart is empty."; // If the cart is empty, return a message

        StringBuilder sb = new StringBuilder(); // StringBuilder for efficiently building the summary string
        sb.append("CART SUMMARY:\n\n");
        double total = 0; // Variable to accumulate the total price of items
        int count = 1; // Counter to number the items in the cart

        // Iterate over each item in the cart and append the item details to the summary
        for (ProductComponent item : cart) {
            sb.append(count++) // Number the items
              .append(". ")
              .append(item.getName()) // Append the product name
              .append(" - ").append(item.getPrice()) // Append the product price
              .append(" SAR\n"); // Append the price in SAR
            total += item.getPrice(); // Add the product price to the total
        }

        // Append the total price at the end of the summary
        sb.append("\nTOTAL: ").append(String.format("%.2f", total)) // Format the total to two decimal places
          .append(" SAR");
        return sb.toString(); // Return the final summary string
    }
}