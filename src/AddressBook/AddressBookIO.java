package AddressBook;

import java.io.*;
import java.util.ArrayList;

public class AddressBookIO {
    
    private static File addressFile = new File("address_book.txt");
    private static final String FIELD_SEPERATOR = "\t";
    
    public static ArrayList<Address> getEntries(){
        BufferedReader in = null;
        try{
            checkFile();
            
            in = new BufferedReader(
                    new FileReader(addressFile));
            
            ArrayList<Address> entries = new ArrayList<>();
            String line = in.readLine();
            while (line != null){
                String[] columns = line.split(FIELD_SEPERATOR);
                String name = columns[0];
                String emailAddress = columns[1];
                String phoneNumber = columns[2];
                
                Address entry = new Address();
                entry.setName(name);
                entry.setEmailAddress(emailAddress);
                entry.setPhoneNumber(phoneNumber);
                entries.add(entry);
                
                line = in.readLine();
            }
            return entries;
        }
                 catch(IOException e){
                         System.out.println(e);
                         return null;
                         }
                 finally{
                         close(in);
                         }
    }       

    public static boolean saveEntry(Address entry){
     
        PrintWriter out = null;
        try{
            checkFile();
            
            out = new PrintWriter(
                    new BufferedWriter(
                        new FileWriter(addressFile, true)));
            out.print(entry.getName() + FIELD_SEPERATOR);
            out.print(entry.getEmailAddress() +FIELD_SEPERATOR);
            out.print(entry.getPhoneNumber() + FIELD_SEPERATOR);  
            out.println();
            
    }
        catch(IOException e){
            System.out.println(e);
            return false;
        }
        finally{
            close(out);
        }
        return true;
        }
        
    private static void checkFile() throws IOException{
        
            if(!addressFile.exists()){
            addressFile.createNewFile();
        }
        }
    
    private static void close(Closeable stream){
        try{
            if(stream != null){
                stream.close();
            }
       }catch(IOException e){
            System.out.println(e);
       }
    }
    
    
    
}

    

