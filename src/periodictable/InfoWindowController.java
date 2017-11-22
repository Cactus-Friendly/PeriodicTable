/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodictable;

import java.io.File;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.scene.shape.Rectangle;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 * FXML Controller class
 *
 * @author nicholaszoellner
 */
public class InfoWindowController implements Initializable {

    //All the lables that display the info of the element
    @FXML
    private Label atomicNumber;
    @FXML
    private Label symbol;
    @FXML
    private Label atomicMass;
    @FXML
    private Label name;
    @FXML
    private Label atomicNumberSmall;
    @FXML
    private Label atomicMassSmall;
    @FXML
    private Label meltingPoint;
    @FXML
    private Label boilingPoint;
    @FXML
    private Label density;
    @FXML
    private Rectangle frame;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        //The path and the file object
        String path = "elementInfo.xml";
        File f = new File(path);
        
        try {
            
            //Preparing the xml file reader
            JAXBContext j = JAXBContext.newInstance(TableInfo.class);
            Unmarshaller um = j.createUnmarshaller();
            
            //Putting the xml file info into and object
            TableInfo ti = (TableInfo) um.unmarshal(f);
            
            //Taking the info from the object and stroing into an arraylist
            ArrayList<ElementInfo> ei = ti.getElements();
            
            //Loop through the arraylist for the element that was clicked and putting it into the labels
            for (ElementInfo i : ei) {
                if (i.getId() == FXMLDocumentController.nodeId) {
                    atomicNumber.setText(String.format("%d", i.getAtomicNumber()));
                    symbol.setText(i.getAtomicSymbol());
                    name.setText(i.getElementName());
                    atomicNumberSmall.setText(String.format("%d", i.getAtomicNumber()));
                    atomicMassSmall.setText(i.getAtomicMass());
                    atomicMass.setText(i.getAtomicMass());
                    meltingPoint.setText(i.getMeltingPoint());
                    boilingPoint.setText(i.getBoilingPoint());
                    density.setText(i.getDensity());
                    frame.setFill(FXMLDocumentController.color);
                }
            }
            
        } catch (JAXBException e) {
            //An alert box with some info about the error
            Alert a = new Alert(Alert.AlertType.ERROR);
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
    
}
