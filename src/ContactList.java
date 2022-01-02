/*
@ Author : Noufal MC
@ Date   : 02/02/2022
Create Address Book Using ArrayList


* */
package corejava;

import java.util.Scanner;

class  Contacts
{
    String firstName;
    String lastName;
    String city;
    String address;
    String email;
    long mobile;
    int pincode;
    Contacts(String firstName,String lastName,String city,String address,String email,long mobile,int pincode)
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
    }
}
