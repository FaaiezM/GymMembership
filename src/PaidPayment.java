/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Test
 */
public class PaidPayment extends PaymentStatus {

    String payStatus = "Paid";

    public PaidPayment() {

    }

    @Override
    public String getStatus() {
        return this.payStatus;
    }

}
