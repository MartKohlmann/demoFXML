module com.example.demofxml {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.demofxml to javafx.fxml;
    exports com.example.demofxml;
}