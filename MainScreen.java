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
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * This class represents the main screen of the Card Store application.
 * It provides buttons for navigating to different sections of the application.
 */
public class MainScreen {

    /**
     * Sets up the main screen of the application, including buttons and logo.
     * It initializes the buttons for navigating to Products, Bundle Builder, and Cart views.
     * 
     * @param primaryStage The main stage for the JavaFX application.
     */
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Card Store"); // Set the window title

        // Create buttons for different actions
        Button productBtn = new Button("Products");
        Button bundleBtn = new Button("Bundle Builder");
        Button cartBtn = new Button("View Cart");

        // Styling for the buttons
        String buttonStyle = "-fx-border-color: #1a237e; -fx-border-width: 2; " +
                "-fx-background-color: transparent; -fx-text-fill: #1a237e; " +
                "-fx-font-weight: bold; -fx-font-size: 14px; " +
                "-fx-pref-width: 250px; -fx-pref-height: 45px; " +
                "-fx-background-radius: 15px;";

        // Apply the style to the buttons
        productBtn.setStyle(buttonStyle);
        bundleBtn.setStyle(buttonStyle);
        cartBtn.setStyle(buttonStyle);

        // Set actions for each button to open the corresponding screens
        productBtn.setOnAction(e -> new ProductScreen().start(primaryStage));
        bundleBtn.setOnAction(e -> new BundleBuilderScreen().start(primaryStage));
        cartBtn.setOnAction(e -> new SummaryScreen().start(primaryStage));

        // Load the logo image and display it in the window
        Image logo = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRUq8x-JJh_CP69GAukcdagiDNvsq1c9Je1K1MFmWfPZJuAXOdhY0298hm6ZjIIp-ThgHk&usqp=CAU");
        ImageView logoView = new ImageView(logo);
        logoView.setFitWidth(150); // Set the width of the logo
        logoView.setPreserveRatio(true); // Maintain the aspect ratio of the logo

        // Arrange the elements vertically in the VBox layout
        VBox root = new VBox(20, logoView, productBtn, bundleBtn, cartBtn);
        root.setStyle("-fx-padding: 30; -fx-alignment: center; -fx-background-color: #f0fcfa;");

        // Create the scene and set it on the primary stage
        Scene scene = new Scene(root, 600, 500);
        primaryStage.setScene(scene);
        primaryStage.show(); // Show the stage (main window)
    }
}