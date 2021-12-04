package javafinalassignment2;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    //Declarations
    private Contact contact;
    private MyDate date;
    private Address address;
    private List<Contact> contactList;

    public ContactManager(){
        contactList = new ArrayList<Contact>();
    }
    public void setContact(String name, String lastName, String homePhone,
                           String workPhone, String st1, String st2, String city, String postCode,
                           String prov, String country, String email, int day, int month, int year, String notes ) {
        date = new MyDate(day, month,year);
        address = new Address(st1, st2, city, postCode, prov,country);
        contact = new Contact(name, lastName, homePhone, workPhone, address, email, date, notes);
        contactList.add(contact);
    }

    public void viewContactList(){
       System.out.println(contactList);
    }

    public boolean findContact(String name){
        for (int i = 0; i < contactList.size(); i++){
            if (contactList.get(i).getFirstName().contains(name)){
                return true;
            }
        }
        return false;
    }

    public boolean deleteContact(String name){
        if (contactList.size() > 0){
            for (int i = 0; i < contactList.size(); i++){
                if(contactList.get(i).getFirstName().contains(name)){
                    contactList.remove(i);
                    System.out.println("Contact removed");
                }
            }
            return true;
        }

        else{
            return false;
        }
    }
}
