module com.example.java_practice {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.java_practice to javafx.fxml;
    exports com.example.java_practice;
}