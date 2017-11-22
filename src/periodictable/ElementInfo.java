/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodictable;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author nicholaszoellner
 */
@XmlRootElement (name = "element")
public class ElementInfo {
    
    private int atomicNumber;
    private String atomicSymbol;
    private String atomicMass;
    private String elementName;
    private String density;
    private String meltingPoint;
    private String boilingPoint;
    private int id;
    
    public int getAtomicNumber() {
        return atomicNumber;
    }
    
    public String getAtomicSymbol() {
        return atomicSymbol;
    }
    
    public String getAtomicMass() {
        return atomicMass;
    }
    
    public String getElementName() {
        return elementName;
    }
    
    public String getDensity() {
        return density;
    }
    
    public String getMeltingPoint() {
        return meltingPoint;
    }
    
    public String getBoilingPoint() {
        return boilingPoint;
    }
    
    public int getId() {
        return id;
    }
    
    @XmlElement (name = "atomicnumber")
    public void setAtomicNumber(int atomicNumber) {
        this.atomicNumber = atomicNumber;
    }
    
    @XmlElement (name = "atomicsymbol")
    public void setAtomicSymbol(String atomicSymbol) {
        this.atomicSymbol = atomicSymbol;
    }
    
    @XmlElement (name = "atomicmass")
    public void setAtomicMass(String atomicMass) {
        this.atomicMass = atomicMass;
    }
    
    @XmlElement (name = "elementname")
    public void setElementName(String elementName) {
        this.elementName = elementName;
    }
    
    @XmlElement (name = "density")
    public void setDensity(String density) {
        this.density = density;
    }
    
    @XmlElement (name = "meltingpoint")
    public void setMeltingPoint(String meltingPoint) {
        this.meltingPoint = meltingPoint;
    }
    
    @XmlElement (name = "boilingpoint")
    public void setBoilingPoint(String boilingPoint) {
        this.boilingPoint = boilingPoint;
    }
    
    @XmlAttribute
    public void setId(int id) {
        this.id = id;
    }
    
}
