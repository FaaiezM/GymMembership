/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Test
 */
public class AnnualPayment extends PaymentPlan {

    String payPlan = "Annual";

    public AnnualPayment() {

    }

    @Override
    public String getPlan() {
        return this.payPlan;
    }
}
