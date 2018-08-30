package RollDice;

public class Die {
    private int value;
    private int sides;
    
    public Die(){
        this.sides = 6;
        this.value = 1;
    }
    
    public Die(int sides){
        this.sides = sides;
        this.value = 1;
            }
    
    public void roll(){
        value = (int)((Math.random())*sides);
        value++;
        
    }
    public int getValue(){
        
        return value;
    }
    
}
