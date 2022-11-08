module com.systemerp.systemerp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.systemerp.systemerp to javafx.fxml;
    exports com.systemerp.systemerp;
}