module com.example.podhoranyidonat_szamologep {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.podhoranyidonat_szamologep to javafx.fxml;
    exports com.example.podhoranyidonat_szamologep;
}