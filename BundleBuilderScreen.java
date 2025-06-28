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
 * This class represents the graphical user interface (GUI) for building an Apple product bundle.
 * It allows users to select products and add them to their shopping cart.
 */
public class BundleBuilderScreen {
    
    /**
     * An instance of the BundleBuilder class responsible for creating the product bundles.
     */
    private BundleBuilder builder = new BundleBuilder();

    /**
     * Starts the main screen for building a product bundle.
     * Initializes all GUI components and defines their actions.
     *
     * @param primaryStage The primary stage for the JavaFX application.
     */
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Bundle Builder");

        // Creating checkboxes for selecting products
        CheckBox macbookBox = new CheckBox("MacBook Pro 14\" (8,499 SAR)");
        CheckBox iphoneBox = new CheckBox("iPhone 16 Pro (5,499 SAR)");
        CheckBox ipadBox = new CheckBox("iPad Air (2,999 SAR)");
        CheckBox airpodsBox = new CheckBox("AirPods Pro (999 SAR)");
        CheckBox keyboardBox = new CheckBox("Magic Keyboard (899 SAR)");
        CheckBox mouseBox = new CheckBox("Magic Mouse (499 SAR)");
        CheckBox pencilBox = new CheckBox("Apple Pencil (499 SAR)");

        // Creating buttons for building the bundle and navigating back to the main screen
        Button buildButton = new Button("Build Bundle");
        Button backButton = new Button("Back to Main");
        
        // Label to show the result after building the bundle
        Label resultLabel = new Label("No bundle created yet.");

        // Styling for the buttons
        String buttonStyle = "-fx-border-color: #1a237e; -fx-border-width: 2; " +
                "-fx-background-color: transparent; -fx-text-fill: #1a237e; " +
                "-fx-font-weight: bold; -fx-font-size: 14px; -fx-pref-width: 250px; -fx-pref-height: 45px; " +
                "-fx-background-radius: 15px;";
        
        buildButton.setStyle(buttonStyle);
        backButton.setStyle(buttonStyle);

        // Action for the build button
        buildButton.setOnAction(e -> {
            builder.reset(); // Reset the bundle builder to start fresh
            boolean isAnySelected = false;

            // Check if any product is selected, and add it to the bundle
            if (macbookBox.isSelected()) { builder.addMacbook(); isAnySelected = true; }
            if (iphoneBox.isSelected()) { builder.addIphone(); isAnySelected = true; }
            if (ipadBox.isSelected()) { builder.addIpad(); isAnySelected = true; }
            if (airpodsBox.isSelected()) { builder.addAirpods(); isAnySelected = true; }
            if (keyboardBox.isSelected()) { builder.addKeyboard(); isAnySelected = true; }
            if (mouseBox.isSelected()) { builder.addMouse(); isAnySelected = true; }
            if (pencilBox.isSelected()) { builder.addPencil(); isAnySelected = true; }

            // If at least one item is selected, build the bundle and add it to the cart
            if (isAnySelected) {
                ProductComponent bundle = builder.build("Apple Bundle");
                CartManager.getInstance().addToCart(bundle);
                resultLabel.setText("Bundle added to cart: " + bundle.getName());
            } else {
                // If no item is selected, display a message
                resultLabel.setText("Please select at least one item");
            }
        });

        // Action for the back button, which returns to the main screen
        backButton.setOnAction(e -> new MainScreen().start(primaryStage));

        // Arranging the components in a vertical layout
        VBox box = new VBox(10,
                new Label("Create Your Apple Bundle:"), macbookBox, iphoneBox, ipadBox, airpodsBox,
                keyboardBox, mouseBox, pencilBox, buildButton, resultLabel, backButton);

        box.setStyle("-fx-padding: 20; -fx-background-color: #f0fcfa;");
        
        // Setting the scene and displaying the primary stage
        Scene scene = new Scene(box, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}