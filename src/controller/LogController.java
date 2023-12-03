package controller;
import javafx.scene.image.Image;
import java.io.IOException;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LogController{
    private Stage stage;

    @FXML
    private TextField txtFieldName;

    @FXML
    private PasswordField txtFieldPass;

    @FXML
    private Button btnAccept;

    @FXML
    private Button btnCancel;


    public void setStage(Stage primaryStage) {
        stage=primaryStage;
    }

    @FXML
    void showWindowsPrincipal() throws IOException {
        try{
            if(verify()){
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/visual/WindPrincipal.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage ();
        stage.setScene(scene); 
        stage.setTitle("Ventana Principal");
        Image icon = new Image ("/img/bandera.png");
        stage.getIcons().add(icon);    
        String css=this.getClass().getResource("/visual/application.css").toExternalForm();
        scene.getStylesheets().add(css);
        stage.show();
        this.stage.close();
        }
        
        /*esto es para la prueba del commit */
        
        }catch(Exception e){
            e.printStackTrace();
        }

    }

   
      public boolean verify(){
        boolean bandera = false;
        if(txtFieldName.getText().equals("Cesar") || txtFieldName.getText().equals("Raul")
        && txtFieldPass.getText().equals("cesar12") || txtFieldPass.getText().equals("Raul12"))
        bandera=true;
        else
        bandera=false;

        return bandera;
      }


}

    


