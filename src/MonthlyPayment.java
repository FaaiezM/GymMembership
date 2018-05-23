/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faaiez Mohammed
 */
public class MonthlyPayment extends Payment {

    // Field
    private final String payPlan = "Monthly";

    // Constructor
    public MonthlyPayment() {

    }

    // Overrides method in Payment class
    @Override
    public String getPlan() {
        return this.payPlan;
    }
}
