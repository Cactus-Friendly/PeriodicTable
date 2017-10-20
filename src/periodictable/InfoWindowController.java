/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package periodictable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

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
        switch (FXMLDocumentController.parent) {
            case "H":
                atomicNumber.setText(infoClass.hydrogen[0]);
                symbol.setText(infoClass.hydrogen[1]);
                atomicMass.setText(infoClass.hydrogen[2]);
                name.setText(infoClass.hydrogen[3]);
                atomicMassSmall.setText(infoClass.hydrogen[2]);
                atomicNumberSmall.setText(infoClass.hydrogen[0]);
                meltingPoint.setText(infoClass.hydrogen[5]);
                boilingPoint.setText(infoClass.hydrogen[6]);
                density.setText(infoClass.hydrogen[4]);
                frame.setFill(Paint.valueOf("#ff000080"));
                break;
            case "He":
                atomicNumber.setText(infoClass.helium[0]);
                symbol.setText(infoClass.helium[1]);
                atomicMass.setText(infoClass.helium[2]);
                name.setText(infoClass.helium[3]);
                atomicMassSmall.setText(infoClass.helium[2]);
                atomicNumberSmall.setText(infoClass.helium[0]);
                meltingPoint.setText(infoClass.helium[5]);
                boilingPoint.setText(infoClass.helium[6]);
                density.setText(infoClass.helium[4]);
                frame.setFill(Paint.valueOf("#ff000080"));
                break;
            case "Li":
                atomicNumber.setText(infoClass.lithium[0]);
                symbol.setText(infoClass.lithium[1]);
                atomicMass.setText(infoClass.lithium[2]);
                name.setText(infoClass.lithium[3]);
                atomicMassSmall.setText(infoClass.lithium[2]);
                atomicNumberSmall.setText(infoClass.lithium[0]);
                meltingPoint.setText(infoClass.lithium[5]);
                boilingPoint.setText(infoClass.lithium[6]);
                density.setText(infoClass.lithium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Be":
                atomicNumber.setText(infoClass.beryllium[0]);
                symbol.setText(infoClass.beryllium[1]);
                atomicMass.setText(infoClass.beryllium[2]);
                name.setText(infoClass.beryllium[3]);
                atomicMassSmall.setText(infoClass.beryllium[2]);
                atomicNumberSmall.setText(infoClass.beryllium[0]);
                meltingPoint.setText(infoClass.beryllium[5]);
                boilingPoint.setText(infoClass.beryllium[6]);
                density.setText(infoClass.beryllium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "B":
                atomicNumber.setText(infoClass.boron[0]);
                symbol.setText(infoClass.boron[1]);
                atomicMass.setText(infoClass.boron[2]);
                name.setText(infoClass.boron[3]);
                atomicMassSmall.setText(infoClass.boron[2]);
                atomicNumberSmall.setText(infoClass.boron[0]);
                meltingPoint.setText(infoClass.boron[5]);
                boilingPoint.setText(infoClass.boron[6]);
                density.setText(infoClass.boron[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "C":
                atomicNumber.setText(infoClass.carbon[0]);
                symbol.setText(infoClass.carbon[1]);
                atomicMass.setText(infoClass.carbon[2]);
                name.setText(infoClass.carbon[3]);
                atomicMassSmall.setText(infoClass.carbon[2]);
                atomicNumberSmall.setText(infoClass.carbon[0]);
                meltingPoint.setText(infoClass.carbon[5]);
                boilingPoint.setText(infoClass.carbon[6]);
                density.setText(infoClass.carbon[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "N":
                atomicNumber.setText(infoClass.nitrogen[0]);
                symbol.setText(infoClass.nitrogen[1]);
                atomicMass.setText(infoClass.nitrogen[2]);
                name.setText(infoClass.nitrogen[3]);
                atomicMassSmall.setText(infoClass.nitrogen[2]);
                atomicNumberSmall.setText(infoClass.nitrogen[0]);
                meltingPoint.setText(infoClass.nitrogen[5]);
                boilingPoint.setText(infoClass.nitrogen[6]);
                density.setText(infoClass.nitrogen[4]);
                frame.setFill(Paint.valueOf("#ff000080"));
                break;
            case "O":
                atomicNumber.setText(infoClass.oxygen[0]);
                symbol.setText(infoClass.oxygen[1]);
                atomicMass.setText(infoClass.oxygen[2]);
                name.setText(infoClass.oxygen[3]);
                atomicMassSmall.setText(infoClass.oxygen[2]);
                atomicNumberSmall.setText(infoClass.oxygen[0]);
                meltingPoint.setText(infoClass.oxygen[5]);
                boilingPoint.setText(infoClass.oxygen[6]);
                density.setText(infoClass.oxygen[4]);
                frame.setFill(Paint.valueOf("#ff000080"));
                break;
            case "F":
                atomicNumber.setText(infoClass.fluorine[0]);
                symbol.setText(infoClass.fluorine[1]);
                atomicMass.setText(infoClass.fluorine[2]);
                name.setText(infoClass.fluorine[3]);
                atomicMassSmall.setText(infoClass.fluorine[2]);
                atomicNumberSmall.setText(infoClass.fluorine[0]);
                meltingPoint.setText(infoClass.fluorine[5]);
                boilingPoint.setText(infoClass.fluorine[6]);
                density.setText(infoClass.fluorine[4]);
                frame.setFill(Paint.valueOf("#ff000080"));
                break;
            case "Ne":
                atomicNumber.setText(infoClass.neon[0]);
                symbol.setText(infoClass.neon[1]);
                atomicMass.setText(infoClass.neon[2]);
                name.setText(infoClass.neon[3]);
                atomicMassSmall.setText(infoClass.neon[2]);
                atomicNumberSmall.setText(infoClass.neon[0]);
                meltingPoint.setText(infoClass.neon[5]);
                boilingPoint.setText(infoClass.neon[6]);
                density.setText(infoClass.neon[4]);
                frame.setFill(Paint.valueOf("#ff000080"));
                break;
            case "Na":
                atomicNumber.setText(infoClass.sodium[0]);
                symbol.setText(infoClass.sodium[1]);
                atomicMass.setText(infoClass.sodium[2]);
                name.setText(infoClass.sodium[3]);
                atomicMassSmall.setText(infoClass.sodium[2]);
                atomicNumberSmall.setText(infoClass.sodium[0]);
                meltingPoint.setText(infoClass.sodium[5]);
                boilingPoint.setText(infoClass.sodium[6]);
                density.setText(infoClass.sodium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Mg":
                atomicNumber.setText(infoClass.magnesium[0]);
                symbol.setText(infoClass.magnesium[1]);
                atomicMass.setText(infoClass.magnesium[2]);
                name.setText(infoClass.magnesium[3]);
                atomicMassSmall.setText(infoClass.magnesium[2]);
                atomicNumberSmall.setText(infoClass.magnesium[0]);
                meltingPoint.setText(infoClass.magnesium[5]);
                boilingPoint.setText(infoClass.magnesium[6]);
                density.setText(infoClass.magnesium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Al":
                atomicNumber.setText(infoClass.aluminum[0]);
                symbol.setText(infoClass.aluminum[1]);
                atomicMass.setText(infoClass.aluminum[2]);
                name.setText(infoClass.aluminum[3]);
                atomicMassSmall.setText(infoClass.aluminum[2]);
                atomicNumberSmall.setText(infoClass.aluminum[0]);
                meltingPoint.setText(infoClass.aluminum[5]);
                boilingPoint.setText(infoClass.aluminum[6]);
                density.setText(infoClass.aluminum[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Si":
                atomicNumber.setText(infoClass.silicon[0]);
                symbol.setText(infoClass.silicon[1]);
                atomicMass.setText(infoClass.silicon[2]);
                name.setText(infoClass.silicon[3]);
                atomicMassSmall.setText(infoClass.silicon[2]);
                atomicNumberSmall.setText(infoClass.silicon[0]);
                meltingPoint.setText(infoClass.silicon[5]);
                boilingPoint.setText(infoClass.silicon[6]);
                density.setText(infoClass.silicon[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "P":
                atomicNumber.setText(infoClass.phosphorus[0]);
                symbol.setText(infoClass.phosphorus[1]);
                atomicMass.setText(infoClass.phosphorus[2]);
                name.setText(infoClass.phosphorus[3]);
                atomicMassSmall.setText(infoClass.phosphorus[2]);
                atomicNumberSmall.setText(infoClass.phosphorus[0]);
                meltingPoint.setText(infoClass.phosphorus[5]);
                boilingPoint.setText(infoClass.phosphorus[6]);
                density.setText(infoClass.phosphorus[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "S":
                atomicNumber.setText(infoClass.sulfur[0]);
                symbol.setText(infoClass.sulfur[1]);
                atomicMass.setText(infoClass.sulfur[2]);
                name.setText(infoClass.sulfur[3]);
                atomicMassSmall.setText(infoClass.sulfur[2]);
                atomicNumberSmall.setText(infoClass.sulfur[0]);
                meltingPoint.setText(infoClass.sulfur[5]);
                boilingPoint.setText(infoClass.sulfur[6]);
                density.setText(infoClass.sulfur[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Cl":
                atomicNumber.setText(infoClass.chlorine[0]);
                symbol.setText(infoClass.chlorine[1]);
                atomicMass.setText(infoClass.chlorine[2]);
                name.setText(infoClass.chlorine[3]);
                atomicMassSmall.setText(infoClass.chlorine[2]);
                atomicNumberSmall.setText(infoClass.chlorine[0]);
                meltingPoint.setText(infoClass.chlorine[5]);
                boilingPoint.setText(infoClass.chlorine[6]);
                density.setText(infoClass.chlorine[4]);
                frame.setFill(Paint.valueOf("#ff000080"));
                break;
            case "Ar":
                atomicNumber.setText(infoClass.argon[0]);
                symbol.setText(infoClass.argon[1]);
                atomicMass.setText(infoClass.argon[2]);
                name.setText(infoClass.argon[3]);
                atomicMassSmall.setText(infoClass.argon[2]);
                atomicNumberSmall.setText(infoClass.argon[0]);
                meltingPoint.setText(infoClass.argon[5]);
                boilingPoint.setText(infoClass.argon[6]);
                density.setText(infoClass.argon[4]);
                frame.setFill(Paint.valueOf("#ff000080"));
                break;
            case "K":
                atomicNumber.setText(infoClass.potassium[0]);
                symbol.setText(infoClass.potassium[1]);
                atomicMass.setText(infoClass.potassium[2]);
                name.setText(infoClass.potassium[3]);
                atomicMassSmall.setText(infoClass.potassium[2]);
                atomicNumberSmall.setText(infoClass.potassium[0]);
                meltingPoint.setText(infoClass.potassium[5]);
                boilingPoint.setText(infoClass.potassium[6]);
                density.setText(infoClass.potassium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Ca":
                atomicNumber.setText(infoClass.calcium[0]);
                symbol.setText(infoClass.calcium[1]);
                atomicMass.setText(infoClass.calcium[2]);
                name.setText(infoClass.calcium[3]);
                atomicMassSmall.setText(infoClass.calcium[2]);
                atomicNumberSmall.setText(infoClass.calcium[0]);
                meltingPoint.setText(infoClass.calcium[5]);
                boilingPoint.setText(infoClass.calcium[6]);
                density.setText(infoClass.calcium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Sc":
                atomicNumber.setText(infoClass.scandium[0]);
                symbol.setText(infoClass.scandium[1]);
                atomicMass.setText(infoClass.scandium[2]);
                name.setText(infoClass.scandium[3]);
                atomicMassSmall.setText(infoClass.scandium[2]);
                atomicNumberSmall.setText(infoClass.scandium[0]);
                meltingPoint.setText(infoClass.scandium[5]);
                boilingPoint.setText(infoClass.scandium[6]);
                density.setText(infoClass.scandium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Ti":
                atomicNumber.setText(infoClass.titanium[0]);
                symbol.setText(infoClass.titanium[1]);
                atomicMass.setText(infoClass.titanium[2]);
                name.setText(infoClass.titanium[3]);
                atomicMassSmall.setText(infoClass.titanium[2]);
                atomicNumberSmall.setText(infoClass.titanium[0]);
                meltingPoint.setText(infoClass.titanium[5]);
                boilingPoint.setText(infoClass.titanium[6]);
                density.setText(infoClass.titanium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "V":
                atomicNumber.setText(infoClass.vanadium[0]);
                symbol.setText(infoClass.vanadium[1]);
                atomicMass.setText(infoClass.vanadium[2]);
                name.setText(infoClass.vanadium[3]);
                atomicMassSmall.setText(infoClass.vanadium[2]);
                atomicNumberSmall.setText(infoClass.vanadium[0]);
                meltingPoint.setText(infoClass.vanadium[5]);
                boilingPoint.setText(infoClass.vanadium[6]);
                density.setText(infoClass.vanadium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Cr":
                atomicNumber.setText(infoClass.chromium[0]);
                symbol.setText(infoClass.chromium[1]);
                atomicMass.setText(infoClass.chromium[2]);
                name.setText(infoClass.chromium[3]);
                atomicMassSmall.setText(infoClass.chromium[2]);
                atomicNumberSmall.setText(infoClass.chromium[0]);
                meltingPoint.setText(infoClass.chromium[5]);
                boilingPoint.setText(infoClass.chromium[6]);
                density.setText(infoClass.chromium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Mn":
                atomicNumber.setText(infoClass.manganese[0]);
                symbol.setText(infoClass.manganese[1]);
                atomicMass.setText(infoClass.manganese[2]);
                name.setText(infoClass.manganese[3]);
                atomicMassSmall.setText(infoClass.manganese[2]);
                atomicNumberSmall.setText(infoClass.manganese[0]);
                meltingPoint.setText(infoClass.manganese[5]);
                boilingPoint.setText(infoClass.manganese[6]);
                density.setText(infoClass.manganese[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Fe":
                atomicNumber.setText(infoClass.iron[0]);
                symbol.setText(infoClass.iron[1]);
                atomicMass.setText(infoClass.iron[2]);
                name.setText(infoClass.iron[3]);
                atomicMassSmall.setText(infoClass.iron[2]);
                atomicNumberSmall.setText(infoClass.iron[0]);
                meltingPoint.setText(infoClass.iron[5]);
                boilingPoint.setText(infoClass.iron[6]);
                density.setText(infoClass.iron[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Co":
                atomicNumber.setText(infoClass.cobalt[0]);
                symbol.setText(infoClass.cobalt[1]);
                atomicMass.setText(infoClass.cobalt[2]);
                name.setText(infoClass.cobalt[3]);
                atomicMassSmall.setText(infoClass.cobalt[2]);
                atomicNumberSmall.setText(infoClass.cobalt[0]);
                meltingPoint.setText(infoClass.cobalt[5]);
                boilingPoint.setText(infoClass.cobalt[6]);
                density.setText(infoClass.cobalt[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Ni":
                atomicNumber.setText(infoClass.nickel[0]);
                symbol.setText(infoClass.nickel[1]);
                atomicMass.setText(infoClass.nickel[2]);
                name.setText(infoClass.nickel[3]);
                atomicMassSmall.setText(infoClass.nickel[2]);
                atomicNumberSmall.setText(infoClass.nickel[0]);
                meltingPoint.setText(infoClass.nickel[5]);
                boilingPoint.setText(infoClass.nickel[6]);
                density.setText(infoClass.nickel[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Cu":
                atomicNumber.setText(infoClass.copper[0]);
                symbol.setText(infoClass.copper[1]);
                atomicMass.setText(infoClass.copper[2]);
                name.setText(infoClass.copper[3]);
                atomicMassSmall.setText(infoClass.copper[2]);
                atomicNumberSmall.setText(infoClass.copper[0]);
                meltingPoint.setText(infoClass.copper[5]);
                boilingPoint.setText(infoClass.copper[6]);
                density.setText(infoClass.copper[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Zn":
                atomicNumber.setText(infoClass.zinc[0]);
                symbol.setText(infoClass.zinc[1]);
                atomicMass.setText(infoClass.zinc[2]);
                name.setText(infoClass.zinc[3]);
                atomicMassSmall.setText(infoClass.zinc[2]);
                atomicNumberSmall.setText(infoClass.zinc[0]);
                meltingPoint.setText(infoClass.zinc[5]);
                boilingPoint.setText(infoClass.zinc[6]);
                density.setText(infoClass.zinc[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Ga":
                atomicNumber.setText(infoClass.gallium[0]);
                symbol.setText(infoClass.gallium[1]);
                atomicMass.setText(infoClass.gallium[2]);
                name.setText(infoClass.gallium[3]);
                atomicMassSmall.setText(infoClass.gallium[2]);
                atomicNumberSmall.setText(infoClass.gallium[0]);
                meltingPoint.setText(infoClass.gallium[5]);
                boilingPoint.setText(infoClass.gallium[6]);
                density.setText(infoClass.gallium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Ge":
                atomicNumber.setText(infoClass.germanium[0]);
                symbol.setText(infoClass.germanium[1]);
                atomicMass.setText(infoClass.germanium[2]);
                name.setText(infoClass.germanium[3]);
                atomicMassSmall.setText(infoClass.germanium[2]);
                atomicNumberSmall.setText(infoClass.germanium[0]);
                meltingPoint.setText(infoClass.germanium[5]);
                boilingPoint.setText(infoClass.germanium[6]);
                density.setText(infoClass.germanium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "As":
                atomicNumber.setText(infoClass.arsenic[0]);
                symbol.setText(infoClass.arsenic[1]);
                atomicMass.setText(infoClass.arsenic[2]);
                name.setText(infoClass.arsenic[3]);
                atomicMassSmall.setText(infoClass.arsenic[2]);
                atomicNumberSmall.setText(infoClass.arsenic[0]);
                meltingPoint.setText(infoClass.arsenic[5]);
                boilingPoint.setText(infoClass.arsenic[6]);
                density.setText(infoClass.arsenic[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Se":
                atomicNumber.setText(infoClass.selenium[0]);
                symbol.setText(infoClass.selenium[1]);
                atomicMass.setText(infoClass.selenium[2]);
                name.setText(infoClass.selenium[3]);
                atomicMassSmall.setText(infoClass.selenium[2]);
                atomicNumberSmall.setText(infoClass.selenium[0]);
                meltingPoint.setText(infoClass.selenium[5]);
                boilingPoint.setText(infoClass.selenium[6]);
                density.setText(infoClass.selenium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Br":
                atomicNumber.setText(infoClass.bromine[0]);
                symbol.setText(infoClass.bromine[1]);
                atomicMass.setText(infoClass.bromine[2]);
                name.setText(infoClass.bromine[3]);
                atomicMassSmall.setText(infoClass.bromine[2]);
                atomicNumberSmall.setText(infoClass.bromine[0]);
                meltingPoint.setText(infoClass.bromine[5]);
                boilingPoint.setText(infoClass.bromine[6]);
                density.setText(infoClass.bromine[4]);
                frame.setFill(Paint.valueOf("#0000ff80"));
                break;
            case "Kr":
                atomicNumber.setText(infoClass.krypton[0]);
                symbol.setText(infoClass.krypton[1]);
                atomicMass.setText(infoClass.krypton[2]);
                name.setText(infoClass.krypton[3]);
                atomicMassSmall.setText(infoClass.krypton[2]);
                atomicNumberSmall.setText(infoClass.krypton[0]);
                meltingPoint.setText(infoClass.krypton[5]);
                boilingPoint.setText(infoClass.krypton[6]);
                density.setText(infoClass.krypton[4]);
                frame.setFill(Paint.valueOf("#ff000080"));
                break;
            case "Rb":
                atomicNumber.setText(infoClass.rubidium[0]);
                symbol.setText(infoClass.rubidium[1]);
                atomicMass.setText(infoClass.rubidium[2]);
                name.setText(infoClass.rubidium[3]);
                atomicMassSmall.setText(infoClass.rubidium[2]);
                atomicNumberSmall.setText(infoClass.rubidium[0]);
                meltingPoint.setText(infoClass.rubidium[5]);
                boilingPoint.setText(infoClass.rubidium[6]);
                density.setText(infoClass.rubidium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Sr":
                atomicNumber.setText(infoClass.strontium[0]);
                symbol.setText(infoClass.strontium[1]);
                atomicMass.setText(infoClass.strontium[2]);
                name.setText(infoClass.strontium[3]);
                atomicMassSmall.setText(infoClass.strontium[2]);
                atomicNumberSmall.setText(infoClass.strontium[0]);
                meltingPoint.setText(infoClass.strontium[5]);
                boilingPoint.setText(infoClass.strontium[6]);
                density.setText(infoClass.strontium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Y":
                atomicNumber.setText(infoClass.yttrium[0]);
                symbol.setText(infoClass.yttrium[1]);
                atomicMass.setText(infoClass.yttrium[2]);
                name.setText(infoClass.yttrium[3]);
                atomicMassSmall.setText(infoClass.yttrium[2]);
                atomicNumberSmall.setText(infoClass.yttrium[0]);
                meltingPoint.setText(infoClass.yttrium[5]);
                boilingPoint.setText(infoClass.yttrium[6]);
                density.setText(infoClass.yttrium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Zr":
                atomicNumber.setText(infoClass.zirconium[0]);
                symbol.setText(infoClass.zirconium[1]);
                atomicMass.setText(infoClass.zirconium[2]);
                name.setText(infoClass.zirconium[3]);
                atomicMassSmall.setText(infoClass.zirconium[2]);
                atomicNumberSmall.setText(infoClass.zirconium[0]);
                meltingPoint.setText(infoClass.zirconium[5]);
                boilingPoint.setText(infoClass.zirconium[6]);
                density.setText(infoClass.zirconium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Nb":
                atomicNumber.setText(infoClass.niobium[0]);
                symbol.setText(infoClass.niobium[1]);
                atomicMass.setText(infoClass.niobium[2]);
                name.setText(infoClass.niobium[3]);
                atomicMassSmall.setText(infoClass.niobium[2]);
                atomicNumberSmall.setText(infoClass.niobium[0]);
                meltingPoint.setText(infoClass.niobium[5]);
                boilingPoint.setText(infoClass.niobium[6]);
                density.setText(infoClass.niobium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Mo":
                atomicNumber.setText(infoClass.molybdenum[0]);
                symbol.setText(infoClass.molybdenum[1]);
                atomicMass.setText(infoClass.molybdenum[2]);
                name.setText(infoClass.molybdenum[3]);
                atomicMassSmall.setText(infoClass.molybdenum[2]);
                atomicNumberSmall.setText(infoClass.molybdenum[0]);
                meltingPoint.setText(infoClass.molybdenum[5]);
                boilingPoint.setText(infoClass.molybdenum[6]);
                density.setText(infoClass.molybdenum[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Tc":
                atomicNumber.setText(infoClass.technetium[0]);
                symbol.setText(infoClass.technetium[1]);
                atomicMass.setText(infoClass.technetium[2]);
                name.setText(infoClass.technetium[3]);
                atomicMassSmall.setText(infoClass.technetium[2]);
                atomicNumberSmall.setText(infoClass.technetium[0]);
                meltingPoint.setText(infoClass.technetium[5]);
                boilingPoint.setText(infoClass.technetium[6]);
                density.setText(infoClass.technetium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Ru":
                atomicNumber.setText(infoClass.ruthenium[0]);
                symbol.setText(infoClass.ruthenium[1]);
                atomicMass.setText(infoClass.ruthenium[2]);
                name.setText(infoClass.ruthenium[3]);
                atomicMassSmall.setText(infoClass.ruthenium[2]);
                atomicNumberSmall.setText(infoClass.ruthenium[0]);
                meltingPoint.setText(infoClass.ruthenium[5]);
                boilingPoint.setText(infoClass.ruthenium[6]);
                density.setText(infoClass.ruthenium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Rh":
                atomicNumber.setText(infoClass.rhodium[0]);
                symbol.setText(infoClass.rhodium[1]);
                atomicMass.setText(infoClass.rhodium[2]);
                name.setText(infoClass.rhodium[3]);
                atomicMassSmall.setText(infoClass.rhodium[2]);
                atomicNumberSmall.setText(infoClass.rhodium[0]);
                meltingPoint.setText(infoClass.rhodium[5]);
                boilingPoint.setText(infoClass.rhodium[6]);
                density.setText(infoClass.rhodium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Pd":
                atomicNumber.setText(infoClass.palladium[0]);
                symbol.setText(infoClass.palladium[1]);
                atomicMass.setText(infoClass.palladium[2]);
                name.setText(infoClass.palladium[3]);
                atomicMassSmall.setText(infoClass.palladium[2]);
                atomicNumberSmall.setText(infoClass.palladium[0]);
                meltingPoint.setText(infoClass.palladium[5]);
                boilingPoint.setText(infoClass.palladium[6]);
                density.setText(infoClass.palladium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Ag":
                atomicNumber.setText(infoClass.silver[0]);
                symbol.setText(infoClass.silver[1]);
                atomicMass.setText(infoClass.silver[2]);
                name.setText(infoClass.silver[3]);
                atomicMassSmall.setText(infoClass.silver[2]);
                atomicNumberSmall.setText(infoClass.silver[0]);
                meltingPoint.setText(infoClass.silver[5]);
                boilingPoint.setText(infoClass.silver[6]);
                density.setText(infoClass.silver[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Cd":
                atomicNumber.setText(infoClass.cadmium[0]);
                symbol.setText(infoClass.cadmium[1]);
                atomicMass.setText(infoClass.cadmium[2]);
                name.setText(infoClass.cadmium[3]);
                atomicMassSmall.setText(infoClass.cadmium[2]);
                atomicNumberSmall.setText(infoClass.cadmium[0]);
                meltingPoint.setText(infoClass.cadmium[5]);
                boilingPoint.setText(infoClass.cadmium[6]);
                density.setText(infoClass.cadmium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "In":
                atomicNumber.setText(infoClass.indium[0]);
                symbol.setText(infoClass.indium[1]);
                atomicMass.setText(infoClass.indium[2]);
                name.setText(infoClass.indium[3]);
                atomicMassSmall.setText(infoClass.indium[2]);
                atomicNumberSmall.setText(infoClass.indium[0]);
                meltingPoint.setText(infoClass.indium[5]);
                boilingPoint.setText(infoClass.indium[6]);
                density.setText(infoClass.indium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Sn":
                atomicNumber.setText(infoClass.tin[0]);
                symbol.setText(infoClass.tin[1]);
                atomicMass.setText(infoClass.tin[2]);
                name.setText(infoClass.tin[3]);
                atomicMassSmall.setText(infoClass.tin[2]);
                atomicNumberSmall.setText(infoClass.tin[0]);
                meltingPoint.setText(infoClass.tin[5]);
                boilingPoint.setText(infoClass.tin[6]);
                density.setText(infoClass.tin[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Sb":
                atomicNumber.setText(infoClass.antimony[0]);
                symbol.setText(infoClass.antimony[1]);
                atomicMass.setText(infoClass.antimony[2]);
                name.setText(infoClass.antimony[3]);
                atomicMassSmall.setText(infoClass.antimony[2]);
                atomicNumberSmall.setText(infoClass.antimony[0]);
                meltingPoint.setText(infoClass.antimony[5]);
                boilingPoint.setText(infoClass.antimony[6]);
                density.setText(infoClass.antimony[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Te":
                atomicNumber.setText(infoClass.tellurium[0]);
                symbol.setText(infoClass.tellurium[1]);
                atomicMass.setText(infoClass.tellurium[2]);
                name.setText(infoClass.tellurium[3]);
                atomicMassSmall.setText(infoClass.tellurium[2]);
                atomicNumberSmall.setText(infoClass.tellurium[0]);
                meltingPoint.setText(infoClass.tellurium[5]);
                boilingPoint.setText(infoClass.tellurium[6]);
                density.setText(infoClass.tellurium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "I":
                atomicNumber.setText(infoClass.iodine[0]);
                symbol.setText(infoClass.iodine[1]);
                atomicMass.setText(infoClass.iodine[2]);
                name.setText(infoClass.iodine[3]);
                atomicMassSmall.setText(infoClass.iodine[2]);
                atomicNumberSmall.setText(infoClass.iodine[0]);
                meltingPoint.setText(infoClass.iodine[5]);
                boilingPoint.setText(infoClass.iodine[6]);
                density.setText(infoClass.iodine[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Xe":
                atomicNumber.setText(infoClass.xenon[0]);
                symbol.setText(infoClass.xenon[1]);
                atomicMass.setText(infoClass.xenon[2]);
                name.setText(infoClass.xenon[3]);
                atomicMassSmall.setText(infoClass.xenon[2]);
                atomicNumberSmall.setText(infoClass.xenon[0]);
                meltingPoint.setText(infoClass.xenon[5]);
                boilingPoint.setText(infoClass.xenon[6]);
                density.setText(infoClass.xenon[4]);
                frame.setFill(Paint.valueOf("#ff000080"));
                break;
            case "Cs":
                atomicNumber.setText(infoClass.cesium[0]);
                symbol.setText(infoClass.cesium[1]);
                atomicMass.setText(infoClass.cesium[2]);
                name.setText(infoClass.cesium[3]);
                atomicMassSmall.setText(infoClass.cesium[2]);
                atomicNumberSmall.setText(infoClass.cesium[0]);
                meltingPoint.setText(infoClass.cesium[5]);
                boilingPoint.setText(infoClass.cesium[6]);
                density.setText(infoClass.cesium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Ba":
                atomicNumber.setText(infoClass.barium[0]);
                symbol.setText(infoClass.barium[1]);
                atomicMass.setText(infoClass.barium[2]);
                name.setText(infoClass.barium[3]);
                atomicMassSmall.setText(infoClass.barium[2]);
                atomicNumberSmall.setText(infoClass.barium[0]);
                meltingPoint.setText(infoClass.barium[5]);
                boilingPoint.setText(infoClass.barium[6]);
                density.setText(infoClass.barium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "La":
                atomicNumber.setText(infoClass.lanthanum[0]);
                symbol.setText(infoClass.lanthanum[1]);
                atomicMass.setText(infoClass.lanthanum[2]);
                name.setText(infoClass.lanthanum[3]);
                atomicMassSmall.setText(infoClass.lanthanum[2]);
                atomicNumberSmall.setText(infoClass.lanthanum[0]);
                meltingPoint.setText(infoClass.lanthanum[5]);
                boilingPoint.setText(infoClass.lanthanum[6]);
                density.setText(infoClass.lanthanum[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Ce":
                atomicNumber.setText(infoClass.cerium[0]);
                symbol.setText(infoClass.cerium[1]);
                atomicMass.setText(infoClass.cerium[2]);
                name.setText(infoClass.cerium[3]);
                atomicMassSmall.setText(infoClass.cerium[2]);
                atomicNumberSmall.setText(infoClass.cerium[0]);
                meltingPoint.setText(infoClass.cerium[5]);
                boilingPoint.setText(infoClass.cerium[6]);
                density.setText(infoClass.cerium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Pr":
                atomicNumber.setText(infoClass.praseodymium[0]);
                symbol.setText(infoClass.praseodymium[1]);
                atomicMass.setText(infoClass.praseodymium[2]);
                name.setText(infoClass.praseodymium[3]);
                atomicMassSmall.setText(infoClass.praseodymium[2]);
                atomicNumberSmall.setText(infoClass.praseodymium[0]);
                meltingPoint.setText(infoClass.praseodymium[5]);
                boilingPoint.setText(infoClass.praseodymium[6]);
                density.setText(infoClass.praseodymium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Nd":
                atomicNumber.setText(infoClass.neodymium[0]);
                symbol.setText(infoClass.neodymium[1]);
                atomicMass.setText(infoClass.neodymium[2]);
                name.setText(infoClass.neodymium[3]);
                atomicMassSmall.setText(infoClass.neodymium[2]);
                atomicNumberSmall.setText(infoClass.neodymium[0]);
                meltingPoint.setText(infoClass.neodymium[5]);
                boilingPoint.setText(infoClass.neodymium[6]);
                density.setText(infoClass.neodymium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Pm":
                atomicNumber.setText(infoClass.promethium[0]);
                symbol.setText(infoClass.promethium[1]);
                atomicMass.setText(infoClass.promethium[2]);
                name.setText(infoClass.promethium[3]);
                atomicMassSmall.setText(infoClass.promethium[2]);
                atomicNumberSmall.setText(infoClass.promethium[0]);
                meltingPoint.setText(infoClass.promethium[5]);
                boilingPoint.setText(infoClass.promethium[6]);
                density.setText(infoClass.promethium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Sm":
                atomicNumber.setText(infoClass.samarium[0]);
                symbol.setText(infoClass.samarium[1]);
                atomicMass.setText(infoClass.samarium[2]);
                name.setText(infoClass.samarium[3]);
                atomicMassSmall.setText(infoClass.samarium[2]);
                atomicNumberSmall.setText(infoClass.samarium[0]);
                meltingPoint.setText(infoClass.samarium[5]);
                boilingPoint.setText(infoClass.samarium[6]);
                density.setText(infoClass.samarium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Eu":
                atomicNumber.setText(infoClass.europium[0]);
                symbol.setText(infoClass.europium[1]);
                atomicMass.setText(infoClass.europium[2]);
                name.setText(infoClass.europium[3]);
                atomicMassSmall.setText(infoClass.europium[2]);
                atomicNumberSmall.setText(infoClass.europium[0]);
                meltingPoint.setText(infoClass.europium[5]);
                boilingPoint.setText(infoClass.europium[6]);
                density.setText(infoClass.europium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Gd":
                atomicNumber.setText(infoClass.gadolinium[0]);
                symbol.setText(infoClass.gadolinium[1]);
                atomicMass.setText(infoClass.gadolinium[2]);
                name.setText(infoClass.gadolinium[3]);
                atomicMassSmall.setText(infoClass.gadolinium[2]);
                atomicNumberSmall.setText(infoClass.gadolinium[0]);
                meltingPoint.setText(infoClass.gadolinium[5]);
                boilingPoint.setText(infoClass.gadolinium[6]);
                density.setText(infoClass.gadolinium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Tb":
                atomicNumber.setText(infoClass.terbium[0]);
                symbol.setText(infoClass.terbium[1]);
                atomicMass.setText(infoClass.terbium[2]);
                name.setText(infoClass.terbium[3]);
                atomicMassSmall.setText(infoClass.terbium[2]);
                atomicNumberSmall.setText(infoClass.terbium[0]);
                meltingPoint.setText(infoClass.terbium[5]);
                boilingPoint.setText(infoClass.terbium[6]);
                density.setText(infoClass.terbium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Dy":
                atomicNumber.setText(infoClass.dysprosium[0]);
                symbol.setText(infoClass.dysprosium[1]);
                atomicMass.setText(infoClass.dysprosium[2]);
                name.setText(infoClass.dysprosium[3]);
                atomicMassSmall.setText(infoClass.dysprosium[2]);
                atomicNumberSmall.setText(infoClass.dysprosium[0]);
                meltingPoint.setText(infoClass.dysprosium[5]);
                boilingPoint.setText(infoClass.dysprosium[6]);
                density.setText(infoClass.dysprosium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Ho":
                atomicNumber.setText(infoClass.holmium[0]);
                symbol.setText(infoClass.holmium[1]);
                atomicMass.setText(infoClass.holmium[2]);
                name.setText(infoClass.holmium[3]);
                atomicMassSmall.setText(infoClass.holmium[2]);
                atomicNumberSmall.setText(infoClass.holmium[0]);
                meltingPoint.setText(infoClass.holmium[5]);
                boilingPoint.setText(infoClass.holmium[6]);
                density.setText(infoClass.holmium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Er":
                atomicNumber.setText(infoClass.erbium[0]);
                symbol.setText(infoClass.erbium[1]);
                atomicMass.setText(infoClass.erbium[2]);
                name.setText(infoClass.erbium[3]);
                atomicMassSmall.setText(infoClass.erbium[2]);
                atomicNumberSmall.setText(infoClass.erbium[0]);
                meltingPoint.setText(infoClass.erbium[5]);
                boilingPoint.setText(infoClass.erbium[6]);
                density.setText(infoClass.erbium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Tm":
                atomicNumber.setText(infoClass.thulium[0]);
                symbol.setText(infoClass.thulium[1]);
                atomicMass.setText(infoClass.thulium[2]);
                name.setText(infoClass.thulium[3]);
                atomicMassSmall.setText(infoClass.thulium[2]);
                atomicNumberSmall.setText(infoClass.thulium[0]);
                meltingPoint.setText(infoClass.thulium[5]);
                boilingPoint.setText(infoClass.thulium[6]);
                density.setText(infoClass.thulium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Yb":
                atomicNumber.setText(infoClass.ytterbium[0]);
                symbol.setText(infoClass.ytterbium[1]);
                atomicMass.setText(infoClass.ytterbium[2]);
                name.setText(infoClass.ytterbium[3]);
                atomicMassSmall.setText(infoClass.ytterbium[2]);
                atomicNumberSmall.setText(infoClass.ytterbium[0]);
                meltingPoint.setText(infoClass.ytterbium[5]);
                boilingPoint.setText(infoClass.ytterbium[6]);
                density.setText(infoClass.ytterbium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Lu":
                atomicNumber.setText(infoClass.luterium[0]);
                symbol.setText(infoClass.luterium[1]);
                atomicMass.setText(infoClass.luterium[2]);
                name.setText(infoClass.luterium[3]);
                atomicMassSmall.setText(infoClass.luterium[2]);
                atomicNumberSmall.setText(infoClass.luterium[0]);
                meltingPoint.setText(infoClass.luterium[5]);
                boilingPoint.setText(infoClass.luterium[6]);
                density.setText(infoClass.luterium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Hf":
                atomicNumber.setText(infoClass.halfnium[0]);
                symbol.setText(infoClass.halfnium[1]);
                atomicMass.setText(infoClass.halfnium[2]);
                name.setText(infoClass.halfnium[3]);
                atomicMassSmall.setText(infoClass.halfnium[2]);
                atomicNumberSmall.setText(infoClass.halfnium[0]);
                meltingPoint.setText(infoClass.halfnium[5]);
                boilingPoint.setText(infoClass.halfnium[6]);
                density.setText(infoClass.halfnium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Ta":
                atomicNumber.setText(infoClass.tantalum[0]);
                symbol.setText(infoClass.tantalum[1]);
                atomicMass.setText(infoClass.tantalum[2]);
                name.setText(infoClass.tantalum[3]);
                atomicMassSmall.setText(infoClass.tantalum[2]);
                atomicNumberSmall.setText(infoClass.tantalum[0]);
                meltingPoint.setText(infoClass.tantalum[5]);
                boilingPoint.setText(infoClass.tantalum[6]);
                density.setText(infoClass.tantalum[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "W":
                atomicNumber.setText(infoClass.tungsten[0]);
                symbol.setText(infoClass.tungsten[1]);
                atomicMass.setText(infoClass.tungsten[2]);
                name.setText(infoClass.tungsten[3]);
                atomicMassSmall.setText(infoClass.tungsten[2]);
                atomicNumberSmall.setText(infoClass.tungsten[0]);
                meltingPoint.setText(infoClass.tungsten[5]);
                boilingPoint.setText(infoClass.tungsten[6]);
                density.setText(infoClass.tungsten[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Re":
                atomicNumber.setText(infoClass.rhenium[0]);
                symbol.setText(infoClass.rhenium[1]);
                atomicMass.setText(infoClass.rhenium[2]);
                name.setText(infoClass.rhenium[3]);
                atomicMassSmall.setText(infoClass.rhenium[2]);
                atomicNumberSmall.setText(infoClass.rhenium[0]);
                meltingPoint.setText(infoClass.rhenium[5]);
                boilingPoint.setText(infoClass.rhenium[6]);
                density.setText(infoClass.rhenium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Os":
                atomicNumber.setText(infoClass.osmium[0]);
                symbol.setText(infoClass.osmium[1]);
                atomicMass.setText(infoClass.osmium[2]);
                name.setText(infoClass.osmium[3]);
                atomicMassSmall.setText(infoClass.osmium[2]);
                atomicNumberSmall.setText(infoClass.osmium[0]);
                meltingPoint.setText(infoClass.osmium[5]);
                boilingPoint.setText(infoClass.osmium[6]);
                density.setText(infoClass.osmium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Ir":
                atomicNumber.setText(infoClass.iridium[0]);
                symbol.setText(infoClass.iridium[1]);
                atomicMass.setText(infoClass.iridium[2]);
                name.setText(infoClass.iridium[3]);
                atomicMassSmall.setText(infoClass.iridium[2]);
                atomicNumberSmall.setText(infoClass.iridium[0]);
                meltingPoint.setText(infoClass.iridium[5]);
                boilingPoint.setText(infoClass.iridium[6]);
                density.setText(infoClass.iridium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Pt":
                atomicNumber.setText(infoClass.platinum[0]);
                symbol.setText(infoClass.platinum[1]);
                atomicMass.setText(infoClass.platinum[2]);
                name.setText(infoClass.platinum[3]);
                atomicMassSmall.setText(infoClass.platinum[2]);
                atomicNumberSmall.setText(infoClass.platinum[0]);
                meltingPoint.setText(infoClass.platinum[5]);
                boilingPoint.setText(infoClass.platinum[6]);
                density.setText(infoClass.platinum[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Au":
                atomicNumber.setText(infoClass.gold[0]);
                symbol.setText(infoClass.gold[1]);
                atomicMass.setText(infoClass.gold[2]);
                name.setText(infoClass.gold[3]);
                atomicMassSmall.setText(infoClass.gold[2]);
                atomicNumberSmall.setText(infoClass.gold[0]);
                meltingPoint.setText(infoClass.gold[5]);
                boilingPoint.setText(infoClass.gold[6]);
                density.setText(infoClass.gold[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Hg":
                atomicNumber.setText(infoClass.mercury[0]);
                symbol.setText(infoClass.mercury[1]);
                atomicMass.setText(infoClass.mercury[2]);
                name.setText(infoClass.mercury[3]);
                atomicMassSmall.setText(infoClass.mercury[2]);
                atomicNumberSmall.setText(infoClass.mercury[0]);
                meltingPoint.setText(infoClass.mercury[5]);
                boilingPoint.setText(infoClass.mercury[6]);
                density.setText(infoClass.mercury[4]);
                frame.setFill(Paint.valueOf("#0000ff80"));
                break;
            case "Tl":
                atomicNumber.setText(infoClass.thallium[0]);
                symbol.setText(infoClass.thallium[1]);
                atomicMass.setText(infoClass.thallium[2]);
                name.setText(infoClass.thallium[3]);
                atomicMassSmall.setText(infoClass.thallium[2]);
                atomicNumberSmall.setText(infoClass.thallium[0]);
                meltingPoint.setText(infoClass.thallium[5]);
                boilingPoint.setText(infoClass.thallium[6]);
                density.setText(infoClass.thallium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Pb":
                atomicNumber.setText(infoClass.lead[0]);
                symbol.setText(infoClass.lead[1]);
                atomicMass.setText(infoClass.lead[2]);
                name.setText(infoClass.lead[3]);
                atomicMassSmall.setText(infoClass.lead[2]);
                atomicNumberSmall.setText(infoClass.lead[0]);
                meltingPoint.setText(infoClass.lead[5]);
                boilingPoint.setText(infoClass.lead[6]);
                density.setText(infoClass.lead[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Bi":
                atomicNumber.setText(infoClass.bismuth[0]);
                symbol.setText(infoClass.bismuth[1]);
                atomicMass.setText(infoClass.bismuth[2]);
                name.setText(infoClass.bismuth[3]);
                atomicMassSmall.setText(infoClass.bismuth[2]);
                atomicNumberSmall.setText(infoClass.bismuth[0]);
                meltingPoint.setText(infoClass.bismuth[5]);
                boilingPoint.setText(infoClass.bismuth[6]);
                density.setText(infoClass.bismuth[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Po":
                atomicNumber.setText(infoClass.polonium[0]);
                symbol.setText(infoClass.polonium[1]);
                atomicMass.setText(infoClass.polonium[2]);
                name.setText(infoClass.polonium[3]);
                atomicMassSmall.setText(infoClass.polonium[2]);
                atomicNumberSmall.setText(infoClass.polonium[0]);
                meltingPoint.setText(infoClass.polonium[5]);
                boilingPoint.setText(infoClass.polonium[6]);
                density.setText(infoClass.polonium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "At":
                atomicNumber.setText(infoClass.astatine[0]);
                symbol.setText(infoClass.astatine[1]);
                atomicMass.setText(infoClass.astatine[2]);
                name.setText(infoClass.astatine[3]);
                atomicMassSmall.setText(infoClass.astatine[2]);
                atomicNumberSmall.setText(infoClass.astatine[0]);
                meltingPoint.setText(infoClass.astatine[5]);
                boilingPoint.setText(infoClass.astatine[6]);
                density.setText(infoClass.astatine[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Rn":
                atomicNumber.setText(infoClass.radon[0]);
                symbol.setText(infoClass.radon[1]);
                atomicMass.setText(infoClass.radon[2]);
                name.setText(infoClass.radon[3]);
                atomicMassSmall.setText(infoClass.radon[2]);
                atomicNumberSmall.setText(infoClass.radon[0]);
                meltingPoint.setText(infoClass.radon[5]);
                boilingPoint.setText(infoClass.radon[6]);
                density.setText(infoClass.radon[4]);
                frame.setFill(Paint.valueOf("#ff000080"));
                break;
            case "Fr":
                atomicNumber.setText(infoClass.francium[0]);
                symbol.setText(infoClass.francium[1]);
                atomicMass.setText(infoClass.francium[2]);
                name.setText(infoClass.francium[3]);
                atomicMassSmall.setText(infoClass.francium[2]);
                atomicNumberSmall.setText(infoClass.francium[0]);
                meltingPoint.setText(infoClass.francium[5]);
                boilingPoint.setText(infoClass.francium[6]);
                density.setText(infoClass.francium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Ra":
                atomicNumber.setText(infoClass.radium[0]);
                symbol.setText(infoClass.radium[1]);
                atomicMass.setText(infoClass.radium[2]);
                name.setText(infoClass.radium[3]);
                atomicMassSmall.setText(infoClass.radium[2]);
                atomicNumberSmall.setText(infoClass.radium[0]);
                meltingPoint.setText(infoClass.radium[5]);
                boilingPoint.setText(infoClass.radium[6]);
                density.setText(infoClass.radium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Ac":
                atomicNumber.setText(infoClass.actinium[0]);
                symbol.setText(infoClass.actinium[1]);
                atomicMass.setText(infoClass.actinium[2]);
                name.setText(infoClass.actinium[3]);
                atomicMassSmall.setText(infoClass.actinium[2]);
                atomicNumberSmall.setText(infoClass.actinium[0]);
                meltingPoint.setText(infoClass.actinium[5]);
                boilingPoint.setText(infoClass.actinium[6]);
                density.setText(infoClass.actinium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Th":
                atomicNumber.setText(infoClass.thorium[0]);
                symbol.setText(infoClass.thorium[1]);
                atomicMass.setText(infoClass.thorium[2]);
                name.setText(infoClass.thorium[3]);
                atomicMassSmall.setText(infoClass.thorium[2]);
                atomicNumberSmall.setText(infoClass.thorium[0]);
                meltingPoint.setText(infoClass.thorium[5]);
                boilingPoint.setText(infoClass.thorium[6]);
                density.setText(infoClass.thorium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Pa":
                atomicNumber.setText(infoClass.protactinium[0]);
                symbol.setText(infoClass.protactinium[1]);
                atomicMass.setText(infoClass.protactinium[2]);
                name.setText(infoClass.protactinium[3]);
                atomicMassSmall.setText(infoClass.protactinium[2]);
                atomicNumberSmall.setText(infoClass.protactinium[0]);
                meltingPoint.setText(infoClass.protactinium[5]);
                boilingPoint.setText(infoClass.protactinium[6]);
                density.setText(infoClass.protactinium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "U":
                atomicNumber.setText(infoClass.uranium[0]);
                symbol.setText(infoClass.uranium[1]);
                atomicMass.setText(infoClass.uranium[2]);
                name.setText(infoClass.uranium[3]);
                atomicMassSmall.setText(infoClass.uranium[2]);
                atomicNumberSmall.setText(infoClass.uranium[0]);
                meltingPoint.setText(infoClass.uranium[5]);
                boilingPoint.setText(infoClass.uranium[6]);
                density.setText(infoClass.uranium[4]);
                frame.setFill(Paint.valueOf("#ffff0080"));
                break;
            case "Np":
                atomicNumber.setText(infoClass.neptunium[0]);
                symbol.setText(infoClass.neptunium[1]);
                atomicMass.setText(infoClass.neptunium[2]);
                name.setText(infoClass.neptunium[3]);
                atomicMassSmall.setText(infoClass.neptunium[2]);
                atomicNumberSmall.setText(infoClass.neptunium[0]);
                meltingPoint.setText(infoClass.neptunium[5]);
                boilingPoint.setText(infoClass.neptunium[6]);
                density.setText(infoClass.neptunium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Pu":
                atomicNumber.setText(infoClass.plutonium[0]);
                symbol.setText(infoClass.plutonium[1]);
                atomicMass.setText(infoClass.plutonium[2]);
                name.setText(infoClass.plutonium[3]);
                atomicMassSmall.setText(infoClass.plutonium[2]);
                atomicNumberSmall.setText(infoClass.plutonium[0]);
                meltingPoint.setText(infoClass.plutonium[5]);
                boilingPoint.setText(infoClass.plutonium[6]);
                density.setText(infoClass.plutonium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Am":
                atomicNumber.setText(infoClass.americium[0]);
                symbol.setText(infoClass.americium[1]);
                atomicMass.setText(infoClass.americium[2]);
                name.setText(infoClass.americium[3]);
                atomicMassSmall.setText(infoClass.americium[2]);
                atomicNumberSmall.setText(infoClass.americium[0]);
                meltingPoint.setText(infoClass.americium[5]);
                boilingPoint.setText(infoClass.americium[6]);
                density.setText(infoClass.americium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Cm":
                atomicNumber.setText(infoClass.curium[0]);
                symbol.setText(infoClass.curium[1]);
                atomicMass.setText(infoClass.curium[2]);
                name.setText(infoClass.curium[3]);
                atomicMassSmall.setText(infoClass.curium[2]);
                atomicNumberSmall.setText(infoClass.curium[0]);
                meltingPoint.setText(infoClass.curium[5]);
                boilingPoint.setText(infoClass.curium[6]);
                density.setText(infoClass.curium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Bk":
                atomicNumber.setText(infoClass.berkelium[0]);
                symbol.setText(infoClass.berkelium[1]);
                atomicMass.setText(infoClass.berkelium[2]);
                name.setText(infoClass.berkelium[3]);
                atomicMassSmall.setText(infoClass.berkelium[2]);
                atomicNumberSmall.setText(infoClass.berkelium[0]);
                meltingPoint.setText(infoClass.berkelium[5]);
                boilingPoint.setText(infoClass.berkelium[6]);
                density.setText(infoClass.berkelium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Cf":
                atomicNumber.setText(infoClass.californium[0]);
                symbol.setText(infoClass.californium[1]);
                atomicMass.setText(infoClass.californium[2]);
                name.setText(infoClass.californium[3]);
                atomicMassSmall.setText(infoClass.californium[2]);
                atomicNumberSmall.setText(infoClass.californium[0]);
                meltingPoint.setText(infoClass.californium[5]);
                boilingPoint.setText(infoClass.californium[6]);
                density.setText(infoClass.californium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Es":
                atomicNumber.setText(infoClass.einsteinium[0]);
                symbol.setText(infoClass.einsteinium[1]);
                atomicMass.setText(infoClass.einsteinium[2]);
                name.setText(infoClass.einsteinium[3]);
                atomicMassSmall.setText(infoClass.einsteinium[2]);
                atomicNumberSmall.setText(infoClass.einsteinium[0]);
                meltingPoint.setText(infoClass.einsteinium[5]);
                boilingPoint.setText(infoClass.einsteinium[6]);
                density.setText(infoClass.einsteinium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Fm":
                atomicNumber.setText(infoClass.fermium[0]);
                symbol.setText(infoClass.fermium[1]);
                atomicMass.setText(infoClass.fermium[2]);
                name.setText(infoClass.fermium[3]);
                atomicMassSmall.setText(infoClass.fermium[2]);
                atomicNumberSmall.setText(infoClass.fermium[0]);
                meltingPoint.setText(infoClass.fermium[5]);
                boilingPoint.setText(infoClass.fermium[6]);
                density.setText(infoClass.fermium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Md":
                atomicNumber.setText(infoClass.mendelevium[0]);
                symbol.setText(infoClass.mendelevium[1]);
                atomicMass.setText(infoClass.mendelevium[2]);
                name.setText(infoClass.mendelevium[3]);
                atomicMassSmall.setText(infoClass.mendelevium[2]);
                atomicNumberSmall.setText(infoClass.mendelevium[0]);
                meltingPoint.setText(infoClass.mendelevium[5]);
                boilingPoint.setText(infoClass.mendelevium[6]);
                density.setText(infoClass.mendelevium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "No":
                atomicNumber.setText(infoClass.nobelium[0]);
                symbol.setText(infoClass.nobelium[1]);
                atomicMass.setText(infoClass.nobelium[2]);
                name.setText(infoClass.nobelium[3]);
                atomicMassSmall.setText(infoClass.nobelium[2]);
                atomicNumberSmall.setText(infoClass.nobelium[0]);
                meltingPoint.setText(infoClass.nobelium[5]);
                boilingPoint.setText(infoClass.nobelium[6]);
                density.setText(infoClass.nobelium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Lr":
                atomicNumber.setText(infoClass.lawrencium[0]);
                symbol.setText(infoClass.lawrencium[1]);
                atomicMass.setText(infoClass.lawrencium[2]);
                name.setText(infoClass.lawrencium[3]);
                atomicMassSmall.setText(infoClass.lawrencium[2]);
                atomicNumberSmall.setText(infoClass.lawrencium[0]);
                meltingPoint.setText(infoClass.lawrencium[5]);
                boilingPoint.setText(infoClass.lawrencium[6]);
                density.setText(infoClass.lawrencium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Rf":
                atomicNumber.setText(infoClass.rutherfordium[0]);
                symbol.setText(infoClass.rutherfordium[1]);
                atomicMass.setText(infoClass.rutherfordium[2]);
                name.setText(infoClass.rutherfordium[3]);
                atomicMassSmall.setText(infoClass.rutherfordium[2]);
                atomicNumberSmall.setText(infoClass.rutherfordium[0]);
                meltingPoint.setText(infoClass.rutherfordium[5]);
                boilingPoint.setText(infoClass.rutherfordium[6]);
                density.setText(infoClass.rutherfordium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Db":
                atomicNumber.setText(infoClass.dubnium[0]);
                symbol.setText(infoClass.dubnium[1]);
                atomicMass.setText(infoClass.dubnium[2]);
                name.setText(infoClass.dubnium[3]);
                atomicMassSmall.setText(infoClass.dubnium[2]);
                atomicNumberSmall.setText(infoClass.dubnium[0]);
                meltingPoint.setText(infoClass.dubnium[5]);
                boilingPoint.setText(infoClass.dubnium[6]);
                density.setText(infoClass.dubnium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Sg":
                atomicNumber.setText(infoClass.seaborgium[0]);
                symbol.setText(infoClass.seaborgium[1]);
                atomicMass.setText(infoClass.seaborgium[2]);
                name.setText(infoClass.seaborgium[3]);
                atomicMassSmall.setText(infoClass.seaborgium[2]);
                atomicNumberSmall.setText(infoClass.seaborgium[0]);
                meltingPoint.setText(infoClass.seaborgium[5]);
                boilingPoint.setText(infoClass.seaborgium[6]);
                density.setText(infoClass.seaborgium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Bh":
                atomicNumber.setText(infoClass.bohrium[0]);
                symbol.setText(infoClass.bohrium[1]);
                atomicMass.setText(infoClass.bohrium[2]);
                name.setText(infoClass.bohrium[3]);
                atomicMassSmall.setText(infoClass.bohrium[2]);
                atomicNumberSmall.setText(infoClass.bohrium[0]);
                meltingPoint.setText(infoClass.bohrium[5]);
                boilingPoint.setText(infoClass.bohrium[6]);
                density.setText(infoClass.bohrium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Hs":
                atomicNumber.setText(infoClass.hassium[0]);
                symbol.setText(infoClass.hassium[1]);
                atomicMass.setText(infoClass.hassium[2]);
                name.setText(infoClass.hassium[3]);
                atomicMassSmall.setText(infoClass.hassium[2]);
                atomicNumberSmall.setText(infoClass.hassium[0]);
                meltingPoint.setText(infoClass.hassium[5]);
                boilingPoint.setText(infoClass.hassium[6]);
                density.setText(infoClass.hassium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Mt":
                atomicNumber.setText(infoClass.meitnerium[0]);
                symbol.setText(infoClass.meitnerium[1]);
                atomicMass.setText(infoClass.meitnerium[2]);
                name.setText(infoClass.meitnerium[3]);
                atomicMassSmall.setText(infoClass.meitnerium[2]);
                atomicNumberSmall.setText(infoClass.meitnerium[0]);
                meltingPoint.setText(infoClass.meitnerium[5]);
                boilingPoint.setText(infoClass.meitnerium[6]);
                density.setText(infoClass.meitnerium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Ds":
                atomicNumber.setText(infoClass.darmstadtium[0]);
                symbol.setText(infoClass.darmstadtium[1]);
                atomicMass.setText(infoClass.darmstadtium[2]);
                name.setText(infoClass.darmstadtium[3]);
                atomicMassSmall.setText(infoClass.darmstadtium[2]);
                atomicNumberSmall.setText(infoClass.darmstadtium[0]);
                meltingPoint.setText(infoClass.darmstadtium[5]);
                boilingPoint.setText(infoClass.darmstadtium[6]);
                density.setText(infoClass.darmstadtium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Rg":
                atomicNumber.setText(infoClass.roentgenium[0]);
                symbol.setText(infoClass.roentgenium[1]);
                atomicMass.setText(infoClass.roentgenium[2]);
                name.setText(infoClass.roentgenium[3]);
                atomicMassSmall.setText(infoClass.roentgenium[2]);
                atomicNumberSmall.setText(infoClass.roentgenium[0]);
                meltingPoint.setText(infoClass.roentgenium[5]);
                boilingPoint.setText(infoClass.roentgenium[6]);
                density.setText(infoClass.roentgenium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Cn":
                atomicNumber.setText(infoClass.copernicium[0]);
                symbol.setText(infoClass.copernicium[1]);
                atomicMass.setText(infoClass.copernicium[2]);
                name.setText(infoClass.copernicium[3]);
                atomicMassSmall.setText(infoClass.copernicium[2]);
                atomicNumberSmall.setText(infoClass.copernicium[0]);
                meltingPoint.setText(infoClass.copernicium[5]);
                boilingPoint.setText(infoClass.copernicium[6]);
                density.setText(infoClass.copernicium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Nh":
                atomicNumber.setText(infoClass.nihonium[0]);
                symbol.setText(infoClass.nihonium[1]);
                atomicMass.setText(infoClass.nihonium[2]);
                name.setText(infoClass.nihonium[3]);
                atomicMassSmall.setText(infoClass.nihonium[2]);
                atomicNumberSmall.setText(infoClass.nihonium[0]);
                meltingPoint.setText(infoClass.nihonium[5]);
                boilingPoint.setText(infoClass.nihonium[6]);
                density.setText(infoClass.nihonium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Fl":
                atomicNumber.setText(infoClass.flerovium[0]);
                symbol.setText(infoClass.flerovium[1]);
                atomicMass.setText(infoClass.flerovium[2]);
                name.setText(infoClass.flerovium[3]);
                atomicMassSmall.setText(infoClass.flerovium[2]);
                atomicNumberSmall.setText(infoClass.flerovium[0]);
                meltingPoint.setText(infoClass.flerovium[5]);
                boilingPoint.setText(infoClass.flerovium[6]);
                density.setText(infoClass.flerovium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Mc":
                atomicNumber.setText(infoClass.moscovium[0]);
                symbol.setText(infoClass.moscovium[1]);
                atomicMass.setText(infoClass.moscovium[2]);
                name.setText(infoClass.moscovium[3]);
                atomicMassSmall.setText(infoClass.moscovium[2]);
                atomicNumberSmall.setText(infoClass.moscovium[0]);
                meltingPoint.setText(infoClass.moscovium[5]);
                boilingPoint.setText(infoClass.moscovium[6]);
                density.setText(infoClass.moscovium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Lv":
                atomicNumber.setText(infoClass.livermorium[0]);
                symbol.setText(infoClass.livermorium[1]);
                atomicMass.setText(infoClass.livermorium[2]);
                name.setText(infoClass.livermorium[3]);
                atomicMassSmall.setText(infoClass.livermorium[2]);
                atomicNumberSmall.setText(infoClass.livermorium[0]);
                meltingPoint.setText(infoClass.livermorium[5]);
                boilingPoint.setText(infoClass.livermorium[6]);
                density.setText(infoClass.livermorium[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Ts":
                atomicNumber.setText(infoClass.tennessine[0]);
                symbol.setText(infoClass.tennessine[1]);
                atomicMass.setText(infoClass.tennessine[2]);
                name.setText(infoClass.tennessine[3]);
                atomicMassSmall.setText(infoClass.tennessine[2]);
                atomicNumberSmall.setText(infoClass.tennessine[0]);
                meltingPoint.setText(infoClass.tennessine[5]);
                boilingPoint.setText(infoClass.tennessine[6]);
                density.setText(infoClass.tennessine[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            case "Og":
                atomicNumber.setText(infoClass.oganesson[0]);
                symbol.setText(infoClass.oganesson[1]);
                atomicMass.setText(infoClass.oganesson[2]);
                name.setText(infoClass.oganesson[3]);
                atomicMassSmall.setText(infoClass.oganesson[2]);
                atomicNumberSmall.setText(infoClass.oganesson[0]);
                meltingPoint.setText(infoClass.oganesson[5]);
                boilingPoint.setText(infoClass.oganesson[6]);
                density.setText(infoClass.oganesson[4]);
                frame.setFill(Paint.valueOf("#9e9e9e80"));
                break;
            default:
                break;
        }
    }    
    
}
