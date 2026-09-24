package com.example.hellofx;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class HelloJavaFX extends Application {

    @Override
    public void start(Stage stage) {

        Label message = new Label("Welcome, Daniel Malundu!");

        Button startButton = new Button("Start");

        Button resetButton = new Button("Reset");

        startButton.setOnAction(event ->
                message.setText("Great! You clicked Start.")
        );

        resetButton.setOnAction(event ->
                message.setText("Welcome to JavaFX!")
        );

        VBox layout = new VBox(20);

        layout.setAlignment(Pos.CENTER);

        layout.getChildren().addAll(
                message,
                startButton,
                resetButton
        );

        Scene scene = new Scene(layout, 500, 300);

        stage.setTitle("JavaFX Lab - Student 202501510");

        stage.setScene(scene);

        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}