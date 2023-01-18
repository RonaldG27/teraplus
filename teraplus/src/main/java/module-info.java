module com.proyect.proyectosegupol {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.proyect.proyectosegupol to javafx.fxml;
    exports com.proyect.proyectosegupol;
}