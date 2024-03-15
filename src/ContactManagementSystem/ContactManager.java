package ContactManagementSystem;

import java.util.Scanner;
import java.util.TreeSet;

public class ContactManager {
    Scanner input = new Scanner(System.in);
    TreeSet<Contact> set = new TreeSet<>();
    boolean found;

    //add contact
    public void addContact(String name, String phnNo, String email){
        Contact newContact = new Contact(name, phnNo, email);
        set.add(newContact);
        System.out.println("New Contact Added successfully!!");
    }
    //view all contacts
    public void viewContacts(){
        for(Contact c : set){
            System.out.println(c.toString());
        }
    }
    // search contact
    public void searchContact(String name){
        found = false;
        for (Contact contact:set){
            if(contact.getName().equalsIgnoreCase(name)){
                found = true;
                System.out.println(name + " contact is found.");
                System.out.println(contact);
                break;
            }
        }
        if(!found) {
            System.out.println(name + " contact is not found");
        }

    }
    //update contact
    public void updateContact(String name){
        found = false;
        for(Contact contact: set) {
            if (contact.getName().equalsIgnoreCase(name)) {
                found = true;
                System.out.println("Enter New Contact Information: ");
                System.out.print("Enter New Phone Number: ");
                contact.setPhone_number(input.next());
                System.out.println("Enter New Email: ");
                contact.setEmail(input.next());
                System.out.println("Contact Information Update Successfully!!");
                break;
            }
        }
        if(!found) {
            System.out.println(name + " is not found in the Set");
        }
    }
    //delete contact
    public void deleteContact(String name) {
        found = false;
        for (Contact contact : set) {
            if (contact.getName().equalsIgnoreCase(name)) {
                found = true;
                set.remove(contact);
                System.out.println("Delete the Contact Successfully.");
                break;
            }
        }
        if(!found) {
            System.out.println(name + " is not present in the Set.");
        }
    }
}
