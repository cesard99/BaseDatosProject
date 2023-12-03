package controller;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrincpalController {
 private Stage stage;
 private int numero ;
    @FXML
    private Button btn1;


    public void setStage(Stage stage) {
        this.stage=stage;
    }
}
