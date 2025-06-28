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
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * This class represents the screen that displays the user's shopping cart summary.
 * It allows the user to view the cart contents, clear the cart, and navigate back to the main screen.
 */
public class SummaryScreen {
    
    /**
     * Initializes the summary screen, including the summary area, buttons, and event handling.
     * It provides functionality for loading the cart summary, clearing the cart, and returning to the main screen.
     * 
     * @param primaryStage The primary stage for the JavaFX application.
     */
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Your Cart"); // Set the window title

        // TextArea to display the cart summary
        TextArea summaryArea = new TextArea();
        summaryArea.setEditable(false); // Make the text area non-editable

        // Buttons for interacting with the cart
        Button loadButton = new Button("Load Summary");
        Button clearButton = new Button("Clear Cart");
        Button backButton = new Button("Back to Main");

        // Button styling
        String buttonStyle = "-fx-border-color: #1a237e; -fx-border-width: 2; " +
                "-fx-background-color: transparent; -fx-text-fill: #1a237e; " +
                "-fx-font-weight: bold; -fx-font-size: 14px; " +
                "-fx-pref-width: 200px; -fx-pref-height: 40px; " +
                "-fx-background-radius: 15px;";

        loadButton.setStyle(buttonStyle); // Apply style to the load button
        clearButton.setStyle(buttonStyle); // Apply style to the clear button
        backButton.setStyle(buttonStyle); // Apply style to the back button

        // Action for the load button: loads and displays the cart summary
        loadButton.setOnAction(e -> {
            CartSummaryFacade facade = new CartSummaryFacade(); // Create a facade to generate the summary
            summaryArea.setText(facade.generateSummary()); // Set the summary text in the text area
        });

        // Action for the clear button: clears the cart and the summary area
        clearButton.setOnAction(e -> {
            CartManager.getInstance().clearCart(); // Clear the cart contents
            summaryArea.clear(); // Clear the summary area
        });

        // Action for the back button: navigates back to the main screen
        backButton.setOnAction(e -> new MainScreen().start(primaryStage));

        // Layout for the summary screen using VBox
        VBox root = new VBox(10, new Label("Cart Summary:"), summaryArea, loadButton, clearButton, backButton);
        root.setStyle("-fx-padding: 20; -fx-background-color: #f0fcfa;");

        // Create the scene and set it on the primary stage
        Scene scene = new Scene(root, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.show(); // Show the stage (main window)
    }
}