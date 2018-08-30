package RollDice;

import java.util.Scanner;

public class Console {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void displayLine(){
        System.out.println();
    }
    
    public static void displayLine(String s){
        System.out.println(s);
    }
    
    public static String getString(String prompt){
        System.out.print(prompt);
        String s = sc.nextLine();
        return s;
    }
    
    public static int getInt(String prompt){
        int i = 0;
        boolean isValid = false;
        
        if(!isValid){
            System.out.println(prompt);
            try{
                i = Integer.parseInt(sc.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid entry. Please enter a valid number");
            }
        }
        return i;
    }
    
    public static double getDouble(String prompt){
        double d = 0.0;
        boolean isValid = false;
        if(!isValid){
            System.out.println(prompt);
            try{
            d = Double.parseDouble(sc.nextLine());
            }
            catch(NumberFormatException e){
                System.out.println("Invalid entry, please enter a valid number");
            }
        }
        return d;
    }
}
