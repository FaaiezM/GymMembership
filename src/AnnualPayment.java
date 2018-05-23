/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faaiez Mohammed
 */
public class AnnualPayment extends Payment {

    // Field
    private final String payPlan = "Annual";

    // Constructor
    public AnnualPayment() {

    }

    // Overrides method in Payment
    @Override
    public String getPlan() {
        return this.payPlan;
    }
}
