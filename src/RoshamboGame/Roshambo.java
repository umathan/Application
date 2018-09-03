
package RoshamboGame;

    public enum Roshambo {
        ROCK,
        PAPER,
        SCISSORS;
        
        @Override
        public String toString(){
            String s = "";
            if (this.ordinal() == 0)
                s = "rock";
            else if (this.ordinal() == 1)
                s = "paper";
            else if (this.ordinal() == 2)
                s = "scissors";
            return s;
        }
    }
    

