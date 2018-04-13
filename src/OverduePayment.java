/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Test
 */
public class OverduePayment extends PaymentStatus {

    String payStatus = "Overdue";

    public OverduePayment() {

    }

    @Override
    public String getStatus() {
        return this.payStatus;
    }

}
