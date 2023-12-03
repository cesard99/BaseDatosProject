import java.io.IOException;

import controller.LogController;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class main extends Application{

@Override
public void start(Stage primaryStage)throws IOException{
    try {
        
        FXMLLoader loader =new FXMLLoader();
        loader.setLocation(main.class.getResource("/visual/WindowLog.fxml"));
        Parent root= loader.load();
        Scene scene=new Scene(root);
        primaryStage.setScene(scene);
        LogController controller = loader.getController();
        primaryStage.setTitle("Ventana Login");
        Image icon = new Image("/img/iconLog.png");
        primaryStage.getIcons().add(icon);
        String css=this.getClass().getResource("/visual/application.css").toExternalForm();
        scene.getStylesheets().add(css);
        controller.setStage(primaryStage);

        
        primaryStage.show();
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}


public static void main(String [] args) {
    launch(args);
    
}



}