/*
@ Author : Noufal MC
@ Date   : 02/02/2022
Create Address Book Using ArrayList


* */
package corejava;

import java.util.ArrayList;
import java.util.*;
class  Contacts
{
    String firstName;
    String lastName;
    String city;
    String address;
    String email;
    String mobile;
    int pincode;
    Contacts(String firstName,String lastName,String city,String address,String email,String mobile,int pincode)
    {
        this.firstName=firstName;
        this.lastName=lastName;
        this.city=city;
        this.address=address;
        this.email=email;
        this.mobile=mobile;
        this.pincode=pincode;
    }
}
public class ContactList {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner sc=new Scanner(System.in);
        final int  ADD_CONTACTS=1;
        final int  EDIT_CONTACTS=2;
        int choice,pincode;
        //(Declaring List of Person type)
        ArrayList<Contacts> list=new ArrayList<>();
        String lastName,address,email,city,mobile,firstName,search;
        do {
            System.out.println("[1] - Add Contacts");
            System.out.println("[2] - Edit Contacts");
            System.out.println("[3] - Delete");
            System.out.println("[4] - Display");
            System.out.println("[5] - Exit");
            choice=sc.nextInt();
            switch (choice)
            {
                case ADD_CONTACTS:
                    sc.nextLine();
                    System.out.println("Enter the FirstName");
                    firstName=sc.nextLine();
                    System.out.println("Enter the LastName");
                    lastName=sc.nextLine();
                    System.out.println(lastName);
                    System.out.println("Enter the Address");
                    address=sc.nextLine();
                    System.out.println("Enter the City");
                    city=sc.nextLine();
                    System.out.println("Enter the Email");
                    email=sc.nextLine();
                    System.out.println("Enter the Mobile");
                    mobile=sc.nextLine();
                    System.out.println("Enter the Pincode");
                    pincode=sc.nextInt();
                    Contacts c1=new Contacts(firstName,lastName,city,address,email,mobile,pincode);
                    // Adding objects to the ArrayList
                    list.add(c1);
                    System.out.println("List size"+list.size());
                    break;
                case EDIT_CONTACTS:
                    sc.nextLine();
                    System.out.println("Enter Item Wants to be EDIT");
                    search=sc.nextLine();
                    for(int i=0;i< list.size();i++)
                    {
                        if (list.get(i).firstName.equals(search))
                        {
                            sc.nextLine();
                            System.out.println("Enter the FirstName");
                            firstName=sc.nextLine();
                            System.out.println("Enter the LastName");
                            lastName=sc.nextLine();
                            System.out.println(lastName);
                            System.out.println("Enter the Address");
                            address=sc.nextLine();
                            System.out.println("Enter the City");
                            city=sc.nextLine();
                            System.out.println("Enter the Email");
                            email=sc.nextLine();
                            System.out.println("Enter the Mobile");
                            mobile=sc.nextLine();
                            System.out.println("Enter the Pincode");
                            pincode=sc.nextInt();
                            System.out.println("List size"+list.size());
                            Contacts c2=new Contacts(firstName,lastName,city,address,email,mobile,pincode);
                            // Update objects to the ArrayList
                            list.set(i,c2);
                        }
                    }
                    break;


            }
        }while(choice!=5);

    }
}
