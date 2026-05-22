package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import java.awt.*;
import javafx.geometry.Pos;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {
        //Crear los botones
        Button buttonN = new Button("Norte");
        Button buttonS = new Button("Sur");
        Button buttonE = new Button("Este");
        Button buttonO = new Button("Oeste");
        Button buttonC = new Button("Centro");

        BorderPane borderPane = new BorderPane();
        //Alinear los botones para que esten en el medio
        BorderPane.setAlignment(buttonN, Pos.CENTER);
        BorderPane.setAlignment(buttonS, Pos.CENTER);
        BorderPane.setAlignment(buttonO, Pos.CENTER);
        BorderPane.setAlignment(buttonE, Pos.CENTER);

        //Asignar los botones al pane
        borderPane.setCenter(buttonC);
        borderPane.setTop(buttonN);
        borderPane.setBottom(buttonS);
        borderPane.setLeft(buttonO);
        borderPane.setRight(buttonE);

        //Mostrar la ventana
        Scene scene = new Scene(borderPane, 300, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
