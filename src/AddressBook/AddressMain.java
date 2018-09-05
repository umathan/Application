package AddressBook;

import java.util.ArrayList;

public class AddressMain {

private static final int COLUMN_WIDTH = 20;

public static void main (String [] args){
    
    System.out.println("Welcome to the AddressBook Application");
    System.out.println();
    
    int menuNumber = 0;
    while (menuNumber !=3){
        System.out.println("1 --> List entries");
        System.out.println("2 --> Add entry");
        System.out.println("3 --> Exit");
        
        menuNumber = Console.getInt("Enter one menu Number: ", 0, 4);
        System.out.println();
        
        switch(menuNumber){
            case 1:{
                ArrayList<Address>entries = AddressBookIO.getEntries();
                String entriesString;
                entriesString = StringUtil.pad("Name", COLUMN_WIDTH)
                        + StringUtil.pad("Email", COLUMN_WIDTH)
                        + StringUtil.pad("Phone", COLUMN_WIDTH)+ "\n";
                
                entriesString += StringUtil.pad("---------", COLUMN_WIDTH)
                        + StringUtil.pad("---------", COLUMN_WIDTH)+
                        StringUtil.pad("---------", COLUMN_WIDTH)
                        + "\n";
                
                for (Address entry : entries){
                    entriesString += StringUtil.pad(entry.getName(), COLUMN_WIDTH)
                           + StringUtil.pad(entry.getEmailAddress(), COLUMN_WIDTH)+
                            StringUtil.pad(entry.getPhoneNumber(), COLUMN_WIDTH) +"\n";
                }
                System.out.println(entriesString);
                break;
            }
            case 2:{
                String name = Console.getRequiredString("Enter Name: ");
                String emailAddress = Console.getRequiredString("Enter Email Address: ");
                String phoneNumber = Console.getRequiredString("Enter Phone Number: ");
                
                Address entry = new Address();
                entry.setName(name);
                entry.setEmailAddress(emailAddress);
                entry.setPhoneNumber(phoneNumber);
                
                AddressBookIO.saveEntry(entry);
                
                System.out.println();
                System.out.println("This entry has been saved\n");
                
                break;
        }
        case 3: {
        System.out.println("GoodBye! \n");
        break;
    }
    }
    }
    
}
       
    
}
