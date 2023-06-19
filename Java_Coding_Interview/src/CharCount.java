/*Program to take a string of any number of words 
    and output each word and how many characters it 
    contains in the format "aaaa->#" */

public class CharCount {
    
    public static void main(String[] args) {
     
        String wordToCheck="Hello World";
        
        //find first space in sentence
        int space = wordToCheck.indexOf(" ");
        
        //split sentence into first word and remainder
        String firstWord = wordToCheck.substring(0, space);
        String wordsLeft = wordToCheck.substring(space+1);
        
        //display first word and the number of characters
        System.out.println(firstWord + "->" + firstWord.length());

        //as there may be more that two words in the sentence now split off the remaining words
        while (space >= 0){
            wordToCheck = wordsLeft;
            // find next space
            space = wordToCheck.indexOf(" ");
            // check if there is another space
            if(space > 0){
                firstWord = wordToCheck.substring(0, space);
                wordsLeft = wordToCheck.substring(space+1);
            }
            else {
                firstWord = wordToCheck;
            }
            System.out.println(firstWord + "->" + firstWord.length());
        }
    }
}
