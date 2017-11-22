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
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
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
        
        String path = "elementInfo.xml";
        File f = new File(path);
        
        try {
            
            JAXBContext j = JAXBContext.newInstance(TableInfo.class);
            Unmarshaller um = j.createUnmarshaller();
            
            TableInfo ti = (TableInfo) um.unmarshal(f);
            
            ArrayList<ElementInfo> ei = ti.getElements();
            
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
            e.printStackTrace();
        }
    }    
    
}
