package com.systemerp.systemerp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application {

    private static final int WIDTH = 600;
    private static final int HEIGHT = 400;

    @Override
    public void start(Stage stage) throws IOException {
        Parent parent = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("login.fxml")));
        stage.setScene(new Scene(parent, WIDTH, HEIGHT));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}