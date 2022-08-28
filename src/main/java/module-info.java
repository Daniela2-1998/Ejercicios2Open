module com.example.ejercicios2open {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejercicios2open to javafx.fxml;
    exports com.example.ejercicios2open;
}