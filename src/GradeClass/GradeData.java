package GradeClass;

public class GradeData {

public static Grade getGrade(int score){
    Grade g = new Grade();
    
    if (score >=88 && score <= 100){
            g.setLetter("A");
        }
        else if (score >=80 && score <=87){
            g.setLetter("B");
        }
        else if (score >=67 && score <= 79){
            g.setLetter("C");
        }
        else if (score >=60 && score <=67 ){
            g.setLetter("D");
        }
        else if (score < 60){
            g.setLetter("F");
        }
        
        
        return g;
}
    
}
