package javafinalassignment2;

import java.util.ArrayList;
import java.util.List;

public class ContactManager {
    //Declarations
    private Contact contact;
    private MyDate date;
    private Address address;
    private List<Contact> contactList;
    private int indexOf;

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
        System.out.println("Contact " + name + " " + lastName + " added to the Contact list");
    }

    public void viewContactList(){
        System.out.println("List of All Contacts:");
        System.out.println(contactList);
    }

    public List<Contact> getContactList(){
        return contactList;
    }

    public boolean findContact(String name, String lastName){
        indexOf = 0;
        if (contactList.size() > 0){
            for (int i = 0; i < contactList.size(); i++){
                if (contactList.get(i).getFirstName().contains(name) && contactList.get(i).getLastName().contains(lastName)){
                    System.out.println("User found:");
                    System.out.println(contactList.get(i).toString());
                    indexOf = i;
                    System.out.println("This user has index of " + indexOf);
                }
            }
            return true;
        }
        else{
            return false;
        }
    }
    public boolean deleteContact(String name, String lastName){
        if (contactList.size() > 0){
            for (int i = 0; i < contactList.size(); i++){
                if(contactList.get(i).getFirstName().contains(name) && contactList.get(i).getLastName().contains(lastName)){
                    contactList.remove(i);
                    System.out.println("Contact " +name+ " " +lastName+ " removed");
                }
            }
            return true;
        }

        else{
            return false;
        }
    }

    public boolean contactsByCity(String city){
        List<Contact> contactsFiltered = new ArrayList<Contact>();
        if (contactList.size() > 0){
            for (int i = 0; i < contactList.size(); i++){
                if (contactList.get(i).getHomeAddress().city.contains(city)){
                    contactsFiltered.add(contactList.get(i));
                }
            }
            System.out.println("Users with "+city+ " as City:");
            System.out.println(contactsFiltered);
            return true;
        }
        return false;
    }

    public int getIndexOf(){
        return indexOf;
    }

    public void modify(){

    }


}
