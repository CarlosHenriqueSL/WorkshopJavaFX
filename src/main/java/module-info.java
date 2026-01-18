module com.example.course {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.course to javafx.fxml;
    opens com.example.course.gui to javafx.fxml;
    exports com.example.course;
}