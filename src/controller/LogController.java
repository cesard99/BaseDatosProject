package controller;
import javafx.scene.image.Image;
import java.io.IOException;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
    private Label lblErrorPass;

    @FXML
    private Label lblErrorUssers;

    @FXML
    private Button btnAccept;

    @FXML
    private Button btnCancel;


    public void setStage(Stage primaryStage) {
        stage=primaryStage;
    }

    public Stage getStage(){
        
        return this.stage ;
    }
    public void show() {
        stage.show();
    }

     @FXML
    public  void closeWindows(ActionEvent event) {
        
        stage.close();
        
    }
     public void ocultarLbl(){
        lblErrorPass.setVisible(false);
        lblErrorUssers.setVisible(false);
    }

    @FXML
   public  void showWindowsPrincipal() throws IOException {
        try{
            if(verify()){
        FXMLLoader loader =new FXMLLoader(getClass().getResource("/view/WindPrincipal.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage stage = new Stage ();
        PrincpalController controller = loader.getController();
        stage.setScene(scene); 
        stage.setTitle("Ventana Principal");
        Image icon = new Image ("/img/bandera.png");
        stage.getIcons().add(icon);    
        String css=this.getClass().getResource("/style/stylePrincp.css").toExternalForm();
        scene.getStylesheets().add(css);
        controller.init(stage , this );
        stage.show();
        this.stage.close();
        }
            
        
        
        
        
        }catch(Exception e){
            e.printStackTrace();
        }

    }

   
      public boolean verify(){
        boolean bandera = false;
        if(txtFieldName.getText().equals("Cesar")|| txtFieldName.getText().equals("Raul")){
            if(txtFieldPass.getText().equals("cesar123") || txtFieldPass.getText().equals("raul123")){
                bandera=true;
            } lblErrorPass.setVisible(true);
        }lblErrorUssers.setVisible(true);
        
        

        return bandera;
      }

    




}

    


