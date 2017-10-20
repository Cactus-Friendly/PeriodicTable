/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodictable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.stage.Stage;

/**
 *
 * @author nzoel
 */
public class FXMLDocumentController implements Initializable {
    
    public static String parent;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void button_Click(ActionEvent event) {
        parent = ((Node) event.getSource()).getParent().getId();
        try{
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("InfoWindow.fxml"));
            Parent root1 = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root1));
            stage.setResizable(false);
            switch (parent) {
                case "H":
                    stage.setTitle("Hydrogen");
                    stage.show();
                    break;
                case "He":
                    stage.setTitle("Helium");
                    stage.show();
                    break;
                case "Li":
                    stage.setTitle("Lithium");
                    stage.show();
                    break;
                case "Be":
                    stage.setTitle("Beryllium");
                    stage.show();
                    break;
                case "B":
                    stage.setTitle("Boron");
                    stage.show();
                    break;
                case "C":
                    stage.setTitle("Carbon");
                    stage.show();
                    break;
                case "N":
                    stage.setTitle("Nitrogen");
                    stage.show();
                    break;
                case "O":
                    stage.setTitle("Oxygen");
                    stage.show();
                    break;
                case "F":
                    stage.setTitle("Fluorine");
                    stage.show();
                    break;
                case "Ne":
                    stage.setTitle("Neon");
                    stage.show();
                    break;
                case "Na":
                    stage.setTitle("Sodium");
                    stage.show();
                    break;
                case "Mg":
                    stage.setTitle("Magnesium");
                    stage.show();
                    break;
                case "Al":
                    stage.setTitle("Aluminum");
                    stage.show();
                    break;
                case "Si":
                    stage.setTitle("Silicon");
                    stage.show();
                    break;
                case "P":
                    stage.setTitle("Phosphorus");
                    stage.show();
                    break;
                case "S":
                    stage.setTitle("Sulfur");
                    stage.show();
                    break;
                case "Cl":
                    stage.setTitle("Chlorine");
                    stage.show();
                    break;
                case "Ar":
                    stage.setTitle("Argon");
                    stage.show();
                    break;
                case "K":
                    stage.setTitle("Potassium");
                    stage.show();
                    break;
                case "Ca":
                    stage.setTitle("Calcium");
                    stage.show();
                    break;
                case "Sc":
                    stage.setTitle("Scandium");
                    stage.show();
                    break;
                case "Ti":
                    stage.setTitle("Titanium");
                    stage.show();
                    break;
                case "V":
                    stage.setTitle("Vanadium");
                    stage.show();
                    break;
                case "Cr":
                    stage.setTitle("Chromium");
                    stage.show();
                    break;
                case "Mn":
                    stage.setTitle("Manganese");
                    stage.show();
                    break;
                case "Fe":
                    stage.setTitle("Iron");
                    stage.show();
                    break;
                case "Co":
                    stage.setTitle("Cobalt");
                    stage.show();
                    break;
                case "Ni":
                    stage.setTitle("Nickel");
                    stage.show();
                    break;
                case "Cu":
                    stage.setTitle("Copper");
                    stage.show();
                    break;
                case "Zn":
                    stage.setTitle("Zinc");
                    stage.show();
                    break;
                case "Ga":
                    stage.setTitle("Gallium");
                    stage.show();
                    break;
                case "Ge":
                    stage.setTitle("Germanium");
                    stage.show();
                    break;
                case "As":
                    stage.setTitle("Arsenic");
                    stage.show();
                    break;
                case "Se":
                    stage.setTitle("Selenium");
                    stage.show();
                    break;
                case "Br":
                    stage.setTitle("Bromine");
                    stage.show();
                    break;
                case "Kr":
                    stage.setTitle("Krypton");
                    stage.show();
                    break;
                case "Rb":
                    stage.setTitle("Rubidium");
                    stage.show();
                    break;
                case "Sr":
                    stage.setTitle("Strontium");
                    stage.show();
                    break;
                case "Y":
                    stage.setTitle("Yttrium");
                    stage.show();
                    break;
                case "Zr":
                    stage.setTitle("Zirconium");
                    stage.show();
                    break;
                case "Nb":
                    stage.setTitle("Niobium");
                    stage.show();
                    break;
                case "Mo":
                    stage.setTitle("Molybdenum");
                    stage.show();
                    break;
                case "Tc":
                    stage.setTitle("Technetium");
                    stage.show();
                    break;
                case "Ru":
                    stage.setTitle("Ruthenium");
                    stage.show();
                    break;
                case "Rh":
                    stage.setTitle("Rhodium");
                    stage.show();
                    break;
                case "Pd":
                    stage.setTitle("Palladium");
                    stage.show();
                    break;
                case "Ag":
                    stage.setTitle("Silver");
                    stage.show();
                    break;
                case "Cd":
                    stage.setTitle("Cadmium");
                    stage.show();
                    break;
                case "In":
                    stage.setTitle("Indium");
                    stage.show();
                    break;
                case "Sn":
                    stage.setTitle("Tin");
                    stage.show();
                    break;
                case "Sb":
                    stage.setTitle("Antimony");
                    stage.show();
                    break;
                case "Te":
                    stage.setTitle("Tellurium");
                    stage.show();
                    break;
                case "I":
                    stage.setTitle("Iodine");
                    stage.show();
                    break;
                case "Xe":
                    stage.setTitle("Xenon");
                    stage.show();
                    break;
                case "Cs":
                    stage.setTitle("Cesium");
                    stage.show();
                    break;
                case "Ba":
                    stage.setTitle("Barium");
                    stage.show();
                    break;
                case "La":
                    stage.setTitle("Lanthanum");
                    stage.show();
                    break;
                case "Ce":
                    stage.setTitle("Cerium");
                    stage.show();
                    break;
                case "Pr":
                    stage.setTitle("Praseodymium");
                    stage.show();
                    break;
                case "Nd":
                    stage.setTitle("Neodymium");
                    stage.show();
                    break;
                case "Pm":
                    stage.setTitle("Promethium");
                    stage.show();
                    break;
                case "Sm":
                    stage.setTitle("Samarium");
                    stage.show();
                    break;
                case "Eu":
                    stage.setTitle("Europium");
                    stage.show();
                    break;
                case "Gd":
                    stage.setTitle("Gadolinium");
                    stage.show();
                    break;
                case "Tb":
                    stage.setTitle("Terbium");
                    stage.show();
                    break;
                case "Dy":
                    stage.setTitle("Dysprosium");
                    stage.show();
                    break;
                case "Ho":
                    stage.setTitle("Holmium");
                    stage.show();
                    break;
                case "Er":
                    stage.setTitle("Erbium");
                    stage.show();
                    break;
                case "Tm":
                    stage.setTitle("Thulium");
                    stage.show();
                    break;
                case "Yb":
                    stage.setTitle("Ytterbium");
                    stage.show();
                    break;
                case "Lu":
                    stage.setTitle("Luterium");
                    stage.show();
                    break;
                case "Hf":
                    stage.setTitle("Halfnium");
                    stage.show();
                    break;
                case "Ta":
                    stage.setTitle("Tantalum");
                    stage.show();
                    break;
                case "W":
                    stage.setTitle("Tungsten");
                    stage.show();
                    break;
                case "Re":
                    stage.setTitle("Rhenium");
                    stage.show();
                    break;
                case "Os":
                    stage.setTitle("Osmium");
                    stage.show();
                    break;
                case "Ir":
                    stage.setTitle("Iridium");
                    stage.show();
                    break;
                case "Pt":
                    stage.setTitle("Platinum");
                    stage.show();
                    break;
                case "Au":
                    stage.setTitle("Gold");
                    stage.show();
                    break;
                case "Hg":
                    stage.setTitle("Mercury");
                    stage.show();
                    break;
                case "Tl":
                    stage.setTitle("Thallium");
                    stage.show();
                    break;
                case "Pb":
                    stage.setTitle("Lead");
                    stage.show();
                    break;
                case "Bi":
                    stage.setTitle("Bismuth");
                    stage.show();
                    break;
                case "Po":
                    stage.setTitle("Polonium");
                    stage.show();
                    break;
                case "At":
                    stage.setTitle("Astatine");
                    stage.show();
                    break;
                case "Rn":
                    stage.setTitle("Radon");
                    stage.show();
                    break;
                case "Fr":
                    stage.setTitle("Francium");
                    stage.show();
                    break;
                case "Ra":
                    stage.setTitle("Radium");
                    stage.show();
                    break;
                case "Ac":
                    stage.setTitle("Actinium");
                    stage.show();
                    break;
                case "Th":
                    stage.setTitle("Thorium");
                    stage.show();
                    break;
                case "Pa":
                    stage.setTitle("Protactinium");
                    stage.show();
                    break;
                case "U":
                    stage.setTitle("Uranium");
                    stage.show();
                    break;
                case "Np":
                    stage.setTitle("Neptunium");
                    stage.show();
                    break;
                case "Pu":
                    stage.setTitle("Plutonium");
                    stage.show();
                    break;
                case "Am":
                    stage.setTitle("Americium");
                    stage.show();
                    break;
                case "Cm":
                    stage.setTitle("Curium");
                    stage.show();
                    break;
                case "Bk":
                    stage.setTitle("Berkelium");
                    stage.show();
                    break;
                case "Cf":
                    stage.setTitle("Californium");
                    stage.show();
                    break;
                case "Es":
                    stage.setTitle("Einsteinium");
                    stage.show();
                    break;
                case "Fm":
                    stage.setTitle("Fermium");
                    stage.show();
                    break;
                case "Md":
                    stage.setTitle("Mendalevium");
                    stage.show();
                    break;
                case "No":
                    stage.setTitle("Nobelium");
                    stage.show();
                    break;
                case "Lr":
                    stage.setTitle("Lawrencium");
                    stage.show();
                    break;
                case "Rf":
                    stage.setTitle("Rutherfordium");
                    stage.show();
                    break;
                case "Db":
                    stage.setTitle("Dubnium");
                    stage.show();
                    break;
                case "Sg":
                    stage.setTitle("Seaborgium");
                    stage.show();
                    break;
                case "Bh":
                    stage.setTitle("Bohrium");
                    stage.show();
                    break;
                case "Hs":
                    stage.setTitle("Hassium");
                    stage.show();
                    break;
                case "Mt":
                    stage.setTitle("Meitnerium");
                    stage.show();
                    break;
                case "Ds":
                    stage.setTitle("Darmstadtium");
                    stage.show();
                    break;
                case "Rg":
                    stage.setTitle("Roentgenium");
                    stage.show();
                    break;
                case "Cn":
                    stage.setTitle("Copernicium");
                    stage.show();
                    break;
                case "Nh":
                    stage.setTitle("Nihonium");
                    stage.show();
                    break;
                case "Fl":
                    stage.setTitle("Flerovium");
                    stage.show();
                    break;
                case "Mc":
                    stage.setTitle("Moscovium");
                    stage.show();
                    break;
                case "Lv":
                    stage.setTitle("Livermorium");
                    stage.show();
                    break;
                case "Ts":
                    stage.setTitle("Tennessine");
                    stage.show();
                    break;
                case "Og":
                    stage.setTitle("Oganesson");
                    stage.show();
                    break;
                default:
                    Alert a = new Alert(Alert.AlertType.ERROR);
                    a.setContentText("There was and unexspected error in the code.");
                    a.setTitle("ERROR");
                    a.show();
                    break;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
