package ContactManagementSystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();
        Scanner input = new Scanner(System.in);
        int option = 0;

        while(option != 6){
            System.out.println("1. Add New Contact");
            System.out.println("2. View Contact List");
            System.out.println("3. Search a Contact");
            System.out.println("4. Update the Contact");
            System.out.println("5. Delete the Contact");

            option = input.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter Contact name: ");
                    String name = input.next();
                    System.out.println("Enter Phone Number: ");
                    String phone = input.next();
                    System.out.println("Enter Email: ");
                    String email = input.next();
                    contactManager.addContact(name, phone, email);
                    break;
                case 2:
                    contactManager.viewContacts();
                    break;
                case 3:
                    System.out.println("Enter  Contact Name: ");
                    String searchName = input.next();
                    contactManager.searchContact(searchName);
                    break;
                case 4:
                    System.out.println("Enter the Name to be Updated: ");
                    String updateName = input.next();
                    contactManager.updateContact(updateName);
                    break;
                case 5:
                    System.out.println("Enter the name to be Deleted: ");
                    String deleteName = input.next();
                    contactManager.deleteContact(deleteName);
                    break;
                default:
                    break;
            }
        }
    }

}
