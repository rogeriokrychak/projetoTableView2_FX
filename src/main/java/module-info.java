module com.example.projetotableview {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projetotableview to javafx.fxml;
    exports com.example.projetotableview;
}