public class CharCount {
    public static void main(String[] args) {
     
        String wordToCheck="Hello World";
        
        int space = wordToCheck.indexOf(" ");
        String firstWord = wordToCheck.substring(0, space);
        String wordsLeft = wordToCheck.substring(space+1);
        
        System.out.println(firstWord + "->" + firstWord.length());
        while (space >= 0){

            wordToCheck = wordsLeft;
            space = wordToCheck.indexOf(" ");
            if(space>0){
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
