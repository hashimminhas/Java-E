package sprint;

public class WordCounter {
    public int countWords(String sentence) {

        if (sentence.length() == 0){
          return 0;
        }
        int wordcount = 0;
        int state = 0;

      for (int i = 0; i < sentence.length() ; i++){
        char ch = sentence.charAt(i);

        if (Character.isLetter(ch)){
          if (state == 0){
            wordcount++;
            state = 1;
            
          }

          
        }else{
          state = 0;
        }
      }
return wordcount;
    }
}