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
    private String memType;

    // Constructor
    public Membership() {
    }

    // Methods
    public String getMemType() {
        return memType;
    }

    public void setMemType(String memType) {
        this.memType = memType;
    }

    // Gets the type of Membership the member has
    public String getType() {
        return this.memType;
    }

}
