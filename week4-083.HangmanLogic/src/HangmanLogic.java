
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        // program here the functionality for making a guess

        // if the letter has already been guessed, nothing happens
        if((!guessedLetters.contains(letter))){
          this.guessedLetters+=letter;
          if(!word.contains(letter)){
              this.numberOfFaults++;
          }


        }


        // it the word does not contains the guessed letter, number of faults increase
        // the letter is added among the already guessed letters
    }

    public String hiddenWord() {
        // program here the functionality for building the hidden word

        // create the hidden word by interating through this.word letter by letter
        // if the letter in turn is within the guessed words, put it in to the hidden word
        // if the letter is not among guessed, replace it with _ in the hidden word 

        // return the hidden word at the end
        String hiddenWord="";
        int hiddenWordLength=this.word.length();
        int count=0;
        char[] guessedlettersArr=this.guessedLetters.toCharArray();

        while (count<hiddenWordLength){
            hiddenWord+="_";
            count++;
        }
       char[] hiddenWordCharArr=hiddenWord.toCharArray();
        char[] wordCharArr=word.toCharArray();
        for(int i=0;i<guessedlettersArr.length;i++){
            for(int j=0;j<wordCharArr.length;j++){
                if(guessedlettersArr[i]==wordCharArr[j]){
                    hiddenWordCharArr[j]=guessedlettersArr[i];

                }
            }
        }

           hiddenWord= hiddenWord.copyValueOf(hiddenWordCharArr);



        return hiddenWord;
    }
}
