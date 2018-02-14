/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodictable;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author nzoel
 */
public class FXMLDocumentController implements Initializable {
    
    public static int nodeId;
    public static Paint color;
    private String path = "elementInfo.xml";
    private File f;
    private String fileWebPage = "https://raw.githubusercontent.com/nzoellner1384/ImportantFiles/master/elementInfo.xml";
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        f = new File(path);
        try {
            if (!f.exists()) {
                 URL fileURL = new URL(fileWebPage);
                 InputStream input = fileURL.openStream();
                 FileOutputStream output = new FileOutputStream(f);
                 byte[] buffer = new byte[4096];
                 int n = 0;
                 while(-1 != (n = input.read(buffer)))
                     output.write(buffer, 0, n);
                 input.close();
                 output.close();
                 System.out.println("File downloaded...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    
    }    

    //The method that is ran after the button is pushed
    @FXML
    private void button_Click(ActionEvent event) throws Throwable {
        
        //Grabbing the id of the button corisponding to the element atomic number
        nodeId = Integer.parseInt(((Node) event.getSource()).getId().trim());
        
        //Grabs the parent of the button
        GridPane gp = (GridPane) ((Node) event.getTarget()).getParent();
        
        //Gets a list of all the Grid's children
        ObservableList<Node> c = gp.getChildren();
        
        //Grabs the rectangle used to give each element its border and color
        Rectangle r = (Rectangle) c.get(0);
        
        //Grabs the color of the rectangle
        color = r.getFill();
        
        try{
            
            //Getting the stuff ready to read the xml file
            JAXBContext j = JAXBContext.newInstance(TableInfo.class);
            Unmarshaller um = j.createUnmarshaller();
            
            //Putting all the info from the file into an object
            TableInfo ti = (TableInfo) um.unmarshal(f);
            
            //taking the stuff from the object and putting it into an arraylist
            ArrayList<ElementInfo> ei = ti.getElements();
            
            //Preparing and opening the new window for the element selected
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InfoWindow.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            
            //Setting the window title with the name of the element selected
            for (ElementInfo e : ei) {
                if (e.getId() == nodeId) {
                    stage.setTitle(e.getElementName());
                }
            }
            
            //Showing the window
            stage.show();
        } catch (Exception e) {
            //An alert box with some info about the error
            Alert a = new Alert(AlertType.ERROR);
            a.setTitle("Error!");
            a.setHeaderText("The programmer was a moron and forgot to make sure that this would not happen.");
            a.setContentText("Java error output: ");
            
            StringWriter sw = new StringWriter();
            PrintWriter pw = new PrintWriter(sw);
            e.printStackTrace(pw);
            
            String exceptionText = sw.toString();
            
            TextArea textArea = new TextArea(exceptionText);
            textArea.setEditable(false);
            textArea.setWrapText(true);
            
            textArea.setMaxWidth(Double.MAX_VALUE);
            textArea.setMaxHeight(Double.MAX_VALUE);
            GridPane.setVgrow(textArea, Priority.ALWAYS);
            GridPane.setHgrow(textArea, Priority.ALWAYS);
            
            GridPane expContent = new GridPane();
            expContent.setMaxWidth(Double.MAX_VALUE);
            expContent.add(textArea, 0, 0);
            
            a.getDialogPane().setExpandableContent(expContent);
            a.show();
        }
    }
    
    private static boolean isRedirected (Map<String, List<String>> header) {
        for (String hv : header.get(null)) {
            if (hv.contains("301") || hv.contains("302"))
                return true;
        }
        return false;
    }
    
}
