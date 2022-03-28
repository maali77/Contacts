public class Contact {
    private String name;
    private String phoneNumber;

    public Contact(String name, String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
    public String getName(){
        return name;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public static Contact createContact(String name, String phoneNumber){
        return new Contact(name, phoneNumber); // won't have to create a new instance of Contact in main or another class

    }

}
