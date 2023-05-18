module button {
    requires javafx.controls;
    requires javafx.fxml;

    opens ProjectP3 to javafx.fxml;
    exports ProjectP3;
}
