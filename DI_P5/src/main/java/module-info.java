module DI_P5.DI_P5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens DI_P5.DI_P5 to javafx.fxml;
    exports DI_P5.DI_P5;
}