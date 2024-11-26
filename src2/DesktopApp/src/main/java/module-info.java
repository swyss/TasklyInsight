module com.tasklyinsight.desktopapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;

    opens com.tasklyinsight.desktopapp to javafx.fxml;
    exports com.tasklyinsight.desktopapp;
}