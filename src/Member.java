
import java.util.ArrayList;
import java.util.Scanner;

public class Member {

    // Fields
    private String firstName1;
    private String lastName1;
    private int m1;
    private ACTIVITIES activity1;
    int m = 0;
    private Membership memType;
    private Payment payStatus;
    private Payment payPlan;

    ArrayList<Member> members = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    // Constructor
    public Member(String firstName1, String lastName1, int m1, ACTIVITIES activity1) {
        this.firstName1 = firstName1;
        this.lastName1 = lastName1;
        this.m1 = m1;
        this.activity1 = activity1;
    }

    // Methods
    public String getFirstName1() {
        return firstName1;
    }

    public void setFirstName1(String firstName1) {
        this.firstName1 = firstName1;
    }

    public String getLastName1() {
        return lastName1;
    }

    public void setLastName1(String lastName1) {
        this.lastName1 = lastName1;
    }

    public int getM1() {
        return m1;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public ACTIVITIES getActivity1() {
        return activity1;
    }

    public void setActivity1(ACTIVITIES activity1) {
        this.activity1 = activity1;
    }

    public Membership getMemType() {
        return memType;
    }

    public void setMemType(Membership memType) {
        this.memType = memType;
    }

    public void setPayPlan(PaymentPlan payPlan) {
        this.payPlan = payPlan;
    }

    public void setPayStatus(PaymentStatus payStatus) {
        this.payStatus = payStatus;
    }

    public void addMembers() {
        String addMember;
        do {
            System.out.print("First Name: ");
            String firstName = sc.nextLine();

            System.out.print("\nLast Name: ");
            String lastName = sc.nextLine();

            for (int i = 0; i < ACTIVITIES.values().length; i++) {
                System.out.print("Option (" + i + "): " + ACTIVITIES.values()[i] + "\n");
            }

            System.out.print("Select Activity: ");
            ACTIVITIES activity = ACTIVITIES.values()[sc.nextInt()];
            sc.nextLine();

            Member newMember = new Member(firstName, lastName, m, activity);
            m++;

            System.out.println("Select MemType");
            System.out.println(" 1) Trial Member \n 2) Three Month Member \n 3) Annual Member");
            switch (sc.nextInt()) {
                case 1:
                    newMember.setMemType(new TrialMembership());
                    break;
                case 2:
                    newMember.setMemType(new ThreeMonthMembership());
                    break;
                case 3:
                    newMember.setMemType(new AnnualMembership());
                    break;
            }

            System.out.println("Select payPlan");
            System.out.println(" 1) Monthly Payment \n 2) Annual Payment");
            switch (sc.nextInt()) {
                case 1:
                    newMember.setPayPlan(new MonthlyPayment());
                    break;
                case 2:
                    newMember.setPayPlan(new AnnualPayment());
                    break;
            }

            System.out.println("Select isPaid");
            System.out.println(" 1) Has Paid \n 2) Has not Paid");
            switch (sc.nextInt()) {
                case 1:
                    newMember.setPayStatus(new PaidPayment());
                    break;
                case 2:
                    newMember.setPayStatus(new OverduePayment());
                    break;
            }

            System.out.println(newMember);
            members.add(newMember);
            System.out.println("Would you like to add another member? (Y/N)");
            addMember = sc.nextLine();

        } while (addMember.equalsIgnoreCase("Y"));
        System.out.println();
    }

    public String loopMembers() {
        String data = "";
        for (Member memberInfo : members) {
            data += memberInfo.toString();
        }
        return data;
    }

    @Override
    public String toString() {
        return "Member{"
                + "firstName='" + firstName1 + '\''
                + ", lastName='" + lastName1 + '\''
                + ", ID_NUM=" + m1
                + ", activity=" + activity1
                + ", Membership Type: " + memType.getType()
                + ", Payment Plan: " + payPlan.getPlan()
                + ", Payment Status: " + payStatus.getStatus() + '}' + "\n";
    }

    public ArrayList<Member> deleteMember(int m) {
        members.remove(m);
        return members;

    }
}
