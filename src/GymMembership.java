
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
public class GymMembership {

    public static void main(String[] args) {
        // Holds member ID
        int id = 0;

        // Mem object that takes in member values as paramenters
        Member newMem = new Member("firstName", "lastName", id, ACTIVITIES.BADMINTON);

        // Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // While loop to execute menu interface
        while (true) {
            System.out.println("Welcome. Please select an option from the menu: ");
            System.out.println(" 1) Add Members \n 2) View Members \n 3) Remove Members \n 4) Exit");

            // User input for switch statement
            int gymMenu = sc.nextInt();
            sc.nextLine();

            // Switch statement used to create program menu
            switch (gymMenu) {
                case 1:
                    System.out.println("Add Members");
                    // Adds a new member to member ArrayList
                    newMem.addMembers();
                    break;
                case 2:
                    System.out.println("View Members");
                    // Prints current members in ArrayList
                    System.out.println(newMem.loopMembers());
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Remove Members");
                    System.out.println("Please enter the ID number of the member to remove: ");
                    sc.nextLine();
                    // Deletes member from ArrayList using their ID number
                    newMem.deleteMember(id);
                    System.out.println("Member successfully removed.");
                    System.out.println();
                    break;
                default:
                    // Exits the code
                    System.exit(0);
            }
        }

    }

}
