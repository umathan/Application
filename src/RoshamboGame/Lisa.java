package RoshamboGame;

public class Lisa extends Player {
    
    private Roshambo rsp;
    
    public Lisa(){
        super();
        super.setName("Lisa");
    }
    
    @Override
    public Roshambo generateRoshambo(){
        int i = (int)(Math.random()*3);
        
        if (i ==0){
            return Roshambo.ROCK;
        }else if(i == 1){
            return Roshambo.PAPER;
        }else {
            return Roshambo.SCISSORS;
        }    
    }
    
}
