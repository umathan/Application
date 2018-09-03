package Piglatin;

import java.util.Scanner;
import Piglatin.PigLatinMain;
public class PigLatinMain {
    
    public static void main (String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to PigLatin Translator");
        System.out.println();
        System.out.println("Please enter a sentence");
        String choice = "y";
        while (true){
            String sentence = sc.next();
            
            if (sentence.equals(" ")){
                System.out.println("Please enter a sentence ");
            }else {
                String [] words = sentence.split(" ");
                String pigLatin = "";
                for (String word:words){
                    pigLatin += Translator.pigLatinTranslator(word.toLowerCase()) + " ";
                }
                System.out.println(pigLatin);
            }
            System.out.println();
            System.out.print("Would you like to translate another sentence? y/n");
            choice = sc.nextLine();
            if(! choice.equalsIgnoreCase("y")){
                break;
              }
        
    }
    }
    
    
}