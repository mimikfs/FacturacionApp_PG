module ni.edu.uam.sistemafacturacion {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires static lombok;

    // Exportar y abrir paquetes a JavaFX
    opens ni.edu.uam.sistemafacturacion to javafx.fxml;
    opens ni.edu.uam.sistemafacturacion.controller to javafx.fxml;
    opens ni.edu.uam.sistemafacturacion.model to javafx.base;

    exports ni.edu.uam.sistemafacturacion;
    exports ni.edu.uam.sistemafacturacion.controller;
    exports ni.edu.uam.sistemafacturacion.model;
}