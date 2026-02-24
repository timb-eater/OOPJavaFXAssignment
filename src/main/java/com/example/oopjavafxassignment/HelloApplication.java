package com.example.oopjavafxassignment;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.MenuBar;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;

import javafx.scene.control.TableView;
import javafx.scene.control.TableColumn;


import java.io.FileInputStream;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Menu fileMenu = new Menu("File");
        MenuItem openItem = new MenuItem("Open");
        fileMenu.getItems().add(openItem);

        Menu editMenu = new Menu("Edit");
        MenuItem copyItem = new MenuItem("Open");
        editMenu.getItems().add(copyItem);

        Menu themeMenu = new Menu("Theme");
        MenuItem themeItem = new MenuItem("Change theme");
        themeMenu.getItems().add(themeItem);

        Menu helpMenu = new Menu("Help");
        MenuItem helpItem = new MenuItem("Get help");
        helpMenu.getItems().add(helpItem);


        MenuBar mb = new MenuBar();
        mb.getMenus().add(fileMenu);
        mb.getMenus().add(editMenu);
        mb.getMenus().add(themeMenu);
        mb.getMenus().add(helpMenu);

        TableView table = new TableView();
        TableColumn idColumn = new TableColumn("ID");
        TableColumn firstnameColumn = new TableColumn("First Name");
        TableColumn lastnameColumn = new TableColumn("Last Name");
        TableColumn departmentColumn = new TableColumn("Department");
        TableColumn majorColumn = new TableColumn("Major");
        TableColumn emailColumn = new TableColumn("Email");

        table.getColumns().addAll(idColumn, firstnameColumn, lastnameColumn, departmentColumn, majorColumn, emailColumn);

        Image image1 = new Image(getClass().getResourceAsStream("images/icon.png"));
        ImageView imageView1 = new ImageView(image1);
        imageView1.setFitWidth(150);
        imageView1.setPreserveRatio(true);

        HBox hb = new HBox(imageView1, table);
        VBox vb = new VBox(mb, hb);

        Scene scene = new Scene(vb, 1024, 768);
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();

    }
}
