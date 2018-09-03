package RoshamboGame;

public abstract class Player {
    public String name;
    public Roshambo rsp;
    
    public Player(){
        name = "";
    }
        
   public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Roshambo getRoshambo() {
        return rsp;
    }

    public void setRoshambo(Roshambo rsp) {
        this.rsp = rsp;
    }
    
     public abstract Roshambo generateRoshambo();
    
}
