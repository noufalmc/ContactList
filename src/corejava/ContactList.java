/*
@ Author : Noufal MC
@ Date   : 02/02/2022
Create Address Book Using ArrayList


* */
package corejava;

import java.util.ArrayList;
import java.util.*;
class Address
{
    ArrayList<Contacts> list=new ArrayList<>();
    Scanner sc=new Scanner(System.in);
    int pincode,editField;
    //For Check whether data present or not during searching
    int status;
    String lastName,address,email,city,mobile,firstName,search;
    public void addContact()
    {
        System.out.println("Enter the FirstName");
        firstName=sc.nextLine();
        System.out.println("Enter the LastName");
        lastName=sc.nextLine();
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
    }
    public void editContact()
    {

        status=0;
        sc.nextLine();
        System.out.println("Enter FirstName Wants to be EDIT");
        search=sc.nextLine();
        for(int i=0;i< list.size();i++)
        {

            if (list.get(i).firstName.equals(search))
            {
                status=1;
                System.out.println("Which fields want to be edit");
                System.out.println("[1] First Name");
                System.out.println("[2] Last Name");
                System.out.println("[3] Address");
                System.out.println("[4] City");
                System.out.println("[5] Email");
                System.out.println("[6] Mobile");
                System.out.println("[7] Pincode");
                editField=sc.nextInt();
                switch (editField)
                {
                    case 1:
                        sc.nextLine();
                        System.out.println("Enter the FirstName");
                        firstName=sc.nextLine();
                        System.out.println("UPADTED FIRST NAME"+firstName);
                        list.get(i).setFirstName(firstName);
                        break;

                    case 2:
                        sc.nextLine();
                        System.out.println("Enter the lastName");
                        lastName=sc.nextLine();
                        System.out.println("UPADTED LAST NAME "+lastName);
                        list.get(i).setLastName(lastName);
                        break;
                    case 3:
                        sc.nextLine();
                        System.out.println("Enter the Address");
                        address=sc.nextLine();
                        System.out.println("UPADTED Adress"+address);
                        list.get(i).setAddress(address);
                        break;
                    case 4:
                        sc.nextLine();
                        System.out.println("Enter the City");
                        city=sc.nextLine();
                        list.get(i).setCity(city);
                        System.out.println("UPADTED CITY "+city);
                        break;
                    case 5:
                        sc.nextLine();
                        System.out.println("Enter the Email");
                        email=sc.nextLine();
                        list.get(i).setEmail(email);
                        System.out.println("UPADTED EMAIL "+email);
                        break;
                    case 6:
                        sc.nextLine();
                        System.out.println("Enter the Mobile");
                        mobile=sc.nextLine();
                        list.get(i).setMobile(mobile);
                        System.out.println("UPADTED MOBILE "+mobile);
                        break;
                    case 7:
                        sc.nextLine();
                        System.out.println("Enter the Pincode");
                        pincode=sc.nextInt();
                        list.get(i).setPincode(pincode);
                        System.out.println("UPADTED PINCODE "+pincode);
                }


            }

        }
        if(status==0)
        {
            System.out.println("Item Not Found");
        }
    }
    public void del()
    {
        int status=0;
        sc.nextLine();
        System.out.println("Enter Name Wants to be DELETE");
        String search=sc.nextLine();
        for(int i=0;i< list.size();i++)
        {

            firstName=list.get(i).firstName;
            if(Objects.equals(firstName, search))
            {
                status=1;
                list.remove(i);
                System.out.println("The "+firstName+" removed From List");
            }
        }
        if(status==0)
        {
            System.out.println("Item Not Found");
        }
    }
    public void display()
    {
        for(int i=0;i<list.size();i++)
        {
            System.out.println("First Name " + list.get(i).firstName);
            System.out.println("Last Name " + list.get(i).lastName);
            System.out.println("Address " + list.get(i).address);
            System.out.println("City " + list.get(i).city);
            System.out.println("Email " + list.get(i).email);
            System.out.println("Pincode " + list.get(i).pincode);
        }
        if(list.isEmpty())
        {
            System.out.println("The List Is Empty");
        }
    }
}
public class ContactList {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner sc=new Scanner(System.in);
        Address obj=new Address();
        //Initialise Constants
        final int  ADD_CONTACTS=1;
        final int  EDIT_CONTACTS=2;
        final int DELETE=3;
        final int DISPLAY=4;
        //(Declaring List of Person type)
        int choice;
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
                    obj.addContact();
                    break;
                case EDIT_CONTACTS:
                    obj.editContact();
                    break;
                case DELETE:
                    obj.del();
                    break;

                case DISPLAY:
                        obj.display();
                        break;

            }
        }while(choice!=5);
        
    }
}
