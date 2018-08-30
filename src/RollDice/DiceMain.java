package RollDice;

import RollDice.Console;
import RollDice.PairOfDice;

public class DiceMain {

public static void main (String [] main){
    

    
    Console.displayLine("Welcome to RoleDice Game");
    
    String choice = Console.getString("Roll the dice: y/n: ");
    
    int count = 1;
    while (choice.equalsIgnoreCase("y")){
        
        PairOfDice dice = new PairOfDice(6);
        dice.roll();
        System.out.println("Roll " + count);
        System.out.println(dice.getValue1());
        System.out.println(dice.getValue2());
        
        
        
        if (dice.getSum() == 7){
               Console.displayLine("Craps!");
        }else if (dice.getValue1()==1 && dice.getValue2() == 1){
            Console.displayLine("Snake Eyes!");
            }
        else if (dice.getValue1()==6 && dice.getValue2() == 6){
            Console.displayLine("Box Cards!");
        }
        count++;
        choice = Console.getString("Do you wish to continue: y/n: ");
        System.out.println();
        
        }
    
    

}
    
}
