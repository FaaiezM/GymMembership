/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faaiez Mohammed
 */
public class AnnualMembership extends Membership {

    String memType = "You have an annual membership.";

    public AnnualMembership() {

    }

    @Override
    public String getType() {
        return this.memType;
    }

}
