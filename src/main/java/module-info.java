module com.example.oopjavafxassignment {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.oopjavafxassignment to javafx.fxml;
    exports com.example.oopjavafxassignment;
}