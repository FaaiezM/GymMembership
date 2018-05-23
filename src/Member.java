
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Faaiez Mohammed
 */
public class Member {

    // Fields
    private String firstName;
    private String lastName;
    private int id;
    private ACTIVITIES activity;
    private int m = 0;
    private Membership memType;
    private Payment payStatus;
    private Payment payPlan;

    // ArrayList to store member information
    ArrayList<Member> members = new ArrayList<>();

    // Scanner to allow user input
    Scanner sc = new Scanner(System.in);

    // Constructor
    public Member(String firstName, String lastName, int id, ACTIVITIES activity) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.activity = activity;
    }

    // Methods
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ACTIVITIES getActivity() {
        return activity;
    }

    public void setActivity(ACTIVITIES activity) {
        this.activity = activity;
    }

    // Sets the membership type in switch statement
    public void setMemType(Membership memType) {
        this.memType = memType;
    }

    // Sets the payment plan in switch statement
    public void setPayPlan(Payment payPlan) {
        this.payPlan = payPlan;
    }

    // Sets the payment status in switch statement
    public void setPayStatus(Payment payStatus) {
        this.payStatus = payStatus;
    }

    // Adds members to the system
    public void addMembers() {
        // Variable used in while to loop addmembers() method
        String addMember;
        // Do/While loop used to loop addMembers() method
        do {
            System.out.print("First Name: ");
            String inputFirstName = sc.nextLine();

            System.out.print("\nLast Name: ");
            String inputLastName = sc.nextLine();

            // Lists all activities present in enum class and assigns numbers
            for (int i = 0; i < ACTIVITIES.values().length; i++) {
                System.out.print("Option (" + i + "): " + ACTIVITIES.values()[i] + "\n");
            }

            // Allows user to select inputActivity using int values
            System.out.print("Select Activity: ");
            ACTIVITIES inputActivity = ACTIVITIES.values()[sc.nextInt()];
            sc.nextLine();

            // Stores new member information to object
            Member newMember = new Member(inputFirstName, inputLastName, m, inputActivity);

            // Increments member ID counter
            m++;

            System.out.println();
            System.out.println("Select Membership Type: ");
            System.out.println(" 1) Trial Member \n 2) Three Month Member \n 3) Annual Member");

            // Switch statement to select member's membership type
            switch (sc.nextInt()) {
                case 1:
                    // Sets the member's membership type to trial membership
                    newMember.setMemType(new TrialMembership());
                    break;
                case 2:
                    // Sets the member's membership type to three months
                    newMember.setMemType(new ThreeMonthMembership());
                    break;
                case 3:
                    // Sets the member's membership type to Annual
                    newMember.setMemType(new AnnualMembership());
                    break;
            }

            System.out.println();
            System.out.println("Select Payment Plan: ");
            System.out.println(" 1) Monthly Payment \n 2) Annual Payment");

            // Switch statement to select the member's payment plan
            switch (sc.nextInt()) {
                case 1:
                    // Sets the member's payment plan to monthly payments
                    newMember.setPayPlan(new MonthlyPayment());
                    break;
                case 2:
                    // Sets the member's payment plan to annual payments
                    newMember.setPayPlan(new AnnualPayment());
                    break;
            }

            System.out.println();
            System.out.println("Select Whether Or Not the Member Has Paid");
            System.out.println(" 1) Has Paid \n 2) Has not Paid");
            // Switch statement to set whether or not the member has made a payment
            switch (sc.nextInt()) {
                case 1:
                    // Sets the member's payment status to paid
                    newMember.setPayStatus(new PaidPayment());
                    break;
                case 2:
                    // Sets the member's payment status to overdue
                    newMember.setPayStatus(new OverduePayment());
                    break;
            }

            System.out.println();

            // Prints out member information after creation
            System.out.println(newMember);

            // Adds newly created member to Member ArrayList
            members.add(newMember);

            // If user types Y, the addMember method is executed again
            System.out.println("Would you like to add another member? (Y/N)");
            addMember = sc.nextLine();

        } while (addMember.equalsIgnoreCase("Y"));
        System.out.println();
    }

    // Prints all members in system and their information in "View members"
    public String loopMembers() {
        String data = "";
        for (Member memberInfo : members) {
            data += memberInfo.toString();
        }
        return data;
    }

    // Prints members and their information
    @Override
    public String toString() {
        return "MemberInfo{"
                + "First Name: '" + firstName + '\''
                + ", Last Name: '" + lastName + '\''
                + ", Member ID: " + id
                + ", Activity: " + activity
                + ", Membership Type: " + memType.getType()
                + ", Payment Plan: " + payPlan.getPlan()
                + ", Payment Status: " + payStatus.getStatus() + '}' + "\n";
    }

    // Removes a member from the ArrayList in "Remove Members" using member ID
    public ArrayList<Member> deleteMember(int m) {
        members.remove(m);
        return members;

    }
}
