module com.example.course {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens com.example.course to javafx.fxml;
    opens com.example.course.gui to javafx.fxml;
    opens com.example.course.model.entities to javafx.base;

    exports com.example.course;
}
