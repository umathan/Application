package GradeClass;

import java.util.Scanner;

public class GradeMain {
    
    public static void main (String [] args){
        
        System.out.println("Welcome to Score to Grade Converter");
        
        Scanner sc = new Scanner(System.in);
        
        
       
        String choice = "y";
        while (choice.equalsIgnoreCase("y")){
            
            
            System.out.print("Please enter the score");
            int score = sc.nextInt();
              GradeData gd = new GradeData();
            Grade g = gd.getGrade(score);
                             
            if (score <0 && score >100){
                System.out.println("Please enter a valid number");
            }
            else{
                 System.out.println("Letter Grade: " + g.getLetter() ); 
                
            }
            
                  
        
            System.out.println("Do you want to continue: y/n");
            choice = sc.next();
            System.out.println();
        } 
        
    }
    


}
