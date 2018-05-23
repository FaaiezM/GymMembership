/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faaiez Mohammed
 */
public class ThreeMonthMembership extends Membership {

    // Field
    private final String memType = "Three Month";

    // Constructor
    public ThreeMonthMembership() {

    }

    // Overrides method in Membership class
    @Override
    public String getType() {
        return this.memType;
    }

}
