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


import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * This class represents the screen where products can be viewed, added to the shopping cart, 
 * and removed from the cart. It provides functionality to interact with the shopping cart.
 */
public class ProductScreen {
    // Instance of CommandManager to handle the execution of commands like adding, removing, and undoing actions
    private CommandManager commandManager = new CommandManager();

    /**
     * Initializes the product screen, including the product list, cart list, and action buttons.
     * It also defines the layout and handles user interactions like adding/removing items from the cart and undoing actions.
     * 
     * @param primaryStage The primary stage for the JavaFX application.
     */
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Shopping Cart"); // Set the window title

        // ListView to display available products
        ListView<ProductComponent> productList = new ListView<>();
        // ListView to display products in the cart
        ListView<ProductComponent> cartList = new ListView<>();
        // Label to display the total price of the cart
        Label totalLabel = new Label("Total: 0.00 SAR");

        // Add products to the product list
        productList.getItems().addAll(
                new SingleProduct("MacBook Pro 14\"", 8499),
                new SingleProduct("iPhone 16 Pro", 5499),
                new SingleProduct("iPad Air", 2999),
                new SingleProduct("AirPods Pro", 999),
                new SingleProduct("Magic Keyboard", 899),
                new SingleProduct("Magic Mouse", 499),
                new SingleProduct("Apple Pencil", 499)
        );

        // Create buttons for adding, removing, undoing, and navigating back
        Button addButton = new Button("Add to Cart");
        Button removeButton = new Button("Remove from Cart");
        Button undoButton = new Button("Undo");
        Button backButton = new Button("Back to Main");

        // Button styling
        String buttonStyle = "-fx-border-color: #1a237e; -fx-border-width: 2; " +
                "-fx-background-color: transparent; -fx-text-fill: #1a237e; " +
                "-fx-font-weight: bold; -fx-font-size: 14px; " +
                "-fx-pref-width: 200px; -fx-pref-height: 40px; " +
                "-fx-background-radius: 15px;";

        // Apply the button style to each button
        addButton.setStyle(buttonStyle);
        removeButton.setStyle(buttonStyle);
        undoButton.setStyle(buttonStyle);
        backButton.setStyle(buttonStyle);

        // Action for the add button: adds selected product to the cart
        addButton.setOnAction(e -> {
            ProductComponent selected = productList.getSelectionModel().getSelectedItem();
            if (selected != null) {
                // Execute the command to add the selected product to the cart
                commandManager.executeCommand(new AddToCartCommand(selected, CartManager.getInstance().getCart()));
                // Update the cart and total after adding
                updateCart(cartList, totalLabel);
            }
        });

        // Action for the remove button: removes selected product from the cart
        removeButton.setOnAction(e -> {
            ProductComponent selected = cartList.getSelectionModel().getSelectedItem();
            if (selected != null) {
                // Execute the command to remove the selected product from the cart
                commandManager.executeCommand(new RemoveFromCartCommand(selected, CartManager.getInstance().getCart()));
                // Update the cart and total after removing
                updateCart(cartList, totalLabel);
            }
        });

        // Action for the undo button: undoes the last add/remove action
        undoButton.setOnAction(e -> {
            // Undo the last executed command
            commandManager.undoLastCommand();
            // Update the cart and total after undoing
            updateCart(cartList, totalLabel);
        });

        // Action for the back button: navigates back to the main screen
        backButton.setOnAction(e -> new MainScreen().start(primaryStage));

        // Layout for the left side (product list and add button)
        VBox left = new VBox(10, new Label("Available Products:"), productList, addButton);
        // Layout for the right side (cart list, total price, and action buttons)
        VBox right = new VBox(10, new Label("Your Cart:"), cartList, totalLabel, removeButton, undoButton, backButton);

        // Main layout using HBox to arrange the left and right sections
        HBox root = new HBox(20, left, right);
        root.setStyle("-fx-padding: 20; -fx-background-color: #f0fcfa;");

        // Create the scene and set it on the primary stage
        Scene scene = new Scene(root, 800, 500);
        primaryStage.setScene(scene);
        primaryStage.show(); // Show the stage (main window)
    }

    /**
     * Updates the cart list and total label based on the current cart contents.
     * 
     * @param cartList The ListView displaying the products in the cart.
     * @param totalLabel The label displaying the total price of the cart.
     */
    private void updateCart(ListView<ProductComponent> cartList, Label totalLabel) {
        // Update the cart list with the current items in the cart
        cartList.getItems().setAll(CartManager.getInstance().getCart());
        // Update the total label with the current total price of the cart
        totalLabel.setText("Total: " + String.format("%.2f", CartManager.getInstance().getTotal()) + " SAR");
    }
}