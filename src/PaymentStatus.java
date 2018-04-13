/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Faaiez Mohammed
 */
public class PaymentStatus {

    // Fields
    private boolean isPaid;
    private boolean monthlyPayment = true;

    // Constructor
    public PaymentStatus(boolean isPaid) {
        // if/else that returns value depending on
        if (isPaid == false) {
            System.out.println("You have an overdue payment");
        } else {
            System.out.println("You have paid for this month");
        }
    }

    // Methods
    public boolean isIsPaid() {
        return isPaid;
    }

    public void setIsPaid(boolean isPaid) {
        this.isPaid = isPaid;
    }

}
