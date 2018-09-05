package SmallPro;

import java.util.Scanner;

public class NumberGradesToLetterGrades {
    
public static void main (String [] args){
    
    System.out.println("Welcome to Letter Grade Converter");
    Scanner sc = new Scanner(System.in);
    
    String choice = "y";
    while (choice.equalsIgnoreCase("y")){
        
        System.out.print("Numberical Grade: ");
        
        int nGrade = sc.nextInt();
        
        if(nGrade <0 || nGrade > 100){
            System.out.println("Please enter a number between 0 and 100");
        }
        else{
        
                if(nGrade >= 88 && nGrade <=100){
                        System.out.println("Letter Grade: A");
                }
                else if(nGrade >= 80 && nGrade <=87){
                     System.out.println("Letter Grade: B");
                }
                else if(nGrade >=67 && nGrade <=79){
                    System.out.println("Letter Grade: C");
                }
                else if (nGrade >= 60 && nGrade <= 66){
                    System.out.println("Letter Grade: D");
                }
                else if(nGrade < 60){
                System.out.println("Letter Grade: Improve");
                }
        }
        System.out.println("Do you want to continue: y/n");
        choice = sc.next();
        System.out.println();
        }
               
        
    }
    
    }
    

