package controller;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class PrincpalController {
 private Stage stage;
 
 private LogController controllerLog;

    @FXML
    private Button btn1;

    @FXML
    private Button btn11;

    @FXML
    private Button btn12;

    @FXML
    private Button btn13;

    @FXML
    private Button btn14;

    @FXML
    private Button btn15;

    public void setStage(Stage stage) {
        this.stage=stage;
    }

    @FXML
    void showLogin(ActionEvent event) throws Exception {
        controllerLog.show();
        controllerLog.ocultarLbl();
        stage.close();
        
    }

    public void init(Stage stage2, LogController logController) {
        this.stage=stage2;
        this.controllerLog=logController;
    }
}
