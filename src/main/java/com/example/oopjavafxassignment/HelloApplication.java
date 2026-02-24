package com.example.oopjavafxassignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;


import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Menu fileMenu = new Menu("File");
        Menu editMenu = new Menu("Edit");
        Menu themeMenu = new Menu("Theme");
        Menu helpMenu = new Menu("Help");

        MenuBar mb = new MenuBar();
        mb.getMenus().add(fileMenu);
        mb.getMenus().add(editMenu);
        mb.getMenus().add(themeMenu);
        mb.getMenus().add(helpMenu);

        VBox vb = new VBox(mb);

        Scene scene = new Scene(vb, 320, 240);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }
}
