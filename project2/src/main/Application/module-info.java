module com.project2.home.project2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.project2.home to javafx.fxml;
    exports com.project2.home;
}