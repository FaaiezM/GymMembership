/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faaiez Mohammed
 */
public class OverduePayment extends Payment {

    // Field
    private final String payStatus = "Overdue";

    // Constructor
    public OverduePayment() {

    }

    // Overrides method in Payment class
    @Override
    public String getStatus() {
        return this.payStatus;
    }

}
