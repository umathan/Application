package Piglatin;

public class Translator {
    
    public static String pigLatinTranslator(String word){
        
        char ch = word.charAt(0);
        if (ch == 'a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            word += "way";
        }else{
            if (ch=='y'){
            word += word.substring(1)+ word.charAt(0) + "ay";
        }while (ch !='a' && ch!='e'&& ch!='i' && ch!='o' && ch!='u' && ch!='y'){
           word =  word.substring(1);
           word += ch;
           ch = word.charAt(0);
        }
        word += "ay";
    
       } 
        return word;
    
    

}
}
