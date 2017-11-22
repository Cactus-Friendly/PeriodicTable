/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodictable;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

/**
 *
 * @author nzoel
 */
public class PeriodicTable extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        //Getting ready to start the main window
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
        
        //Setting the scene for the main window
        Scene scene = new Scene(root);
        
        //Getting the stage ready for the window
        stage.setScene(scene);
        stage.setResizable(false);
        stage.setTitle("Periodic Table");
        stage.show();
        
        //Closing the WHOLE program when the close button is pressed (even all the element windows that are open).
        stage.setOnCloseRequest(new EventHandler<WindowEvent>() {
          public void handle(WindowEvent we) {
              System.exit(0);
          }
        });
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
