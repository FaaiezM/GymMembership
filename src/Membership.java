/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faaiez Mohammed
 */
public class Membership {

    // Fields
    private String MEMTYPE;

    // Constructor
    public Membership(String MEMTYPE) {
        this.MEMTYPE = MEMTYPE;
    }

    public Membership() {
    }

    // Methods
    public String getMEMTYPE() {
        return ("You currently have a(n) " + MEMTYPE + " membership.");
    }

    public void setMEMTYPE(String MEMTYPE) {
        this.MEMTYPE = MEMTYPE;
    }

    public void removeMEMTYPE() {

    }

    String getType() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
