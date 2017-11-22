/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodictable;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author nzoel
 */
public class FXMLDocumentController implements Initializable {
    
    public static int nodeId;
    public static Paint color;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void button_Click(ActionEvent event) {
        String path = "elementInfo.xml";
        nodeId = Integer.parseInt(((Node) event.getSource()).getId().trim());
        GridPane gp = (GridPane) ((Node) event.getTarget()).getParent();
        ObservableList<Node> c = gp.getChildren();
        Rectangle r = (Rectangle) c.get(0);
        color = r.getFill();
        File f = new File(path);
        
        try{
            
            JAXBContext j = JAXBContext.newInstance(TableInfo.class);
            Unmarshaller um = j.createUnmarshaller();
            
            TableInfo ti = (TableInfo) um.unmarshal(f);
            
            ArrayList<ElementInfo> ei = ti.getElements();
            
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InfoWindow.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            for (ElementInfo e : ei) {
                if (e.getId() == nodeId) {
                    stage.setTitle(e.getElementName());
                }
            }
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
