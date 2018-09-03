
package Customer;

public class CustomerDB {
    
 
    public static Customer getCustomer(int customerNumber){
        
        Customer c = new Customer();
        if (customerNumber == 1001){
            c.setFirstName("Barbara");
            c.setLastName("White");
            c.setAddress("344 Richmond Parkway #3423");
            c.setCity("Bristol");
            c.setState("CT");
            c.setPostalCode(06010);
        }
        else if (customerNumber == 1002){
            c.setFirstName("Karl");
            c.setLastName("Vang");
            c.setAddress("327 Franklin Street");
            c.setCity("Edina");
            c.setState("MN");
            c.setPostalCode(55435);
        }else if (customerNumber == 1003){
            c.setFirstName("Ronda");
            c.setLastName("Chavan");
            c.setAddress("518 Commanche Dr");
            c.setCity("Greensboro");
            c.setState("NC");
            c.setPostalCode(27410);
        }else
        {
            return null;
        }
        
        return c;
    }
}
    
    
        
            
            
    
    
    
    

