/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faaiez Mohammed
 */
public class Payment {

    // Fields
    private String payStatus;
    private String payPlan;

    // Constructor
    public Payment() {

    }

    // Methods
    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus;
    }

    String getStatus() {
        return this.payStatus;
    }

    public String getPayPlan() {
        return payPlan;
    }

    public void setPayPlan(String payPlan) {
        this.payPlan = payPlan;
    }

    String getPlan() {
        return this.payPlan;
    }
}
