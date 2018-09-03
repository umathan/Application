package RoshamboGame;

public class Player1 extends Player {
    
    public Player1(){
        super();
        super.setName("Bart");
    }
    
    @Override 
    
    public Roshambo generateRoshambo(){
        return Roshambo.ROCK;
    }
    
}
