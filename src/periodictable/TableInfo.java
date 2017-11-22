/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodictable;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nicholaszoellner
 */

@XmlRootElement (name = "table")
public class TableInfo {
    
    private ArrayList<ElementInfo> elementList;
    
    public ArrayList<ElementInfo> getElements() {
        return elementList;
    }
    
    @XmlElement (name = "element")
    public void setElements(ArrayList<ElementInfo> elementList) {
        this.elementList = elementList;
    }
    
}
