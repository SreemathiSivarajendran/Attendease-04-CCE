module com.example.attendease {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.attendease to javafx.fxml;
    exports com.example.attendease;
}