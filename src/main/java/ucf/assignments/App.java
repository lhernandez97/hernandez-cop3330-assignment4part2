package ucf.assignments;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solution
 *  Copyright 2021 Luis Hernandez
 */

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*
        *
        * Create an FXMLLoader class and receive the location of the ToDoList.fxml folder using the getResource() method
        * Create a Scene class and load the FXMLLoader to receive the fxml file
        * Set the title of the stage to "To-Do List Application"
        * Set the scene of the stage
        * Show the stage
         */
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource("ToDoList.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 733, 544);
        stage.setTitle("To-Do List Application");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        /*
        * Launch args
        */
        launch(args);
    }
}