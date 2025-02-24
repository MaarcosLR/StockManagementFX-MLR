package com.example.stock;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {


    @Override
    public void start(Stage stage) throws Exception {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/ProductView.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stage.setTitle("Stock Management Application");
            stage.setScene(scene);
            stage.show();
        } catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        launch(args);
    }
}
