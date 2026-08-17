package com.csc360;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class App extends Application {

    @Override
    public void start(Stage primaryStage) {
        Rectangle square = new Rectangle(200, 200);   // width, height — equal = square
        square.setFill(Color.TRANSPARENT);
        square.setStroke(Color.LIGHTPINK);
        square.setStrokeWidth(6);

        // Fix the square's position in the center of the window (stays put)
        square.setLayoutX(300);
        square.setLayoutY(200);

        Group root = new Group(square);
        Scene scene = new Scene(root, 800, 600, Color.WHITESMOKE);

        // SCALING: zoom in/out with the scroll wheel
        scene.setOnScroll(event -> {
            double zoomFactor = event.getDeltaY() > 0 ? 1.1 : 0.9;
            square.setScaleX(square.getScaleX() * zoomFactor);
            square.setScaleY(square.getScaleY() * zoomFactor);
        });

        primaryStage.setTitle("Square - Scroll to Zoom");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}