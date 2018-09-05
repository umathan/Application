
package SmallPro;

import java.util.Scanner;


public class TravelTime {
    
public static void main (String [] args){
    
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Welcome to the Travel Time Calculator");
    System.out.println();
    String choice = "y";
    
    while (choice.equalsIgnoreCase("y")){
        
        System.out.print("Enter miles: ");
        double distance = sc.nextDouble();
        
        System.out.print("Enter miles per hour: ");
        double speed = sc.nextDouble();
        
        double hours = (distance/speed);
        double  hourInMinutes = (hours*60);
        int travelHours = (int) (hourInMinutes/60);
        int travelMinutes  = (int)(hourInMinutes%60);
        
        
        System.out.print("Estimated Travel Time");
        System.out.println();
        System.out.println("Hours:  " + travelHours);
        System.out.println("Minutes: " + travelMinutes);
        
        System.out.println("Do you wish to continue: y/n");
        choice = sc.next();
        System.out.println();
        
    }
    
    
}
    
}
