package corejava;
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
