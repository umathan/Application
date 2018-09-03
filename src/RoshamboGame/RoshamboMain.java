
package RoshamboGame;

public class RoshamboMain {

    public static void main (String [] args){
      
        System.out.println("Welcome to Roshambo Game!!!");
        
       String name = Console.getRequiredString("Please enter your name: ");
       Player1 player1 = new Player1();
       player1.setName(name);
       
       
       Player player2 = null;
       String opponent = Console.getChoice("Would you like to play with Bart or Lisa(b/l)", "b", "l");
       if (opponent.equalsIgnoreCase("b")){
           player2 = new Bart();
       }else if (opponent.equalsIgnoreCase("l")){
           player2 = new Lisa();
         
       }
       
       String choice = "s";
       while (true){
       
       String selection = Console.getChoice("Rock, Paper, Scissors(r/p/s)", "r", "p", "s");
       
       switch(selection){
           case "r":
               player1.setRoshambo(Roshambo.ROCK);
               break;
           case "p":
               player1.setRoshambo(Roshambo.PAPER);
               break;
           case "s":
               player1.setRoshambo(Roshambo.SCISSORS);
               break;
       }
        
       Roshambo rsp = player2.generateRoshambo();
       player2.setRoshambo(rsp);
       
        System.out.println(player1.getName() + ":" + player1.getRoshambo());
        System.out.println(player2.getName() + ":" + player2.getRoshambo());
        
        play(player1, player2);
        
        choice = Console.getChoice("Do you like to continue? y/n", "y", "n");
        
    
    }
    }
    
    private static void play(Player player1, Player player2){
        if(player1.getRoshambo()== player2.getRoshambo()){
            System.out.println("Draw!");
        }else if((player1.getRoshambo() == Roshambo.ROCK
            && player2.getRoshambo()== Roshambo.SCISSORS)
             ||  (player1.getRoshambo() == Roshambo.PAPER
              && player2.getRoshambo()== Roshambo.ROCK)
                || (player1.getRoshambo()== Roshambo.SCISSORS)
                && player2.getRoshambo() == Roshambo.PAPER){
            System.out.println(player1.getName() + " wins");
        }else {
            System.out.println(player2.getName() + " wins");
        }
    
    }
    
}
