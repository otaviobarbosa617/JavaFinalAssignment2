/*

COMP 2130 - Application Development using Java - Final Project
Janine Mae Usana - 101328279
Omar Nabi - 101339235
Otavio Pereira-Barbosa - 101337690

 */
package javafinalassignment2;

public class JavaFinalAssignment2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContactManager cm1 = new ContactManager();
        cm1.setContact("Otavio","Barbosa","6474623407","None",
                "265 Balliol","Apt 2008","Toronto", "M4S1C9",
                "ON", "CA", "otavio@otaviophoto.com", 19,06,1988,"None");
        cm1.findContact("Otavio");
        cm1.viewContactList();
        cm1.deleteContact("Otavio");
        cm1.viewContactList();




//        Testing the constructors

//        Address ad1 = new Address("Test", "Test","Test","test", "test", "test");
//        MyDate dt1 = new MyDate(12,12,12);
//        String d = dt1.toString();
//        String a = ad1.toString();
//        System.out.println(a);
//        System.out.println(d);
//        Contact cm2 = new Contact("Otavio","Pereira",
//                "647562","None",
//                ad1,"otavio", dt1 , "test");
//        String c = cm2.toString();
//        System.out.println(c);


    }
    
}
