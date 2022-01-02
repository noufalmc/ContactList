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
    public void setFirstName(String  firstName)
    {
        this.firstName=firstName;
    }
    public void setLastName(String  lastName)
    {
        this.lastName=lastName;
    }
    public void setAddress(String address)
    {
        this.address=address;
    }
    public void setCity(String city)
    {
        this.city=city;
    }
    public void setEmail(String email)
    {
        this.email=email;
    }
    public  void  setMobile(String mobile)
    {
        this.mobile=mobile;
    }
    public void  setPincode(int pincode)
    {
        this.pincode=pincode;
    }
}
public class ContactList {

    public static void main(String[] args) {
        System.out.println("Welcome to Address Book");
        Scanner sc=new Scanner(System.in);
        //Initialise Constants
        final int  ADD_CONTACTS=1;
        final int  EDIT_CONTACTS=2;
        final int DELETE=3;
        final int DISPLAY=4;
        final int FIRST_NAME=1;
        final int LAST_NAME=2;
        final int ADDRESS=3;
        final int CITY=4;
        final int EMAIL=5;
        final int MOBILE=6;
        final int PINCODE=7;
        //(Declaring List of Person type)
        ArrayList<Contacts> list=new ArrayList<>();
        int choice,pincode,editField;
        //Check whether data present or not during searching
        int status;
        String lastName,address,email,city,mobile,firstName,search,fullName;
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
                    status=0;
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
                                case FIRST_NAME:
                                    sc.nextLine();
                                    System.out.println("Enter the FirstName");
                                    firstName=sc.nextLine();
                                    list.get(i).setFirstName(firstName);
                                    System.out.println("UPADTED FIRST NAME"+firstName);
                                    break;

                                case LAST_NAME:
                                    sc.nextLine();
                                    System.out.println("Enter the lastName");
                                    lastName=sc.nextLine();
                                    list.get(i).setLastName(lastName);
                                    System.out.println("UPADTED LAST NAME"+lastName);
                                    break;
                                case ADDRESS:
                                    sc.nextLine();
                                    System.out.println("Enter the Address");
                                    address=sc.nextLine();
                                    list.get(i).setAddress(address);
                                    System.out.println("UPADTED Adress"+address);
                                    break;
                                case CITY:
                                    sc.nextLine();
                                    System.out.println("Enter the City");
                                    city=sc.nextLine();
                                    list.get(i).setCity(city);
                                    System.out.println("UPADTED CITY"+city);
                                    break;
                                case EMAIL:
                                    sc.nextLine();
                                    System.out.println("Enter the Email");
                                    email=sc.nextLine();
                                    list.get(i).setEmail(email);
                                    System.out.println("UPADTED EMAIL"+email);
                                    break;
                                case MOBILE:
                                    sc.nextLine();
                                    System.out.println("Enter the Mobile");
                                    mobile=sc.nextLine();
                                    list.get(i).setMobile(mobile);
                                    System.out.println("UPADTED MOBILE"+mobile);
                                    break;
                                case PINCODE:
                                    sc.nextLine();
                                    System.out.println("Enter the Pincode");
                                    pincode=sc.nextInt();
                                    list.get(i).setPincode(pincode);
                                    System.out.println("UPADTED PINCODE"+pincode);
                            }


                        }

                    }
                    if(status==0)
                    {
                        System.out.println("Item Not Found");
                    }
                    break;
                case DELETE:
                    status=0;
                    sc.nextLine();
                    System.out.println("Enter Name Wants to be DELETE");
                    search=sc.nextLine();
                    for(int i=0;i< list.size();i++)
                    {

                        firstName=list.get(i).firstName;
                        if(Objects.equals(firstName, search))
                        {
                            status=1;
                            list.remove(i);

                        }
                    }
                    if(status==0)
                    {
                        System.out.println("Item Not Found");
                    }
                    break;

                case DISPLAY:
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
                        break;

            }
        }while(choice!=5);
        
    }
}
