package com.labreport.topic10;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class JavaFXButton extends Application {
    public void start(Stage stage) {
        Button btn = new Button("Click Me!");
        btn.setOnAction(e -> System.out.println("Hello, JavaFX!"));
        stage.setScene(new Scene(btn, 200, 100));
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}

